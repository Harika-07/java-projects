package java2;

class animals {
	public void display() {
		System.out.println("it is a dog");
	}
}
class Dog extends animals{
		public void display() {
			System.out.println("it is a golden dog");
		}
}
public class animal{
		public static void main(String[] args) {
			Dog d1=new Dog();
			d1.display();
		}
	}


