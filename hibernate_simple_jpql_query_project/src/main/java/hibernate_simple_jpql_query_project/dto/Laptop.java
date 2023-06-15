package hibernate_simple_jpql_query_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Laptop {

	@Id
	private int laptopId;
	private String laptopName;
	private double laptopPrice;
	
	
}
