package classes;

import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations{
	Restaurant restaurants[] = new Restaurant[100];
	Employee employees[] = new Employee[1000];

	public FoodCourt(){}

	public boolean insertRestaurant(Restaurant r){
		boolean flag=false;
		for(int i=0;i<restaurants.length;i++){
			if(restaurants[i]==null){
				restaurants[i]=r;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean removeRestaurant(Restaurant r){
		boolean flag=false;
		for(int i=0;i<restaurants.length;i++){
			if(restaurants[i]==r){
				restaurants[i]=null;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public Restaurant searchRestaurant(String rid){
		Restaurant temp=null;
		for(int i=0;i<restaurants.length;i++){
			if(restaurants[i]!=null){
				if(restaurants[i].getRid().equals(rid)){
					temp=restaurants[i];
					break;
				}
			}
		}
		return temp;
	}
	public void showAllRestaurants(){

		for(int i=0;i<restaurants.length;i++){
			if(restaurants[i]!=null){
				restaurants[i].showAllFoodItems();
				System.out.println();
			}
		}
	}

	public boolean insertEmployee(Employee e){
		boolean flag=false;
		for(int i=0;i<employees.length;i++){
			if(employees[i]==null){
				employees[i]=e;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean removeEmployee(Employee e){
		boolean flag=false;
		for(int i=0;i<employees.length;i++){
			if(employees[i]==e){
				employees[i]=null;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public Employee searchEmployee(String empId){
		Employee temp=null;
		for(int i=0;i<employees.length;i++){
			if(employees[i]!=null){
				if(employees[i].getEmpId().equals(empId)){
					temp=employees[i];
					break;
				}
			}
		}
		return temp;
	}
	public void showAllEmployees(){
		for(int i=0;i<employees.length;i++){
			if(employees[i]!=null){
				System.out.println("Employee Name: "+employees[i].getName());
				System.out.println("Employee ID: "+employees[i].getEmpId());
				System.out.println("Salary: "+employees[i].getSalary());
				System.out.println();
			}
		}

	}
}