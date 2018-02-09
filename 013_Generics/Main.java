import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList foods = new ArrayList<String>();
        for(String arg : args) {
            foods.add(arg);
        }
        for(int i=0; i<foods.size(); i++) {
            System.out.println(foods.get(i));
        }
    }
}