import java.util.ArrayList;
import java.util.Scanner;

public class GuestOrder {

	public String tableId;
	public float totalPayment;
	
	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public float getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(float totalPayment) {
		this.totalPayment = totalPayment;
	}

	public void setList(Food food){
		
		list.add(food);
	}
	
	ArrayList<Food> list = new ArrayList<>();
	
    public void input(){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter table no : ");
		tableId = obj.nextLine();	
	}

    public void print(){
    	
    	System.out.println("---------------------------------------");
    	System.out.println("Table No : "+this.tableId+" Total Payment : "+this.totalPayment);
    	
    	for(Food f : this.list){
    		
    		System.out.println("Selected food is : "+f.name);
    	}
    	System.out.println();
    }
   
}
