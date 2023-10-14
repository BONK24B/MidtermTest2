import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vending{
	
	List<Toy> toyList = new ArrayList<>();
	Toy teddy = new Toy(1, "Teddy Bear", 3, 0.4);
	Toy car = new Toy(2, "Car", 5, 0.6);
	Toy lego = new Toy(3, "Lego set", 1, 0.1);
	Toy amogus = new Toy(4, "Amogus Pop It", 6, 0.7);
	Toy sword = new Toy(5, "Super Ultra Cool Sword", 1, 0.01);
	
	public Vending(){
		toyList.add(teddy);
		toyList.add(car);
		toyList.add(lego);
		toyList.add(amogus);
		toyList.add(sword);
	}

	public Toy giveItem(){
		Random rand = new Random();

		for (Toy toy : toyList){
			if (rand.nextInt() <= toy.getDropFrequency()){
				toy.setToysAmount(toy.getToyAmount() - 1);
				if (toy.getToyAmount() <= 0)
					toyList.remove(toy);
				return toy;
			}
		}
		return null;
	}

	
}

