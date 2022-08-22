import java.util.Arrays;

public class Main {
    public static int binarySearch (int [] arr,int left , int right , int value){
        if (left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == value ){
                return mid;
            }
            if (arr[mid] < value ){
                return binarySearch(arr, left + 1 , right, value);
            }
            else {
                return binarySearch(arr, left, right - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9,10,11,12,13,14};
        Arrays.sort(arr);
        int x = 6;
        int left = 0;
        int right = arr.length -1;
        int result = binarySearch(arr,left,right,x);

        if (result == -1){
            System.out.println("ko tim thay x");
        }
        else {
            System.out.println("tim thay x tai vi tri " + result);;
        }
    }
}
