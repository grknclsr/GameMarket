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
			System.out.println("Sisteme kay�t olundu  : " + customer.getFirstName());
		}else {
			System.out.println("Kay�t olma ba�ar�s�z!");
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi  : " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri bilgileri d�zenlendi  : " + customer.getFirstName());
		
	}

}
