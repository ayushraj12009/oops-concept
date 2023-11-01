package OOPs;

public class Demo {
    public static void main(String[] args) {
        // create class object of student

        Student st1 = new Student();
        st1.studentName = "Ayush Raj";
        st1.studentCity = "Patna";
        st1.studentId = 1601;

        st1.study();
        System.out.println(" ");
        st1.showFullDetails();


    }
}
