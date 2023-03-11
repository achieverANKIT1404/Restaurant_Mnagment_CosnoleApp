import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {

	ArrayList<Food> foodlist =  new ArrayList<>();
	ArrayList<GuestOrder> guestorder = new ArrayList<>();
	
	public Food food;
	public GuestOrder order;
	public  int SelectedFood;
	
	public ManageFood(){
		
	}
	
	Scanner obj = new  Scanner(System.in);
	
	public void obj(){
		
		System.out.println("Enter no of food add in menu : ");
		int n = Integer.parseInt(obj.nextLine());
		
		for(int i=0;i<n;i++){
			
			Food food =  new Food();
			food.input();
			foodlist.add(food);
		}
	}
	
	public void print(){
		
		for(int i=0;i<foodlist.size();i++){
			
			System.out.println((i+1)+" "+foodlist.get(i).detail());
		}
	}
	
	public void price(){
		
		float priceFood = 0;
		float totalPayment = 0;
		int num;
		
		GuestOrder guest = new GuestOrder();
		guest.input();
		guestorder.add(guest);
		
		for(int i=0;i<10;i++){
			
			System.out.println("Selected food : "+(i+1));
			SelectedFood = obj.nextInt();
			
			if(SelectedFood==0){
				
				guest.setTotalPayment(totalPayment);
				System.out.println("Total Payment : "+totalPayment);
				System.out.println("Thank You, for visit see you again!");
				break;
				
			}else{
				
				System.out.println("Enter No : ");
				num = obj.nextInt();
				
				Food food = foodlist.get(SelectedFood-1);
				guest.setList(food);
				priceFood = food.price*num;
			}
			
			totalPayment += priceFood;
			System.out.println("Order Complete");
			System.out.println("Payment : "+(i+1)+" is "+priceFood);
			System.out.println("Order Complete Enter 0");
		}
	}
	public void printOrder(){
		
		for(int i=0;i<guestorder.size();i++){
			
			guestorder.get(i).print();
		}
	}
	 public void search(){
	    	
			Scanner obj = new Scanner(System.in);

	    	String tableId;
	    	int up=0;
	    	
	    	System.out.println("Enter table no of payment : ");
	    	tableId = obj.nextLine();
	    	
	    	for(int i=0;i<guestorder.size();i++){
	    		
	    		if(guestorder.get(i).getTableId().equalsIgnoreCase(tableId)){
	    			
	    			guestorder.get(i).print();
	    			up++;
	    		}
	    	}
	    	if(up==0){
	    		
	    		System.out.println(tableId+" table no not avialable");
	    	}
	    }
	 
	 public String editName(){
		 
		 System.out.println("Enter food name : ");
		 return obj.nextLine();
	 }
	 
	 public float editPrice(){
		 
		 System.out.println("Enter food price : ");
		 return obj.nextFloat();
	 }
	 
	 public void editFood(){
		 
		 String foodName;
		 int up=0;
		 
		 System.out.println("Enter name of food, You wan't edit : ");
		 foodName = obj.nextLine();
		 
		 for(int i=0;i<foodlist.size();i++){
			 
			 if(foodlist.get(i).getName().equals(foodName)){
				 
				 up++;
				 foodlist.get(i).setName(editName());
				 foodlist.get(i).setPrice(editPrice());			 
				 break; 
			 }
		 }
		 if(up==0){
			 
			 System.out.println("Food name is "+foodName);
		 }
	 }
	 public void deleteFood(){
		 
		 String deleteFood;
		 int up=0;
		 
		 System.out.println("Enter name of food to delete : ");
		 deleteFood = obj.nextLine();

	 for(int i=0;i<foodlist.size();i++){
			 
			 if(foodlist.get(i).getName().equals(deleteFood)){
				 
				 up++;
				 foodlist.remove(i);
				 System.out.println("Food deleted succesfully");
				 break; 
			 }
		 }
	 if(up==0){
		 
		 System.out.println("Food name is "+deleteFood);
	 }	 
	 }
}
