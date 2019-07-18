import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num you would like");
        int num =Integer.parseInt(sc.nextLine());
        int[] grade = new int[num];

        for(int i = 0;i<grade.length;i++){
            System.out.println("Enter the num you would like");
            grade[i]  =Integer.parseInt(sc.nextLine());
            //grade[i] = i+1;
            sum += grade[i]; //sum = sum + grade[i]
        }
        System.out.println("average of grade is " +sum/num);
    }
}
