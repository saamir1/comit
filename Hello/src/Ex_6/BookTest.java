package Ex_6;

public class BookTest {

        public static void main(String[] args) {
            Book educated1 = new Book("Educated", "Tara Westover");
            Book educated2 = new Book("Educated", "Tara Westover");
            Book educated3 = new Book("Educated", "Tara Westover");
            System.out.println(educated3.toString() + '\n');

            boolean success;
            success = educated1.returnBook();
            System.out.println(success ? "successfully returned" : "Sorry, no books can be returned that have not been lend");
            System.out.println(educated1.toString() + '\n');

            success = educated1.loanBook();
            System.out.println(success ? "successfully lend" : "sorry, no books available");
            System.out.println(educated1.toString() + '\n');

            success = educated2.loanBook();
            System.out.println(success ? "successfully lend" : "sorry, no books available");
            System.out.println(educated2.toString() + '\n');

            success = educated3.loanBook();
            System.out.println(success ? "successfully lend" : "sorry, no books available");
            System.out.println(educated3.toString() + '\n');

            success = educated3.loanBook();
            System.out.println(success ? "successfully lend" : "sorry, no books available");
            System.out.println(educated3.toString() + '\n');

            success = educated1.returnBook();
            System.out.println(success ? "successfully returned" : "Sorry, no books can be returned that have not been lend");
            System.out.println(educated1.toString() + '\n');

        }
    }

