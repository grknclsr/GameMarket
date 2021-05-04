package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalityId().length() == 11) {
			System.out.println("Kimlik do�rulama ba�ar�l�");
			return true;
		}else {
			System.out.println("Kimlik do�rulama ba�ar�s�z");
			return false;
		}
	}
	
}
