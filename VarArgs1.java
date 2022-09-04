import java.util.*;
public class VarArgs1 {
    static int add(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }
    static int sub(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Two numbers: ");
        int a= sc.nextInt(); int b=sc.nextInt();
        return (a-b);
    }
    public static void main(String[] args) {
        System.out.println(sub());
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
}
