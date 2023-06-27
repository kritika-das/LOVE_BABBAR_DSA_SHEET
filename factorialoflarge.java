// 22
public class factorialoflarge {
    


    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> result = new ArrayList<>();
        int size = 0;
        int carry = 0;
        result.add(0, 1);
        size = 1;
        int val = 2;
        
        while (val <= N) {
            for (int i = size - 1; i >= 0; i--) {
                int temp = result.get(i) * val + carry;
                result.set(i, temp % 10);
                carry = temp / 10;
            }
            
            while (carry != 0) {
                result.add(0, carry % 10);
                carry /= 10;
                size++;
            }
            
            val++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> factorialDigits = factorial(N);
        
        System.out.print(N + "! = ");
        for (int digit : factorialDigits) {
            System.out.print(digit);
        }
    }
}


