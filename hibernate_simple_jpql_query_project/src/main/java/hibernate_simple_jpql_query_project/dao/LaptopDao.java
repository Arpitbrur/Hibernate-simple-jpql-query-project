package hibernate_simple_jpql_query_project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_simple_jpql_query_project.dto.Laptop;

public class LaptopDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("arpit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	// Insert Laptop ----------------------------------------------------------------------------------------
	public int insertLaptop(Laptop laptop) {
		String insertQuery = "INSERT INTO Laptop(laptopId,laptopName,laptopPrice) VALUES (?,?,?)";
		Query query = entityManager.createNativeQuery(insertQuery);
		
		query.setParameter(1, laptop.getLaptopId());
		query.setParameter(2, laptop.getLaptopName());
		query.setParameter(3, laptop.getLaptopPrice());
		
		entityTransaction.begin();
		int feedback = query.executeUpdate();
		entityTransaction.commit();
		
		return feedback;
	}
	
	// getByLaptopId------------------------------------------------------------------------------------------
	public Laptop getByLaptopId(int laptopId) {
		
		String getByIdQuery = "SELECT L FROM Laptop L WHERE L.laptopId=:eid";
		
		Query query = entityManager.createQuery(getByIdQuery);
		if(query != null) {
			query.setParameter("eid", laptopId);
			
			Object object = query.getSingleResult();
			
			Laptop laptop = (Laptop) object;
			return laptop;
		}else {
			return null;
		}
	}
	
	// update Laptop--------------------------------------------------------------------------------------------
	public int updatelaptop(Laptop laptop) {
		String updateQuery = "UPDATE Laptop L SET L.laptopName=:lname, L.laptopPrice=:lprice WHERE L.laptopId=:eid";
		
		Query query = entityManager.createNativeQuery(updateQuery);
		
		query.setParameter("eid", laptop.getLaptopId());
		query.setParameter("lname", laptop.getLaptopName());
		query.setParameter("lprice", laptop.getLaptopPrice());
		
		entityTransaction.begin();
		int feedback = query.executeUpdate();
		entityTransaction.commit();
		return feedback;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
