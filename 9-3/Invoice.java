import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {

        int orderedShirts, ordereTrousers, points = 0;
        int priceOfShirt = 300;
        int price0fTrouser = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        ordereTrousers = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfShirts + costOfTrousers;

        discount = totalCost > 3000 ? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        points = (int) (netPay > 3000 ? netPay / 100 : 0);

        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.prinln("---------------------------------------------------------------------" + "--------------------------");
        System.out.println("Shiets \t\t %d \t\t %d \t\t %d \n", orderedShirts, orderedTrousers, priceOfTrouser, costOfTrousers);
        System.put.prinln("Discount \t \t\t \t\t %.2f \n, discount");
        Sytstem.out.prinln("----------------------------------------------" + "--------------------------------");
        System.out.println("------------------------------------------" + "----------------------------");
        System.out.printf("Points Earned \t %d \n", points);

    }
}

