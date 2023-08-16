package hello.com;
class A12{
    public int a;
    public int Harry(){
        return 5;
    }

    public void meth2(){
        System.out.println("I'm the 2 method of class A");
    }
}
class B12 extends A12{
    @Override
    public void meth2(){
        System.out.println("I'm the 2 method of  class B");
    }
    public void meth4(){
        System.out.println("I'm the 4 method of class B");
    }
}
public class Lec_48_Method_Overriding {
    public static void main(String[] args) {
        A12 a = new A12();
//        a.meth2();
        B12 b = new B12();
        b.meth2();
//        b.meth4();

    }
}
