package Play;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("John", "Math");
        mp.put("Jack", "Math");
        mp.put("Jeff", "History");
        Scanner sc = new Scanner(System.in);
        boolean quite = false;

        do {
            System.out.println("chose option");
            System.out.println("0 - new payee");
            System.out.println("1 - make a payment");
            System.out.println("2 - see reports");
            System.out.println("3 - search");
            int x = sc.nextInt();


            switch (x) {
                case 0:
                    System.out.println("name of payee");
                    String name = sc.next();
                    break;
                case 1:
                    System.out.println("Enter date ");
                    String date = sc.next();
                    System.out.println("Enter externalRef ");
                    String externalRef = sc.next();
                    break;
                case 2:
                    System.out.println("option2");
                    System.out.println("222222");
                    break;
                case 3:
                    System.out.println("3rd option");
                    break;
                case 4:
                    quite=true;
                    break;
                default:
                    System.out.println("enter valid option");
                    break;
            }
        } while (!quite);

    }
}
