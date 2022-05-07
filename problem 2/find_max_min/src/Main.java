import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        maxmin mn = new maxmin();
        int numberofelements = myObj.nextInt();
        int arr[] = new int[numberofelements];

        for (int i=0;i < numberofelements;i++){
            arr[i]= myObj.nextInt();
        }



        System.out.println(mn.minValue(arr));



    }
}