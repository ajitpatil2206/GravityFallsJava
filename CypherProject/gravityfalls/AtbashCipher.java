package gravityfalls;
//import java.util.Scanner;

public class AtbashCipher {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String plainText = scanner.nextLine();

        String cipherText = "";
        
        for(int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            if (Character.isLowerCase(plainText.charAt(i))) {
                cipherText += Character.toLowerCase(alphabets.charAt(25 - ((int)Character.toUpperCase(plainText.charAt(i)) - 65))); 
            }
            else {
                cipherText += (alphabets.charAt(25 - ((int)plainText.charAt(i) - 65)));
            }
        }
        System.out.println(cipherText);
    }*/
    public String plainText, cipherText = "";
    public String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public AtbashCipher(String plainText) {
        this.plainText = plainText;
    }

    public String getEncrypted() {
        for(int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            if (Character.isLowerCase(plainText.charAt(i))) {
                cipherText += Character.toLowerCase(alphabets.charAt(25 - ((int)Character.toUpperCase(plainText.charAt(i)) - 65))); 
            }
            else {
                cipherText += (alphabets.charAt(25 - ((int)plainText.charAt(i) - 65)));
            }
        }
        return cipherText;
    }
}