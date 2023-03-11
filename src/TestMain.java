import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		ArrayList<Food> foodlist =  new ArrayList<>();

		ManageFood mf = new ManageFood();
		
		int select;
		
		Scanner obj = new Scanner(System.in);
		do{
			
			mainMenu();
			select = Integer.parseInt(obj.nextLine());
			
			switch (select) {
			case 1:
				do{
					
					manageFoodMenu();
					select = Integer.parseInt(obj.nextLine());
					
					switch (select) {
					case 1:
						mf.obj();
						break;
						
					case 2:
						mf.print();
						mf.editFood();
						break;
						
					case 3:
						mf.print();
						mf.deleteFood();
						break;

					case 4:
						mf.printOrder();
						break;
						
					case 5:
						mf.search();
						break;
						
					default:
						break;
					}
				}while(select!=3);
				break;
				
			case 2:
               do{
					
					orderMenu();
					select = Integer.parseInt(obj.nextLine());
					
					switch (select) {
					case 1:
						mf.print();
						mf.price();
						break;
						
					case 0:
					System.out.println("Back");
						break;
						
					default:
						break;
					}
				}while(select!=0);
				break;
			
				default:
					break;
				}
		}while(select!=3);
		
		
		
       }
		static void manageFoodMenu(){
			
			System.out.println("----------------------|MANAGE FOOD MENU|---------------------");
			System.out.println("0) Back to main menu");
			System.out.println("1) Add Food");
			System.out.println("2) Edit Food");
			System.out.println("3) Delete Food");
			System.out.println("4) Print table order info");
			System.out.println("5) Payment");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Select");
		}
	
		static void orderMenu(){
			
			System.out.println("----------------------|ORDER MENU|---------------------");
			System.out.println("0) Back to main menu");
			System.out.println("1) Print food menu and order");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Select");
		}
		
		static void mainMenu(){
			
			System.out.println("----------------------|MENU|---------------------");
			System.out.println("1) Manage Food");
			System.out.println("2) Manage Orders");
			System.out.println("3) Exit");
	
		 }
	
}
