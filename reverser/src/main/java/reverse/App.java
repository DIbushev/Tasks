package reverse;

public class App {

    public static void main(String[] args) {
        String example = "String to be reversed";
        System.out.println("Reversed :>" + reverse(example) + "<");
        System.out.println("Reversed :>" + reverse("") + "<");
        System.out.println("Reversed :>" + reverse(null) + "<");
    }

    private static String reverse(String toBeReversed) {
        if (toBeReversed == null) {
            return null;
        }
        String inverted = "";
        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            inverted += toBeReversed.charAt(i) + "";
        }
        return inverted;
    }
}
