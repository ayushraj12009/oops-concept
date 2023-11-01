package OOPs;

class Student{

    // data: data members: instance variable teno esi ko bolte hai class ke properties ko
    int studentId;
    String studentName;
    String studentCity;

    // constructor
    // Rule class name hi constructor name hoga means clssname == constructor name
    // eska return type nahi hota hai

    // if class does not have any construtor then java created one default constructor

    public Student(int id, String name, String city){
        this.studentId = id;
        this.studentName = name;
        this.studentCity = city;
    }




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

// inheritance
// child class ko extends keywords se parent class ko add krte hai
// jisse parrent class ka properties child class me aa jata hai


// child class ko child Class, Sub Class or Derived Class bola jata hai
// parent class ko Parent Class, Super Class or Base Class bola jata hai

//Types of inHeritance
// 1. Single Inheritance
// 2. MultiLevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance // java me multiple inheritane support nahi krta hai
// lekin interface agr use kre tho esko use kr sakte hai...



