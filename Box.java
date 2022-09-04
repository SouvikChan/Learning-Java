class box1{
    int a;
    int b;
    int c;
    box1(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
//        int c;
    }
//    public void setval(int a,int b,int c){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//    }
    void getval(){
        System.out.println("A is :"+a+" B is :"+b+" C is :"+c);
    }
}

public class Box {
    public static void main(String[] args) {
        box1 b1=new box1(23,56,68);
//        b1.setval(5,7,8);
        b1.getval();
    }
}
