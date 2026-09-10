public class TextFormatter {

    // Method 1
    static String formatText(String text) {
        return text.toUpperCase();
    }

    // Method 2
    static String formatText(String text, int times) {
        String result = "";

        for (int i = 0; i < times; i++) {
            result += text;

            if (i < times - 1) {
                result += " ";
            }
        }

        return result;
    }

    // Method 3
    static String formatText(String text, String prefix) {
        return "[" + prefix + "] " + text;
    }

    public static void main(String[] args) {
        System.out.println(formatText("hello"));
        System.out.println(formatText("Echo", 3));
        System.out.println(formatText("System updated", "INFO"));
    }
}