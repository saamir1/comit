import java.util.Scanner;

    public class CoinTest {
        public static void main(String[] args) {
            final Coin nickel = new Coin("nickel", 5);
            final Coin dime = new Coin("dime", 10);
           final Coin quarter = new Coin("quarter", 25);
            final Coin loonie = new Coin("loonie", 100);

            final Coin twoonie = new Coin("twoonie", 200);

            Coin[] coins = new Coin[5];
            coins[0] = twoonie;
            coins[1] = loonie;
            coins[2] = quarter;
            coins[3] = dime;
            coins[4] = nickel;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value in cent: ");
            int remainder = sc.nextInt();
            int numCoin = 0;

        /*
        // twoonie
        numCoin = remainder / twoonie.getValue();
        System.out.println(numCoin + " " + twoonie.getName());

        remainder = remainder % twoonie.getValue();
        //System.out.println(remainder);

        // loonie
        numCoin = remainder / loonie.getValue();
        System.out.println(numCoin + " " + loonie.getName());
         */

            for (int i = 0; i< coins.length; i++){
                if (remainder > 0) {
                    numCoin = remainder / coins[i].getValue();

                    if (numCoin > 0) {
                        System.out.print(numCoin + " " + coins[i].getName() + " ");
                    }

                    remainder = remainder % coins[i].getValue();
                }
            }
        }
    }

