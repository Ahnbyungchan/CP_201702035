package hw05;

class Employee{
	public String name;
	public int phone;
	public int salary;
	public String getName() {
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int p){
		phone = p;
	}
	public int getSalary(){return salary;}
	public void setSalary(int s){salary = s;}
}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee myEmployee = new Employee();
		myEmployee.setName("�Ⱥ���");
		myEmployee.setPhone(12345678);
		myEmployee.setSalary(5000);
		
		System.out.println("������ �̸��� "+myEmployee.getName());
		System.out.println("������ ��ȭ ��ȣ�� "+myEmployee.getPhone());
		System.out.println("������ ������ "+myEmployee.getSalary());

	}
	

}






