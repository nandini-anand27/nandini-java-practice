public class methods {
    public static void message(String name, int birthYear){
        int age = 2026-birthYear;
        System.out.println("Hello "+name+"! You are "+age+" years old.");
    }
    public static void main(String[] args) {
        message("Nandini", 2007);
        message("John", 1995);
        message("Alice", 1988);
    }
    
}
