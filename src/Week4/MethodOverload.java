package Week4;

public class MethodOverload {
    public static float addNumbers(float num1, float num2) {
        return num1 + num2;
    }

    public static float addNumbers(double num1, double num2) {
        return (float) (num1 + num2);
    }

    public static float addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static float addNumbers(long num1, long num2) {
        return num1 + num2;
    }

    public static float addNumbers(short num1, short num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        float result1 = addNumbers(1.5f, 2.5f);
        float result2 = addNumbers(3.6, 4.7);
        float result3 = addNumbers(5, 6);
        float result4 = addNumbers(7L, 8L);
        float result5 = addNumbers((short) 9, (short) 10);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    }
}
