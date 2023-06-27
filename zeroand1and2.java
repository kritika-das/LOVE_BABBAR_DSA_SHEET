// Sort an array of 0s, 1s and 2s
//5

class Szeroand1and2
{
    public static void sort012(int a[], int n)
    {
        
      int high = a.length-1, mid =0, low =0, temp;
      while (mid<=high ) {
          switch(a[mid]) {
              case 0: 
                  temp = a[low];
                  a[low]=a[mid];
                  a[mid]= temp;
                  mid++;
                  low++;
                  break;
                case 1 :
                    mid++;
                    break;
                case 2:
                    temp=a[high];
                    a[high]=a[mid];
                    a[mid] = temp;
                    high--;
                    break;
                    
          }
      }
    }
}