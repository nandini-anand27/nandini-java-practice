public class exponentUsingRecursion {
    public static void main(String[]args){
        int result= power(2,5);
        System.out.println("2 raised to the power 5 is: "+result);
    }
    static int power(int base, int exp){
        if(exp==0){
            return 1;
        }
        else{
            return base*power(base,exp-1);
        }
    }
}
