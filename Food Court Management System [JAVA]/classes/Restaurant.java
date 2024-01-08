package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations{
	private String rid;
	private String name;
	FoodItem fooditems[]=new FoodItem[100];

	public Restaurant(){}

	public void setName(String name){this.name=name;}
	public void setRid(String rid){this.rid=rid;}
	public String getName(){return name;}
	public String getRid(){return rid;}

	public boolean insertFoodItem(FoodItem f){
		boolean flag=false;
		for(int i=0;i<fooditems.length;i++){
			if(fooditems[i]==null){
				fooditems[i]=f;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFoodItem(FoodItem f){
		boolean flag=false;
		for(int i=0;i<fooditems.length;i++){
			if(fooditems[i]==f){
				fooditems[i]=null;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public FoodItem searchFoodItem(String fid){
		FoodItem temp=null;
		for(int i=0;i<fooditems.length;i++){
			if(fooditems[i]!=null){
				if(fooditems[i].getFid().equals(fid)){
					temp=fooditems[i];
					break;
				}
			}
		}
		return temp;
	}
	public void showAllFoodItems(){
		System.out.println("Restaurant ID: "+rid);
		System.out.println("Restaurant Name: "+name);
		for(int i=0;i<fooditems.length;i++){
			if(fooditems[i]!=null){
				fooditems[i].showInfo();
				System.out.println();
			}
		}
	}
}