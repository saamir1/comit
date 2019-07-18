package Work;

import java.util.Scanner;
public class NameStored {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fName = new String[5];
        String[] lName = new String[5];

        for (int i = 0; i < fName.length; i++) {

            System.out.println("Enter  first name:");
            fName[i] = sc.next();

            System.out.println("enter last name:");
            lName[i] = sc.next();

            System.out.println(lName[i] + "," + fName[i]);

        }

    }
}
