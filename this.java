class test{
    void display(){
        this.show();
        System.out.println("inside display function");
    }
    void show(){
        System.out.println("inside show function");
    }
    public static void main(String[] args){
        test s=new test();
        s.display();
    }
}