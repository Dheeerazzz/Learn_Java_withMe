import java.net.Socket;

public class strarrays {
    public static void main(String[] args) {
        String[] arr=new String[4];
        System.out.println(arr[0]);
        String[] arr2={"a","b","c"};
        System.out.println(arr2.length); 
        int n=arr2.length;
        //loop thorugh the elements in the array to print
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
