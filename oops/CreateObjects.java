

/**
 * CreateObjects
 */
public class CreateObjects {

    public static class Person{
        int age;
        String name;
        void sayHi(){
            System.out.println(name+"["+age+"] says Hii");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 12;
        p1.name = "Joseph";
        p1.sayHi();
        Person p2 = new Person();
        p2.age = 120;
        p1.name = "Busi";
        p1.sayHi();
        
    }
}