public class Toy {

	private int toyID;
	private String toyName;
	private int toyAmount;
	private double dropFrequency;

	//Toy constructor
	public Toy(int toyID, String toyName, int toyAmount, double dropFrequency){
		this.toyID = toyID;
		this.toyName = toyName;
		this.toyAmount = toyAmount;
		this.dropFrequency = dropFrequency;
	}


	//Add new toy
	public Toy newToy(int toyID, String toyName, int toyAmount, double dropFrequency){
		return new Toy(toyID, toyName, toyAmount, dropFrequency);
	}

	//Vending
	

	//Getters
	public int getToyID(){
		return toyID;
	}

	public String getToyName(){
		return toyName;
	}

	public int getToyAmount(){
		return toyAmount;
	}

	public double getDropFrequency(){
		return dropFrequency;
	}

	//Set drop frequency
	public void setDropFrequency(double dropFrequency){
		this.dropFrequency = dropFrequency;
	}

	//Set toys amount
	public void setToysAmount(int toyAmount){
		this.toyAmount = toyAmount;
	}

	@Override
	public String toString() {
		return toyID + " " + toyName + " " + toyAmount; 
	}

}
