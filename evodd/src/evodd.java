//even odd
import java.util.Scanner;
public class evodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String result;
        if(a%2==0)
        {
            result="even";
        }
        else{
            result = "odd";
        }
            System.out.println("The integer" +a+ "is" +result);

    }
}
