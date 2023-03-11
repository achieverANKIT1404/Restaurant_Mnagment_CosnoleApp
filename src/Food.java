import java.util.Scanner;

public class Food {

	public String name;
	public float price;
	
	public Food() {
		super();
	}

	public Food(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	public void input(){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter name of food : ");
		name = obj.nextLine();
		
		System.out.println("Enter price of food : ");
		price = obj.nextFloat();
	}
	
	public void payment(){
		
		System.out.println("Price = "+price);
	}
	
	public String detail(){
		
		return name+" "+price;
	}
	
	
}
