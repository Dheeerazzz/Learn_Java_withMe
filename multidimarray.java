import java.util.Arrays;
import java.util.Scanner;

public class multidimarray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        System.out.println(Arrays.toString(arr[0]));

        //taking input
        int[][] arr2=new int[3][3];
        System.out.println(arr.length);
        Scanner in=new Scanner(System.in);
        for (int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j]=in.nextInt();
            }
        }

        //output#1
        for (int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }
        //output#2
        for(int i=0;i<arr2.length; i++){
           System.out.println(Arrays.toString(arr2[i])); 
        }
        //output#3
        for (int[] a: arr2){
            System.out.println(Arrays.toString(a));

        }
    }
    
}
