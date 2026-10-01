public class sumOfTwoNums {
    static void message(){
        System.out.println("the sum is");

    }
    public static int addNums( int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        message();
        System.out.println(addNums(a,b));
        System.out.println(addNums(3,4));
    }
    
}
