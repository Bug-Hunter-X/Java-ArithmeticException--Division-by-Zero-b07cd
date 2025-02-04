public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0; // Initialize z to avoid compilation error 
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); //Handle Exception
            System.out.println(e.getMessage()); // Print Exception message 
        }
        System.out.println(z);
    }
}