public class add {
    public int sum(int x, int y){
        return(x+y);
    }
    public int sum(int x, int y, int z){
        return(x+y+z);
    }
    public double sum(double x, double y){
        return(x+y);
    }
    public static void main(String[] args) {
        add s=new add();
        System.out.println(s.sum(2,5));
        System.out.println(s.sum(6,8,3));
        System.out.println(s.sum(4.7,9.8));
        
    }
}