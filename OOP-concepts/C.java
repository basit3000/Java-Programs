class A{
    private int a;
    public A(int a){
        this.a = a;
    }
}   
class B{
    private int a;
    public B(int a){
        this.a = a;
        System.out.println("Hello" + a);
    }
    public B(){
        this(2);
    }
}
class C{
    public static void main(String args[]){
        A a1 = new A(3);
        B b0 = new B();
        B b1 = new B(5); 
    }
}