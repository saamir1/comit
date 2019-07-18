package Work;

import java.util.Scanner;
public class NaturalNum
/*{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        for(int i = 0;i <= n; i++ )
        {
            sum += i;
        }
        System.out.println(sum);
    }
}*/


 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

