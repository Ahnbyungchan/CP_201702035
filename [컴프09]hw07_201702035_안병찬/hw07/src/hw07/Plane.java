package hw07;

public class Plane {

private String company;
private String model;
private int maxPassenger;
private static int planes =0;

public Plane(){
	this.company = "º¸À×";
	this.model = "Boeing 747-8";
	this.maxPassenger = 467;
	planes++;
}
public Plane(String c, String m, int p){
company =c;
model = m;
maxPassenger = p;
	planes++;
}
public static int getPlanes(){
	return planes;
}
}
