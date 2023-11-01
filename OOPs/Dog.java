package OOPs;

public class Dog extends Animal {

    int x = 1601;
    public void speak(){
        System.out.println(super.x); // output = 4 super keyword just uper bale parent class ko call
        // karne ke liye yse hota hai just uper ye yaad rakhna
        System.out.println(this.x); // output = 1601 this current class ke object ko call krane ke
        // liye hota hai
    }

}
