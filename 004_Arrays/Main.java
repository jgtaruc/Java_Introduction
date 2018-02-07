/* Change the values in numbers so it will not raise an error.
    public class Main {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            int length = numbers[3];
            char[] chars = new char[length];
            chars[numbers.length + 4] = 'y';
            System.out.println("Done!");
        }
    }
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length - 1] = 'y';
        System.out.println("Done!");
    }
}
