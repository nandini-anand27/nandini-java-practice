public class trailingZeroesInFactorial {
    public static void main(String[]args){
        int n = 25;
        int zero = 0;
        while(n>0){
            n = n/5;
            zero = zero+n;
        }
        System.out.println("Trailing zeroes in factorial of 25 is: "+zero);
    }
    
}
