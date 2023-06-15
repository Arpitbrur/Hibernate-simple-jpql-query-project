package hibernate_simple_jpql_query_project.service;

import hibernate_simple_jpql_query_project.dao.LaptopDao;
import hibernate_simple_jpql_query_project.dto.Laptop;

public class LaptopService {

	LaptopDao dao = new LaptopDao();
	
	// Insert Laptop ----------------------------------------------------------------------------------------
	public void insertLaptop(Laptop laptop) {
		if(dao.insertLaptop(laptop)==1) {
			System.out.println("Data inserted Succcessfully");
		}else {
			System.out.println("Data not saved in database, you have passed wrong parameter");
		}
	}
}
