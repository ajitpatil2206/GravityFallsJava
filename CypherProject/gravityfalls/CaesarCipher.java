package gravityfalls;
//import java.util.Scanner;

public class CaesarCipher {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String plainText = scanner.nextLine();
        int shift = scanner.nextInt();
        String cipherText = "";

        for (int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            if (Character.isUpperCase(plainText.charAt(i))) { 
                cipherText += (char)(((int)plainText.charAt(i) + shift - 65) % 26 + 65); 
            } 
            else { 
                cipherText += (char)(((int)plainText.charAt(i) + shift - 97) % 26 + 97); 
            } 
        }
        System.out.println(cipherText);
    }*/
    public String plainText, cipherText = "";
    public int shift;

    public CaesarCipher(String plainText, int shift) {
        this.plainText = plainText;
        this.shift = shift; 
    }

    public String getEncrypted() {
        for (int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            if (Character.isUpperCase(plainText.charAt(i))) { 
                cipherText += (char)(((int)plainText.charAt(i) + shift - 65) % 26 + 65); 
            } 
            else { 
                cipherText += (char)(((int)plainText.charAt(i) + shift - 97) % 26 + 97); 
            } 
        }
        return cipherText;
    }
}