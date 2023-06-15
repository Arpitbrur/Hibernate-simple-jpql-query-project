package hibernate_simple_jpql_query_project.controller;

import java.util.Scanner;

import hibernate_simple_jpql_query_project.dto.Laptop;
import hibernate_simple_jpql_query_project.service.LaptopService;

public class LaptopController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Laptop laptop = new Laptop();
		LaptopService laptopService = new LaptopService();
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1. Insert\n2. Search\n3. Update\n4. Delete\n5. Display\n6. Exit");
			int ch = scanner.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter laptopId");
				laptop.setLaptopId(scanner.nextInt());
				System.out.println("Enter laptopName");
				laptop.setLaptopName(scanner.next());
				System.out.println("Enter laptopPrice");
				laptop.setLaptopPrice(scanner.nextDouble());
				
				laptopService.insertLaptop(laptop);
			}break;
			
			
			}

		}
	}
}
