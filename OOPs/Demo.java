package OOPs;

public class Demo {
    public static void main(String[] args) {
        // create class object of student

        Student st1 = new Student(123, "Ayush Raj", "Patna City");

        st1.study();
        System.out.println(" ");
        st1.showFullDetails();

        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);


    }
}
