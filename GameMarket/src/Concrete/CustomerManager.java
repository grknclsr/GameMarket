package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{
	CustomerCheckService checkService;
	public CustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	@Override
	public void add(Customer customer) {
		if (checkService.checkIfRealPerson(customer) == true) {
			System.out.println("Sisteme kayýt olundu  : " + customer.getFirstName());
		}else {
			System.out.println("Kayýt olma baþarýsýz!");
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi  : " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri bilgileri düzenlendi  : " + customer.getFirstName());
		
	}

}
