//8

public class kdanesalgo {
    static long max(int arr[], int n){
      long res= arr[0];
      long maxcount=arr[0];
      for(int i=1;i<n;i++){
          maxcount=Math.max(maxcount+arr[i], arr[i]);
          res=Math.max(maxcount, res);
      }
      return res;
    }  
  public static void main(String args[])
  {
      int arr[]={1,-2,3,-1,2};
      int n=5;
      System.out.println(max(arr,n));
  }
  }
  