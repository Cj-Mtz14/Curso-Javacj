
public class Palindrome {

     static String removeSpace(String text) {
        return text;
     }


     static boolean isPalindrome(String text) {
        String initialText = text.toLowerCase();
        String noSpacesText = removeSpace(initialText);
        String reverseText = noSpacesText;
        return noSpacesText.equals(reverseText);
     }


     public static void main(String[] args) {
        String textGood = "Atar a la rata ";
        String textBand = "Atar al ratón ";

        String message1 = isPalindrome(textGood) ? "Es palindrome " : "No es palindrome ";
        message1 = "\"" + textGood + "\"" + message1;
     }
}
