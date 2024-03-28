import java.util.Arrays;

public class SecondLargeNum {

    public static void main (String [] args) {

        int [] num= {1, 3, 5, 76, 7, 8, 91, 80};

        int size = num.length;

      Arrays.sort(num);

       System.out.println(num[size -2]);

         }

    }


