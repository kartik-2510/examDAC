public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("First 100 odd numbers:");
        while (count < 100) {
            System.out.println(number);
            number += 2;
            count++;
        }
    }
}