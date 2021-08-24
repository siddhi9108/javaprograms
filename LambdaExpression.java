package javaapplication1;
interface A
{
    void show();
}
//class B implements A{
//    public void show()
//    {
//        System.out.println("Hellowww");
//    }
//}
public class LambdaExpression {
    public static void main(String[] args) 
    {
        A obj;
        //obj = new B();
        //obj = new A()                              // This is a class and he inner class ahe and it dosen't have name 
        //       {                                   //therefore, its Anonymous inner class
        //            public void show(){
        //            System.out.println("Hello");
        //            }
        //        };
        
        obj = () -> System.out.println("Hellow");
        
        obj.show();
    }
}
