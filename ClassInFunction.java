class Test_fun{
    public void test_class(){
        class Hello {
            void print(){
                System.out.println("Hello");
            }
        }
        new Hello().print();
    }
}
public class ClassInFunction{
    public static void main(String []args){
        new Test_fun().test_class();
    }
}