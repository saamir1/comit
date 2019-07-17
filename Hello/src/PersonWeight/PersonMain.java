package PersonWeight;
import java.util.Scanner;

public class PersonMain {
        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your Name: ");
            String name = (scan.nextLine());

            System.out.println("Please Enter Age:" );
            int age = (Integer.parseInt(scan.nextLine()));

            System.out.println("Please Enter Height:" );
            float height = (Float.parseFloat(scan.nextLine()));

            System.out.println("Please enter weight:" );
            int weight = (Integer.parseInt(scan.nextLine()));

            System.out.println("Please Enter gender:" );
            char gender = (scan.nextLine().toUpperCase().charAt(0));

            Person person1 = new Person(name,age,gender,weight,height);
            Person person2 = new Person("John",17,'M');
            Person person3 = new Person();

            setAttributes(person3);

            System.out.println("" + person1.getName() + " has " + calcWeight(person1) );
            System.out.println("" + person2.getName() + " has " + calcWeight(person2) );
            System.out.println("" + person3.getName() + " has " + calcWeight(person3) );

            System.out.println("" + person1.getName() + " has " + leagalAge(person1) );
            System.out.println("" + person2.getName() + " has " + leagalAge(person2) );
            System.out.println("" + person3.getName() + " has " + leagalAge(person3) );
        }

        public static void setAttributes(Person person3){
            person3.setName("Vish");
            person3.setGender('F');
            person3.setAge(17);
            person3.setWeight(60);
            person3.setHeight(1);
        }

        public static String calcWeight(Person p){
            int i = p.calculate();
            if(i>0) return "Over Weight";
            else if(i<0) return "Under Weight";
            else return "Ideal Weight";
        }

        public static String leagalAge(Person p){
            if(p.isOver()) return "legal age";
            return "Not legal age";
        }

    }

