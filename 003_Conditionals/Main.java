//Change the variables so that each if statement resolves as true.
public class Main {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = new String("Wow");
        String sameA = a;

        boolean r1 = a == b;      // This is false, since a and b are not the same object
        boolean r2 = a.equals(b); // This is true, since a and b are logically equals
        boolean r3 = a == sameA;  // This is true, since a and sameA are really the same object
        boolean r4 = 1 == 4 ? true : false; // false
        String r5 = "this" == "not" ? "same" : "but" == "is" ? "same" : "different";

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
