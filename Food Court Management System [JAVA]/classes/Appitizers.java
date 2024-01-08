package classes;

import java.lang.*;
import interfaces.*;

public class Appitizers extends FoodItem{
	private String size;

	public Appitizers(){}
	public Appitizers(String fid,String name, int availableQuantity, double price, String size){
		super(fid, name, availableQuantity, price);
		this.size=size;
	}

	public void setSize(String size){this.size=size;}
	public String getSize(){return size;}

	public void showInfo(){
		System.out.println("Food ID: "+fid);
		System.out.println("Food Name: "+ name);
		System.out.println("Size: "+size);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
	}
}