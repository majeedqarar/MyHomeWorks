public class MaxMinNums {

    public static void main (String [] args) {
    int max  = 12;
    int min = 3;
    int[] num = {1, 3, 5, 6, 7, 12, 80};

    for (int n : num) {
        if (max < n) {
            max = n;
        }

    } System.out.println(max);

        for (int n : num) {
            if (min > n) {
                min = n;
            }
        } System.out.println(min);


    }
}
