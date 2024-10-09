

public class TestConstructor {
    int id;
    String name;
    public TestConstructor(){
        id = 456;
        name = "Ankit";
    }
    public void print(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        obj.print();
    }
}
