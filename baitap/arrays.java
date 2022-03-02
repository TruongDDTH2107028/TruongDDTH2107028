package baitap;

public class arrays {
    public static void main ( String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);
        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers1.length; ++i) {
            for(int j = 0; j < myNumbers1[i].length; ++j) {
                System.out.println(myNumbers1[i][j]);
            }
        }
    }
}
