import java.util.Scanner;



public class VowelSorterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter text to be sorted by the number of vowels: ");
            String inputText = scanner.nextLine();

            StringBuffer textBuffer = new StringBuffer(inputText.replaceAll("\\s+", " "));

            Text text = new Text(textBuffer);
            StringBuffer sortedText = TextProcessor.processText(text);

            System.out.println("Sorted text: " + sortedText);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
