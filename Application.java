import java.util.Scanner;


public class Application{
	public static void main(String[] args){
		
		Vending vending = new Vending();
		Scanner scan = new Scanner(System.in);

		System.out.println("\t Welcome to the Vending Machine! Press any key to roll or type <quit> to close the app");

		while (!scan.nextLine().equals("quit")){
			Toy toy = vending.giveItem();

			if (toy == null){
				System.out.println("You got nothing");
			}
			else{
				System.out.println("You get: " + toy.getToyName());
			}
		}

		scan.close();
	}
}
