public class ShopSales {
    public static void main(String[] args) {

        int[][][] sales = {
            { {10, 20, 30}, {15, 25, 35} },
            { {5, 10, 15}, {8, 16, 24} }
        };

        System.out.println("Sales Data:");
        for (int branch = 0; branch < sales.length; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");
            for (int month = 0; month < sales[branch].length; month++) {
                System.out.print("Month " + (month + 1) + ": ");
                for (int product = 0; product < sales[branch][month].length; product++) {
                    System.out.print(sales[branch][month][product] + " ");
                }
                System.out.println(); // new line for next month
            }
            System.out.println(); // extra line for next branch
        }

      
        int totalBranch1 = 0;
        for (int month = 0; month < sales[0].length; month++) {
            for (int product = 0; product < sales[0][month].length; product++) {
                totalBranch1 += sales[0][month][product];
            }
        }

        System.out.println("Total sales for Branch 1: " + totalBranch1);
    }
}
