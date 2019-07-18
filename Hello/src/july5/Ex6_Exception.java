package july5;
import java.util.Scanner;

public class Ex6_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        System.out.println("enter first number");
       int a = sc.nextInt();
        System.out.println("enter first number");
        int b = sc.nextInt();

            try
            {
          ans= (a / b);
            System.out.println(ans);
            }

        catch (Exception e)
        {
            System.out.println("can not divided by zero");
        }
    }
}

