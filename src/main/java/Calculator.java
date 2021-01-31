import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the entries line by line");
        int a=sc.nextInt();
        String s=sc.next();
        int b=sc.nextInt();
        if(s.charAt(0)=='+') {
            System.out.println(a+b);
        } else if(s.charAt(0)=='-') {
            System.out.println(a-b);
        } else if(s.charAt(0)=='*') {
            System.out.println(a*b);
        } else if(s.charAt(0)=='/') {
            System.out.println(a/b);
        } else {
            System.out.println(a%b);
        }
    }
}
