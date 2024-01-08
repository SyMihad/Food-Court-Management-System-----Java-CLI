package classes;

import java.lang.*;

public class MainDish extends FoodItem{
	private String category;

	public MainDish(){}
	public MainDish(String fid,String name, int availableQuantity, double price, String category){
		super(fid, name, availableQuantity, price);
		this.category=category;
	}

	public void setCategory(String category){this.category=category;}
	public String getCategory(){return category;}

	public void showInfo(){
		System.out.println("Food ID: "+fid);
		System.out.println("Food Name: "+ name);
		System.out.println("Food Category: "+category);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
	}
}