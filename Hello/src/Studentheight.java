import java.util.Scanner;
public class Studentheight {
    public static void main(String[] args) {

        int n, avg=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter height of student");
        n=Sc.nextInt();
        int  numStudent[] = new int [10];
        System.out.println("enter all the height of student");
        for (int i=0;i < numStudent.length;i++){
            numStudent[i]=Sc.nextInt();
            avg= +numStudent[i]/10;

        }
        System.out.println("the avg is " +avg);
    }


}
