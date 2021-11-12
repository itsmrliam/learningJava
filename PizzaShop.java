import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
public class main {
    public static void main(String args[]) throws IOException, InterruptedException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String pizza1 = "Cheese and tomato";
        String pizza2 = "Pepperoni and mozzarella";
        String pizza3 = "Bacon and cheese";
        String pizza4 = "Chicken and Mushroom";
        String pizza5 = "Hawaiian";
        double pizza1Price = 5.99;
        double pizza2Price = 8.49;
        double pizza3Price = 9.25;
        double pizza4Price = 8.99;
        double pizza5Price = 7.25;
        double deliveryPrice = 0.00;
        double deliveryZone1 = 0.00;
        double deliveryZone2 = 2.99;
        double deliveryZone3 = 5.99;
        String cannotDeliver = "cannot deliver";
        double milesToDeliver = 0;
        String choosePizza = null;
        boolean validInput = true;
        boolean validPizza = true;
        int pizzaChoice = 0;
        int deliveryBracket = 0;

        System.out.println("Hello, welcome to Krusty Krab Pizza!");
        Thread.sleep(1500);
        System.out.println("Here is our menu:\n\n           PIZZA MENU:");
        System.out.println("1. " + pizza1 + " £" + Double.toString(pizza1Price));
        System.out.println("2. " + pizza2 + " £" + Double.toString(pizza2Price));
        System.out.println("3. " + pizza3 + " £" + Double.toString(pizza3Price));
        System.out.println("4. " + pizza4 + " £" + Double.toString(pizza4Price));
        System.out.println("5. " + pizza5 + " £" + Double.toString(pizza5Price));
        Thread.sleep(2000);


        do {
            System.out.println("How far away are you? Please input distance (in miles) from your home");
            String milesInput = br.readLine();
            try {
                milesToDeliver = Double.parseDouble(milesInput);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, please enter distance (in miles) from your home.");
                validInput = false;
            }

            if (validInput) {
                    if ((milesToDeliver >= 0) && (milesToDeliver <= 1)) {
                        System.out.println("Delivery to " + milesToDeliver + " miles away will cost: £ " + deliveryZone1);
                        deliveryPrice = 0;
                    } else if ((milesToDeliver > 1) && (milesToDeliver <= 3)) {
                        System.out.println("Delivery to " + milesToDeliver + " miles away will cost: £ " + deliveryZone2);
                        deliveryPrice = 2.99;
                    } else if ((milesToDeliver >= 3) && (milesToDeliver <= 6)) {
                        System.out.println("Delivery to " + milesToDeliver + " miles away will cost: £ " + deliveryZone3);
                        deliveryPrice = 5.99;
                    } else if ((milesToDeliver < 0)) {
                        System.out.println("Please enter a valid input");
                        System.exit(404);
                    } else if ((milesToDeliver > 6)) {
                        System.out.println("That is too far away for us to deliver to, sorry!");
                        Thread.sleep(1000);
                        System.exit(0);
                    }
                }

                do {
                    System.out.println("Now, choose which number pizza you want from the menu!");
                    choosePizza = br.readLine();
                    try {
                        pizzaChoice = Integer.parseInt(choosePizza);
                        validPizza = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid pizza from the menu. Pick a number between 1-5");
                        validPizza = false;
                    }


                    switch (pizzaChoice) {

                        case 1: System.out.println("        BILL SUMMARY");
                                System.out.println(pizza1 + ", £" + pizza1Price);
                                System.out.println("Delivery charge, £" + deliveryPrice);
                                System.out.println("Total: " + (pizza1Price + deliveryPrice));
                                break;
                        case 2: System.out.println("        BILL SUMMARY");
                                System.out.println(pizza2 + ", £" + pizza2Price);
                                System.out.println("Delivery charge, £" + deliveryPrice);
                                System.out.println("Total: " + (pizza5Price + deliveryPrice));
                                break;
                        case 3: System.out.println("        BILL SUMMARY");
                                System.out.println(pizza3 + ", £" + pizza3Price);
                                System.out.println("Delivery charge, £" + deliveryPrice);
                                System.out.println("Total: " + (pizza3Price + deliveryPrice));
                                break;
                        case 4: System.out.println("        BILL SUMMARY");
                                System.out.println(pizza4 + ", £" + pizza4Price);
                                System.out.println("Delivery charge, £" + deliveryPrice);
                                System.out.println("Total: " + (pizza4Price + deliveryPrice));
                                break;
                        case 5: System.out.println("        BILL SUMMARY");
                                System.out.println(pizza5 + ", £" + pizza5Price);
                                System.out.println("Delivery charge, £" + deliveryPrice);
                                System.out.println("Total: " + (pizza5Price + deliveryPrice));
                                break;
                    }
                } while (!validPizza) ;

        } while (!validInput);
    }
}
