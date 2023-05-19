public class binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }

        }
    }
    
}
