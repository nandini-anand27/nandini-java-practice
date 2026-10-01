public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }

    public static void main(String[] args) {
        int a = 6;
        int result = smallestEvenMultiple(a);
        System.out.println(a);
    }
}
    
