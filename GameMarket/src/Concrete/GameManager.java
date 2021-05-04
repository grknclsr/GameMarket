package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ekleme baþarýlý : "+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : "+ game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun bilgileri güncellendi : "+ game.getGameName());
		
	}

}
