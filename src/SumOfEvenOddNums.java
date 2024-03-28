public class SumOfEvenOddNums {

    public static void main (String [] args) {
        int sum = 0;
        int aa = 0;
        int[][] numbers = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12}
        };
        for (int i = 0;  i <=2-1;  i++) {
            for (int j=0; j <=6-1;  j++) {
               sum = sum + numbers[i][j];

            }

        }
        System.out.print(sum + " ");


    }


}
