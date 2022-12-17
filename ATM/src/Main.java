import java.util.Scanner;

public class Main {

    public static void firstMenu(String ATM) {

        System.out.println("==============================");
        System.out.println(ATM + "SELECT OPTIONS");
        System.out.println("1 - IN");
        System.out.println("2 - EXIT");
        System.out.println("==============================");
    }

    public static void secondMenu() {
        System.out.println("==============================");
        System.out.println("1 - ACCOUNT BALANCE");
        System.out.println("2 - PAYMENT");
        System.out.println("3 - PAYCHECKS");
        System.out.println("4 - EXIT");
        System.out.println("==============================");
    }

    public static void pin(String ATM) {
        Scanner scan = new Scanner(System.in);

        int[] PIN = new int[4];
        int[] userPIN = new int[4];
        PIN[0] = 1;
        PIN[1] = 1;
        PIN[2] = 1;
        PIN[3] = 1;

        int j = 0, i = 0;
        while (j < 3 && i < 4) {
            i = 0;
            System.out.println("==============================");
            System.out.println(ATM + "Enter you're PIN:");
             for (int k = 0; k < PIN.length; k++) {
                 userPIN[k] = scan.nextInt();
             }
            System.out.println(i);
            System.out.println("==============================");

            for (int a : PIN) {
                for (int b : userPIN) {
                    if (a == b) {
                        i++;
                    }
                }
            }
            i = i / 4;
                if (i == 4) {
                    secondMenu();
                    int atmCheck = scan.nextInt();
                    double accBalance = 3089.32;

                    switch (atmCheck){
                        case 1 -> {
                            System.out.println("==============================");
                            System.out.println(ATM + "You're account balance is: " + accBalance + " USD");
                            System.out.println(ATM + "Thanks for choice our bank");
                            System.out.println("==============================");
                        } case 2 -> {
                            System.out.println("==============================");
                            System.out.println(ATM + "How much you wanna payment? (in USD)");
                            double pay = scan.nextDouble();
                            accBalance += pay;
                            System.out.println(ATM + "Do you wanna check your account balance?");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No");
                                int choice = scan.nextInt();
                                if (choice == 1) {
                                    System.out.println(ATM + "You're account balance is: " + accBalance + " USD");
                                } else if (choice == 2) {
                                    System.out.println(ATM + "Thanks for choice our bank");
                                } else {
                                    System.out.println(ATM + "I'm sorry. I don't understand");
                                }
                            System.out.println("==============================");
                        } case 3 -> {
                            System.out.println("==============================");
                            System.out.println(ATM + "How much you wanna paychecks? (in USD)");
                            double pay = scan.nextDouble();
                            accBalance -= pay;
                            System.out.println(ATM + "Do you wanna check your account balance?");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No");
                            int choice = scan.nextInt();
                            if (choice == 1) {
                                System.out.println(ATM + "You're account balance is: " + accBalance + " USD");
                            } else if (choice == 2) {
                                System.out.println(ATM + "Thanks for choice our bank");
                            } else {
                                System.out.println(ATM + "I'm sorry. I don't understand");
                            }
                            System.out.println("==============================");
                        } case 4 -> {
                            System.exit(0);
                        }default -> {
                            System.out.println("==============================");
                            System.out.println(ATM + "I'm sorry. I don't understand");
                            System.out.println("==============================");
                        }
                    }
                }
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ATM = "ATM: ";

        firstMenu(ATM);
        int inOut = scan.nextInt();

        if (inOut == 1) {
            pin(ATM);
        } else if (inOut == 2) {
            System.exit(0);
        } else {
            System.out.println("==============================");
            System.out.println(ATM + "I'm sorry. I don't understand");
            System.out.println("==============================");
        }

    }
}