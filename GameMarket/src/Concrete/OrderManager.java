package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class OrderManager implements OrderService{

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " nolu sipari�iniz sepete eklendi.");
		
	}

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() + " isimli kullan�c� " + game.getGameName() +" oyununu " + campaign.getName() +" kampanyas�ndan "
	+ campaign.getDiscount() + " oran�nda bir indirim ile " + (game.getPrice()-(game.getPrice()*campaign.getDiscount())) + " TL fiyat� ile sat�n ald�.");
		
	}

}
