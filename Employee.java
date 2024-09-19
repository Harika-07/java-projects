package java2;

class person {
	int salary=60000;
}
class Engineer extends person{
	int bonus=10000;
}
public class Employee{
	public static void main(String[] args) {
		Engineer E1=new Engineer();
		System.out.println("salary"+E1.salary+"\n bonus"+E1.bonus);
	}
}