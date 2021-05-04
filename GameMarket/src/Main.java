import java.util.GregorianCalendar;

import Concrete.CampaignManager;
import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Gürkan");
		customer1.setLastName("Çalýþýr");
		customer1.setNationalityId("11111111111");
		customer1.setDateOfBirth(new GregorianCalendar(2000,02,16).getTime());
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Öðrenci Ýndirimi");
		campaign1.setDiscount(0.12);
		campaign1.setStatus(true);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Wolftiim");
		game1.setPrice(20);
		
		Order order1 = new Order();
		order1.setId(1);
		order1.setCustomerId(1);
		order1.setCampaignId(1);
		order1.setGameId(1);
		order1.setDate(new GregorianCalendar(2021,05,04).getTime());
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		OrderManager orderManager1 = new OrderManager();
		orderManager1.add(order1);
		orderManager1.buy(customer1, game1, campaign1);
		
		customerManager.update(customer1);
		customerManager.delete(customer1);

	}

}
