package hw07;

public class Dog {

private String name;
public static String breed;
private int age;


public Dog(String name, int age){
	setDog(name, "poodle", age);
	this.name = name;
	this.breed = breed;
	this.age = age;
}
public Dog(String name, String breed, int age){
	setDog(name, breed, age);
	this.name = name;
	this.breed = breed;
	this.age = age;
}
public void setDog(String n, String b, int a){
	this.name = name;
	this.breed = breed;
	this.age = age;
}
public void print(){
	System.out.println("이름:"+name+"종:"+breed+"나이:"+age);
}
}
