package OOPs;

class Student{

    // data: data members: instance variable teno esi ko bolte hai class ke properties ko
    int studentId;
    String studentName;
    String studentCity;

    //member methods : methods: functions ye teno bola jata hai

    public void study(){
        System.out.print(studentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("My Name is " + studentName);
        System.out.println("My id is " + studentId);
        System.out.println("My city is " + studentCity);
    }

}