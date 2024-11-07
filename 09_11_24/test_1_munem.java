public class test_1_munem {
    private String name;
    private int age;

    public test_1_munem() {
        this.name="Munem";
        this.age=21;
    }

    public test_1_munem(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        test_1_munem person1=new test_1_munem();
        test_1_munem person2=new test_1_munem("Sarker", 25);

        System.out.println("---------Person Details of ICE---------");
        System.out.println("    Person 1");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("----------------------------------");
        System.out.println("    Person 2");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
