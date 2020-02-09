package com.srivaths.epam2;
import java.util.ArrayList;
public class Task{// class for sweets
	public class Sweets{
	double weight;
	double price;
	public Sweets() {
		super();
	}
	public Sweets(double weight,double price) {
		super();
		this.weight=weight;
		this.price=price;
	}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return price;
	}
	public Sweets setWeight(double weight) {
		this.weight=weight;
		return this;
	}
	public Sweets setPrice(double price) {
		this.price=price;
		return this;
	}
	}
	class Mysorepak extends Sweets{
		Mysorepak(){}
		Mysorepak(double weight,double price){
	    	super(weight,price);
	    }  
	    }
	class kheer extends Sweets{
		kheer(){
	    }
		kheer(double weight, double price){
	    	super(weight,price);
	    } 
	    }
	public class NewYearGift{
	    String name;
	    double weight;
	    ArrayList<Sweets> newyeargift;
	    NewYearGift(){
	        newyeargift = new ArrayList<Sweets>();
	    }
	    NewYearGift(String name, Sweets...components){
	        this.name=name;
	        newyeargift=new ArrayList<Sweets>();
	        for (Sweets s : components){
	            this.newyeargift.add(s);
	        }
	    }
	    String getName(){return name;}

	    public NewYearGift setName(String name){
	        this.name=name;
	        return this;
	    }
	    public NewYearGift setComponent(Sweets s){
	        this.newyeargift.add(s);
	        return this;
	    }
	    void getWeight(double weight){
	        this.weight+=weight;
	    }
	    double getWeight(){
	        for (Sweets w:newyeargift){
	            weight+=w.getWeight();
	        }
	        return weight;
	    }
	    public String toString(){
	        final StringBuilder sb = new StringBuilder("New Year's Gift is created with the name:");
	        sb.append("[ ").append(name).append("] and with:");
	        sb.append(" weight ").append(getWeight());
	        return sb.toString();
	    }
	}
	class Kajubarfi extends Sweets{
		Kajubarfi(){
	    }
		Kajubarfi(double weight,double price){
	        super(weight,price);
	    }
	}
    public static void main( String[] args )
    {
    	Task a=new Task();
    	NewYearGift root = a.new NewYearGift();
        NewYearGift newyeargift1 = a.new NewYearGift("Memorable gift",a.new Kajubarfi(20,20),a.new Mysorepak(650,100),a.new kheer(150,50));
        System.out.println(newyeargift1);
        //System.out.println(newyearCandies);
        //sweets objects
        Kajubarfi kb = a.new Kajubarfi(25,25);
        Mysorepak mp = a.new Mysorepak(500,120);
        kheer chocolate1 = a.new kheer(120,34);
    }
}

