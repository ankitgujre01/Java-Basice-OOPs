
class Animal{
    void speak(){
        System.out.println("Animal speak");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Animal dog = new Animal(){      //anonymious class a class without a name
           @Override
            void speak() {
                System.out.println("Dogs Bark");
            }
        };
        dog.speak();
        Animal cat = new Animal(){      //anonymious class a class without a name
            @Override
            void speak() {
                System.out.println("cat Meow");
            }
        };
        cat.speak();
        Animal anime = new Animal();
        anime.speak();
    }
}
