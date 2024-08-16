import java.util.Scanner;

public class a {
    public static void serie(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese n: ");
        //int n = sc.nextInt();
        int n = 10;
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    public static void serie2(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese n: ");
        //int n = sc.nextInt();
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            b = b + a;
            a = b - a;
        }
        System.out.println(b);
    }
}
