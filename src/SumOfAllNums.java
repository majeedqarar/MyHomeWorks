public class SumOfAllNums {

    public static void main (String[] args) {
    int[] numbers = {12, 3, 4, 6, 8, 22, 16, 89};

    int sum = 0;
    for (int num: numbers) {
        sum = sum + num;

    }
    System.out.println(sum);
    }
}
