public class factorialUsingRecursion {
    public static void main(String[]args){
        int result = factorialNum(7);
        System.out.println("Factorial of 7 is: "+result);
    }
    static int factorialNum(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorialNum(n-1);
        }
    }
}
