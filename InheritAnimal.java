import java.lang.*;

class animal{
    public String name;

    void getName() {
        System.out.println("The animal is : "+name);
    }

    public void setName(String name) {
        System.out.println("I am in animal and setting name now");
        this.name = name;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }

}

class Lion extends animal{
    public String Lname;

    void getLName() {
        System.out.println("The Lion is : "+Lname);
    }

    public void setLName(String Lname) {
        this.Lname = Lname;
    }
}


public class InheritAnimal {
    public static void main(String[] args) {
        animal a1=new animal();
        a1.setName("Beer");
        a1.getName();
        Lion l1=new Lion();
        l1.setLName("Gujarat Lions");
        l1.getLName();
    }
}
