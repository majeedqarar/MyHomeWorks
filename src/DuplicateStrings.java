public class DuplicateStrings {
    public static void main (String[] args) {
String [] arr = {"andre", "Tom", "mike", "bob", "bob", "sam", "Nancy" };

String name = arr[0];
for (int i=0; i <arr.length; i++) {
    for (int j = i+1; j <arr.length; j++) {

        if (arr [i] == arr [j]) {

            System.out.println("The depublicate value found is: " + arr[i]);

        }


    }



}


    }


}
