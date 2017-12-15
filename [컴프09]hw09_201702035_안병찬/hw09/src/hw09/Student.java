package hw09;

class Student {
public String name;
public int snumber;
public String major;
public int year;
public int credit;
public void Student(){
}
public String getName(){
	return name;
}
public void setName(){
	this.name = name;
}
public int getSnumber(){
	return snumber;
}
public void setSnumber(){
	this.snumber = snumber;
}
public String getMajor(){
	return major;
}
public void setMajor(){
	this.major = major;
}
public int getYear(){
	return year;
}
public void setYear(){
	this.year = year;
}
public int getCredit(){
	return credit;
}
public void setCredit(){
	this.credit = credit;
}
}
class Undergraduate extends Student{
	public String club;
	public Undergraduate(){
			}
	public Undergraduate(String name, int snumber, String major, int year, int credit, String club){
		super.name = name;
		super.snumber=snumber;
		super.major =major;
		super.credit = credit;
		super.year = year;
		this.club = club;
	}	
	public String getClub(){
		return club;
	}
	public void setClub(){
		this.club = club;
	}
	public void uShow(){
		System.out.println("�̸�:"+getName());
		System.out.println("�й�:"+getSnumber());
		System.out.println("�Ҽ��а�:"+getMajor());
		System.out.println("�г�:"+getYear());
		System.out.println("�̼�����:"+getCredit());
		System.out.println("���Ƹ� �̸�:"+getClub());
	}
}
class Graduate extends Student{
	String assistant;
	double ratio;
	public Graduate(){
	}
	public Graduate(String name, int snumber, String major, int year, int credit, String assistant, double ratio){
	super.name = name;
	super.snumber=snumber;
	super.major =major;
	super.credit = credit;
	super.year = year;
	this.assistant = assistant;
	this.ratio = ratio;
	}
	public String getAssistant(){
		return assistant;
	}
	public void setAssistant(){
		this.assistant = assistant;
	}
	public double getRatio(){
		return ratio;
	}
	public void setRatio(){
		this.ratio = ratio;
	}
	public void gShow(){
		System.out.println("�̸�:"+getName());
		System.out.println("�й�:"+getSnumber());
		System.out.println("�Ҽ��а�:"+getMajor());
		System.out.println("�г�:"+getYear());
		System.out.println("�̼�����:"+getCredit());
		System.out.println("���� ����:"+getAssistant());
		System.out.println("���б� ����:"+getRatio());
	}
}
