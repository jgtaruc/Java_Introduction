/* List of all primitive types in java:
    * byte (number, 1 byte)
    * short (number, 2 bytes)
    * int (number, 4 bytes)
    * long (number, 8 bytes)
    * float (float number, 4 bytes)
    * double (float number, 8 bytes)
    * char (a character, 2 bytes)
    * boolean (true or false, 1 byte)
*/

/*
Create all of the primitives (except long and double) with different values. 
Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true
*/
public class Main {
    public static void main(String[] args) {
        byte a = 3;
        short b = 11;
        int c = 0;
        char d = 'd';
        float e = 2.0f;
        boolean f = true;
        
        System.out.println("H" + a + b + c + " wor1" + d + " " + e + " " + f);
    }
}