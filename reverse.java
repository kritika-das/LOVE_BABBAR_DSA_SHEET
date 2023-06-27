//reverse an array in java
// 1
import java.util.*;
class reverse {
    static void reversearr(int arr[],int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }
    public static void main(String args[]) {
        int arr[]={10,5,7,30};
        int n=4;
        System.out.println("before reversal");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        
    }
    System.out.println();
    reversearr(arr,n);

    System.out.println("after reversal");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        
    }
}
}
