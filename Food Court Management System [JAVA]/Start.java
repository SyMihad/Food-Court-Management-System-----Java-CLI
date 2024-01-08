import java.lang.*;
import java.util.Scanner;
import fileio.*;
import classes.*;
import java.io.IOException;

public class Start{
	public static void main(String[]args){
		boolean repeat=true;
		String forDelay;
		Scanner input = new Scanner(System.in);
		FileReadWriteDemo file = new FileReadWriteDemo();

		FoodCourt foodcourt = new FoodCourt();

		
		System.out.println();
		System.out.println("------------Welcome to Food Court Managament System------------");
		while(repeat){
		System.out.println();
		System.out.println("1. Employee Management");
		System.out.println("2. Restaurant Management");
		System.out.println("3. Restaurant FoodItem Management");
		System.out.println("4. FoodItem Quantity Add-Sell");
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		switch(choice){
			case 1:
				boolean repeat1=true;
				while(repeat1){
				Start.clrscr();
				System.out.println();
				System.out.println("------------Employee Management------------");
				System.out.println();
				System.out.println("1. Insert New Employee");
				System.out.println("2. Remove Existing Employee");
				System.out.println("3. Show All Employees");
				System.out.println("4. Search an Employee");
				System.out.println("5. Go Back");
				System.out.println();
				System.out.print("Enter your option:");
				int option1 = input.nextInt();
				System.out.println();
				switch(option1){
					case 1:
						Start.clrscr();
						System.out.println("------------Insert New Employee------------");
						System.out.println();
						System.out.print("Enter Employee Name: ");
						String empName = input.next();
						System.out.print("Enter Employee ID: ");
						String empid1 = input.next();
						Employee forInsertEmp = foodcourt.searchEmployee(empid1);
						if(forInsertEmp==null){
						System.out.print("Enter Salary: ");
						double empSalary = input.nextDouble();
						Employee emp1 = new Employee(empName, empid1, empSalary);
						if(foodcourt.insertEmployee(emp1)){
							System.out.println("Employee ID "+emp1.getEmpId()+" inserted.");
							Start.pressEnterToContinue();
						}
						else{
							System.out.println("Opps! Something is wrong.");
							Start.pressEnterToContinue();
						}
						}
						else{
							System.out.println("Please enter a unique ID Number");
							Start.pressEnterToContinue(); 
						}
						break;
					case 2:
						Start.clrscr();
						System.out.println("------------Remove Existing Employee------------");
						System.out.println();
						System.out.print("Enter Employee ID: ");
						String empid2 = input.next();
						Employee emp2 = foodcourt.searchEmployee(empid2);
						if(emp2!=null){
							if(foodcourt.removeEmployee(emp2)){
								System.out.println("Employee ID "+empid2+" removed.");
								Start.pressEnterToContinue();
							}
							else{
								System.out.println("Opps! Something Wrong.");
								Start.pressEnterToContinue();    
							}
						}
						else{
							System.out.println("No such Employee found.");
							Start.pressEnterToContinue();
						}
						break;
					case 3:
						Start.clrscr();
						System.out.println("------------Show All Employees------------");
						System.out.println();
						foodcourt.showAllEmployees();
						Start.pressEnterToContinue();
						break;
					case 4:
						Start.clrscr();
						System.out.println("------------Search an Employee------------");
						System.out.println();
						System.out.print("Enter Employee ID:");
						String empid3 = input.next();
						Employee emp3 = foodcourt.searchEmployee(empid3);
						if(emp3!=null){
							System.out.println();
							System.out.println("Employee Found");
							System.out.println();
							System.out.println("Employee Name: "+emp3.getName());
							System.out.println("Employee ID: "+emp3.getEmpId());
							System.out.println("Salary: "+emp3.getSalary());
							System.out.println();
						}
						else{System.out.println("No Employee Found!");}
						Start.pressEnterToContinue();
						break;
					case 5:
						Start.clrscr();
						System.out.println();
						System.out.println("------------Going Back to Main Menu------------");
						System.out.println();
						repeat1=false;
						break;
					default:
						System.out.println();
						System.out.println("Opps! Your choice is invalid.");
						break;

				}
				}
				break;

			case 2:
				boolean repeat2=true;
				while(repeat2){
				Start.clrscr();
				System.out.println();
				System.out.println("------------Restaurant Management------------");
				System.out.println();
				System.out.println("1. Insert New Restaurant");
				System.out.println("2. Remove Existing Restaurant");
				System.out.println("3. Show All Restaurants");
				System.out.println("4. Search a Restaurant");
				System.out.println("5. Go Back");
				System.out.println();
				System.out.print("Enter your option:");
				int option2 = input.nextInt();
				System.out.println();
				switch(option2){
					case 1:
						Start.clrscr();
						System.out.println("------------Insert New Restaurant------------");
						System.out.println();
						System.out.print("Enter Restaurant ID: ");
						String idres1 = input.next();
						Restaurant forInsertRes = foodcourt.searchRestaurant(idres1);
						if(forInsertRes==null){
							System.out.print("Enter Restaurant Name: ");
							String nameRes = input.next();
							Restaurant res1 = new Restaurant();
							res1.setName(nameRes);
							res1.setRid(idres1);
							if(foodcourt.insertRestaurant(res1)){
								System.out.println();  
								System.out.println("Restaurant ID "+idres1+" inserted.");
								Start.pressEnterToContinue();
							}
							else{
								System.out.println("Opps! Something went wrong.");
								Start.pressEnterToContinue();
							}	
						}
						else{
							System.out.println("Please enter an unique Restaurant ID.");
							Start.pressEnterToContinue();
						}
						break;
					case 2:
						Start.clrscr();
						System.out.println("------------Remove Existing Restaurant------------");
						System.out.println();
						System.out.print("Enter Restaurant ID:");
						String idres2 = input.next();
						Restaurant res2 = foodcourt.searchRestaurant(idres2);
						if(res2 != null){
						if(foodcourt.removeRestaurant(res2)){
							System.out.println();
							System.out.println("Restaurant ID "+idres2+" removed.");
							System.out.println();
							Start.pressEnterToContinue();
						}
						else{
							System.out.println("Opps! Something Went Wrong.");
							Start.pressEnterToContinue();
						}
						}
						else{
							System.out.println("No such Restaurant found!");
							Start.pressEnterToContinue();
						}
						break;
					case 3:
						Start.clrscr();
						System.out.println("------------Show All Restaurant------------");
						System.out.println();
						foodcourt.showAllRestaurants();
						System.out.println();
						Start.pressEnterToContinue();
						break;
					case 4:
						Start.clrscr();
						System.out.println("------------Search a Restaurant------------");
						System.out.println();
						System.out.print("Enter Restaurant ID: ");
						String idres3 = input.next();
						Restaurant res3 = foodcourt.searchRestaurant(idres3);
						if(res3!=null){
							System.out.println();
							System.out.println("Restaurant found.");
							System.out.println();
							System.out.println("Restaurant ID: "+res3.getRid());
							System.out.println("Restaurant Name: "+res3.getName());
							System.out.println();
							Start.pressEnterToContinue();
						}
						else{
							System.out.println("No such Restaurant found!");
							Start.pressEnterToContinue();
						}
						break;
					case 5:
						Start.clrscr();
						System.out.println("------------Going Back to Main Menu------------");
						repeat2=false;
						break;
					default:
						System.out.println();
						System.out.println("Opps! Your choice is invalid.");
						Start.pressEnterToContinue();
						break;

				}
				}
				break;

			case 3:
				boolean repeat3=true;
				while(repeat3){
				Start.clrscr();
				System.out.println();
				System.out.println("------------Restaurant FoodItem Management------------");
				System.out.println();
				System.out.println("1. Insert New FoodItem");
				System.out.println("2. Remove Existing FoodItem");
				System.out.println("3. Show All FoodItems");
				System.out.println("4. Search a FoodItem");
				System.out.println("5. Go Back");
				System.out.println();
				System.out.print("Enter your option:");
				int option3 = input.nextInt();
				System.out.println();
				switch(option3){
					case 1:
						Start.clrscr();
						System.out.println("------------Insert New Fooditem------------");
						System.out.println();
						System.out.println("There are two types of Food Item:");
						System.out.println("1. Main Dish");
						System.out.println("2. Appitizers");
						System.out.println("3. Go Back");
						System.out.println();
						System.out.print("Enter your choice:");
						int choice1 = input.nextInt();
						FoodItem foodItem = null;
						if(choice1==1){
							Start.clrscr();
							System.out.println();
							System.out.println("------------Main Dish------------");
							System.out.println();
							System.out.print("Enter Food Item ID: ");
							String idfood1 = input.next();
							System.out.print("Enter Food Item Name: ");
							String nameFood1 = input.next();
							System.out.print("Enter Category: ");
							String category = input.next();
							System.out.print("Enter Available Quantity: ");
							int quantity1 = input.nextInt();
							System.out.print("Enter Price: ");
							double price1 = input.nextDouble();
							MainDish main1 = new MainDish(idfood1, nameFood1, quantity1, price1, category);
							foodItem = main1 ;
						}
						else if(choice1==2){
							Start.clrscr();
							System.out.println();
							System.out.println("------------Appitizers------------");
							System.out.println();
							System.out.print("Enter Food Item ID: ");
							String idfood2 = input.next();
							System.out.print("Enter Food Item Name: ");
							String nameFood2 = input.next();
							System.out.print("Enter Size: ");
							String size = input.next();
							System.out.print("Enter Available Quantity: ");
							int quantity2 = input.nextInt();
							System.out.print("Enter Price: ");
							double price2 = input.nextDouble();
							Appitizers apt1 = new Appitizers(idfood2, nameFood2, quantity2, price2, size);
							foodItem = apt1 ;
						}
						else if(choice1==3){
							Start.clrscr();
							System.out.println();
							System.out.println("------------Going Back------------");
							System.out.println();
						}
						else{
							System.out.println("You entered a wrong number. Please enter between 1-3");
							Start.pressEnterToContinue();
						}
						if(foodItem!=null){
							System.out.println();
							System.out.print("Enter Restaurant ID: ");
							String idres4 = input.next();
							Restaurant res4 = foodcourt.searchRestaurant(idres4);
							if(res4!=null){
								if(res4.insertFoodItem(foodItem)){
									System.out.println("Food ID "+foodItem.getFid()+" inserted in Restaurant ID "+res4.getRid());
									Start.pressEnterToContinue();
								}
								else{
									System.out.println("No such Restaurant found!");
									Start.pressEnterToContinue();
								}
							}
							else{
								System.out.println("Opps! Something Went Wrong!");
								Start.pressEnterToContinue();
							}
						}
						break;
					case 2:
						Start.clrscr();
						System.out.println("------------Remove Existing Food Item------------");
						System.out.println();
						System.out.print("Enter Restaurant ID: ");
						String idres5 = input.next();
						Restaurant res5 = foodcourt.searchRestaurant(idres5);
						if(res5!=null){
						System.out.print("Enter Food Item ID: ");
						String idfood3 = input.next();
						FoodItem foodItem1 = res5.searchFoodItem(idfood3);
						if(foodItem1!=null){
							if(res5.removeFoodItem(foodItem1)){
								System.out.println("Food Item ID "+foodItem1.getFid()+" removed from Restaurant ID "+res5.getRid());
								Start.pressEnterToContinue();
							}
							else{
								System.out.println("Opps! Something Went Wrong.");
								Start.pressEnterToContinue();
							}
						}
						else{
							System.out.println("Opps! Something went wrong.");
							Start.pressEnterToContinue();
						}
						}
						else{
							System.out.println("Opps! Something is wrong.");
							Start.pressEnterToContinue();
						}
						break;
					case 3:
						Start.clrscr();
						System.out.println("------------Show All Food Item------------");
						System.out.println();
						System.out.print("Enter Restaurant ID: ");
						String idres6 = input.next();
						Restaurant res6 = foodcourt.searchRestaurant(idres6);
						if(res6!=null){
							System.out.println();
							res6.showAllFoodItems();
							Start.pressEnterToContinue();
						}
						else{
							System.out.println("Opps! Something went wrong.");
							Start.pressEnterToContinue();
						}
						break;
					case 4:
						Start.clrscr();
						System.out.println("------------Search a FoodItem------------");
						System.out.println();
						System.out.println("Enter Restaurant ID: ");
						String idres7 = input.next();
						Restaurant res7 = foodcourt.searchRestaurant(idres7);
						if(res7!=null){
						System.out.println();
						System.out.print("Enter Food Item ID: ");
						String idfood4 = input.next();
						FoodItem foodItem2 = res7.searchFoodItem(idfood4);
						if(foodItem2!=null){
							System.out.println("Food Item Found.");
							System.out.println();
							foodItem2.showInfo();
							Start.pressEnterToContinue();
						}
						else{
							System.out.println("Opps! Something is wrong.");
							Start.pressEnterToContinue();
						}
						}
						else{
							System.out.println("Opps! Something is wrong.");
							Start.pressEnterToContinue();
						}
						break;
					case 5:
						Start.clrscr();
						System.out.println("------------Going Back to Main Menu------------");
						repeat3=false;
						break;
					default:
						System.out.println();
						System.out.println("Opps! Your choice is invalid.");
						Start.pressEnterToContinue();
						break;

				}
				}
				break;

			case 4:
				boolean repeat4=true;
				while(repeat4){
				Start.clrscr();
				System.out.println();
				System.out.println("------------FoodItem Quantity Add-Sell------------");
				System.out.println();
				System.out.println("1. Add FoodItem");
				System.out.println("2. Sell FoodItem");
				System.out.println("3. Show Add Sell History");
				System.out.println("4. Go Back");
				System.out.println();
				System.out.print("Enter your option:");
				int option4 = input.nextInt();
				System.out.println();
				switch(option4){
					case 1:
						Start.clrscr();
						System.out.println("------------Add FoodItem------------");
						System.out.println();
						System.out.println("Enter Restaurant ID: ");
						String idres8 = input.next();
						Restaurant res8 = foodcourt.searchRestaurant(idres8);
						if(res8!=null){
							System.out.println();
							System.out.print("Enter Food Item ID: ");
							String idfood5 = input.next();
							FoodItem foodItem3 = res8.searchFoodItem(idfood5);
							if(foodItem3!=null){
								System.out.println();
								System.out.println("Available Quantity= "+foodItem3.getAvailableQuantity());
								System.out.println();
								System.out.print("Enter the amount you want to add: ");
								int quantity3 = input.nextInt();
								if(foodItem3.addQuantity(quantity3)){
									System.out.println("New Available Quantity is: "+foodItem3.getAvailableQuantity());
									file.writeInFile(quantity3 + " added into Food Item "+idfood5 + " in Restaurant "+res8.getRid());
									Start.pressEnterToContinue();
								}
								else{
									System.out.println("Opps! Something went wrong.");
									Start.pressEnterToContinue();
								}
							}
							else{
								System.out.println("Opps! Something went wrong.");
								Start.pressEnterToContinue();
							}
						}
						else{
							System.out.println("Opps! Something went wrong.");
							Start.pressEnterToContinue();
						}
						break;
					case 2:
						Start.clrscr();
						System.out.println("------------Sell Food Item------------");
						System.out.println();
						System.out.print("Enter Restaurent ID: ");
						String idres9 = input.next();
						Restaurant res9 = foodcourt.searchRestaurant(idres9);
						if(res9!=null){
							System.out.println();
							System.out.print("Enter Food Item ID: ");
							String idfood6 = input.next();
							FoodItem foodItem4 = res9.searchFoodItem(idfood6);
							if(foodItem4!=null){
								System.out.println();
								System.out.println("Available Quantity is= "+foodItem4.getAvailableQuantity());
								System.out.println();
								System.out.print("Enter amount: ");
								int quantity4 = input.nextInt();
								if(foodItem4.sellQuantity(quantity4)){
									System.out.println("Food Item ID "+foodItem4.getFid() + " sold "+quantity4+" times in Restaurant ID "+res9.getRid());
									file.writeInFile("Food Item ID "+foodItem4.getFid() + " sold "+quantity4+" times in Restaurant ID "+res9.getRid());
									Start.pressEnterToContinue();
								}
								else{
									System.out.println("Opps! Something went wrong.");
									Start.pressEnterToContinue();
								}
							}
							else{
								System.out.println("Opps! Something went wrong.");
								Start.pressEnterToContinue();
							}
						}
						else{
							System.out.println("Opps! Something went wrong.");
							Start.pressEnterToContinue();
						}
						break;
					case 3:
						Start.clrscr();
						System.out.println("------------Show Add Sell History------------");
						System.out.println();
						file.readFromFile();
						Start.pressEnterToContinue();
						break;
					case 4:
						Start.clrscr();
						System.out.println("------------Going Back to Main Menu------------");
						repeat4=false;
						break;
					default:
						System.out.println();
						System.out.println("Opps! Your choice is invalid.");
						Start.pressEnterToContinue();
						break;

				}
				}
				break;

			case 5:
				Start.clrscr();
				System.out.println();
				System.out.println("------------Thank you for choosing our system------------");
				System.out.println();
				repeat=false;
				break;

			default:

				System.out.println();
				System.out.println("Opps! Your choice is invalid.");
				Start.pressEnterToContinue();
				break;
		}
		}

	}
	public static void clrscr(){

    try {

        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        else

            System.out.print("\033[H\033[2J");  
   			System.out.flush();

    } catch (IOException | InterruptedException ex) {}

}
	public static void pressEnterToContinue()
 	{ 
        System.out.println();
        System.out.println("Press Enter to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 	}
}