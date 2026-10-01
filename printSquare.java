public class printSquare {
    static void hello(){
        System.out.println("the square of the sum of two numbers is: ");

    }
    
    public static void printSquare(int a, int b){
        int square = ((a+b)*(a+b))-2*a*b;
        System.out.println(square);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        hello();
        printSquare(a,b);
        printSquare(3,4);
    }
    
}
