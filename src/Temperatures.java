public class Temperatures {
    public static void main (String[] args) {

        int temp []={20, 30, 50, 45, 35, 10, 22};

        int maxtem = temp[0];
        int mintem = temp[0];
        for (int t : temp) {
            if (maxtem < t) {
                maxtem = t;

            }
            if (mintem>t) {
                mintem = t;
            }
        }
        System.out.println(maxtem);
System.out.println(mintem);

    }


}
