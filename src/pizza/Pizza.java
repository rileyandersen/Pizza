package pizza;

import input.InputHandler;

public class Pizza {

    public static void main(String[] args) {
        double pizzaRadius1 = InputHandler.getNonNegativeDouble("Enter the diameter of pizza 1 (in inches): ") / 2;
        double pizzaPrice1 = InputHandler.getNonNegativeDouble("Enter the price of pizza 1: ");
        
        double pizzaArea1 = pizzaRadius1 * pizzaRadius1 * Math.PI;
        double pizzaAreaPerDollar1 = pizzaArea1 / pizzaPrice1;
        
        double pizzaRadius2 = InputHandler.getNonNegativeDouble("Enter the diameter of the pizza 2 (in inches): ") / 2;
        double pizzaPrice2 = InputHandler.getNonNegativeDouble("Enter the price of pizza 2: ");
        
        double pizzaArea2 = pizzaRadius2 * pizzaRadius2 * Math.PI;
        double pizzaAreaPerDollar2 = pizzaArea2 / pizzaPrice2;

        System.out.printf("The area of pizza 1 is %.2f square inches.\n", pizzaArea1);
        System.out.printf("Pizza 1 gets you %.2f square inches of pizza per dollar.\n", pizzaAreaPerDollar1);
        
        System.out.printf("The area of pizza 2 is %.2f square inches.\n", pizzaArea2);
        System.out.printf("Pizza 2 gets you %.2f square inches of pizza per dollar.\n", pizzaAreaPerDollar2);
        
        if (pizzaAreaPerDollar1 > pizzaAreaPerDollar2) {
            System.out.println("Pizza 1 gives you better value.");
            System.out.printf("Pizza 1 gives you %.2f%% better value.\n", (pizzaAreaPerDollar1 / pizzaAreaPerDollar2 - 1) * 100);
        }
        else if (pizzaAreaPerDollar2 > pizzaAreaPerDollar1) {
            System.out.println("Pizza 2 gives you better value.");
            System.out.printf("Pizza 2 gives you %.2f%% better value.\n", (pizzaAreaPerDollar2 / pizzaAreaPerDollar1 - 1) * 100);
        }
        else {
            System.out.println("Both pizzas give you the same value.");
        }
    }
}