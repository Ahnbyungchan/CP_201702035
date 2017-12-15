package hw09;

class Person {
public String name;
public String address;
public String number;
public Person(){
	
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public String getAddress(){
	return address;
}
public void setAddress(String address){
	this.address=address;
}
public String getNumber(){
	return number;
}
public void setNumber(String number){
	this.number=number;
}
}
class Customer extends Person{
	int pnumber;
	int mileage;
public Customer(){
	
}
public Customer(String name, String address, String number, int pnumber, int mileage) {
	// TODO Auto-generated constructor stub
	super.name = name;
	super.address = address;
	super.number = number;
	this.pnumber = pnumber;
	this.mileage =mileage;
	
}
public int getPnumber(){
	return pnumber;
}
public void setPnumber(int pnumber){
	this.pnumber=pnumber;
}
public int getMileage(){
	return mileage;
}
public void setMileage(int mileage){
	this.mileage=mileage;
}
}

	
