class Outer{
    String msg = " Hello I am Outer";
    //one more class add
    class Inner{
        public void print(){
            System.out.println(msg);
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.print();
    }
}
