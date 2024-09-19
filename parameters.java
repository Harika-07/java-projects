package java2;

public class parameters {
	public int sum(int x) {
		return (x);
	}
	public int sum(int x,int y) {
		return (x+y);
	}
	public int sum(int x, int y, int z) {
		return (x+y+z);
	}
	public static void main(String[] args) {
		parameters s= new parameters();
		System.out.println(s.sum(9));
		System.out.println(s.sum(5,6));
		System.out.println(s.sum(7, 8, 9));
	}
	

}


