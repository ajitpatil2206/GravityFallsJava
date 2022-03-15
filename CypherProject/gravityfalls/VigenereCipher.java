package gravityfalls;
//import java.util.Scanner;

public class VigenereCipher {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String plainText = scanner.nextLine();
        String key = scanner.next();
        String cipherText = "";
        boolean flag = true;

        for (int i=0; i < (plainText.length()/key.length()) - 1; i++) {
            key += key;
        }
        key += key.substring(0, (plainText.length() % key.length()));

        for (int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            } 
            if (Character.isUpperCase(plainText.charAt(i)) && Character.isUpperCase(key.charAt(i))) {
                cipherText += (char)(((((int)plainText.charAt(i) - 65) + ((int)key.charAt(i) - 65)) % 26) + 65);
            }
            else if (Character.isLowerCase(plainText.charAt(i)) && Character.isLowerCase(key.charAt(i))) {
                cipherText += (char)(((((int)plainText.charAt(i) - 97) + ((int)key.charAt(i) - 97)) % 26) + 97);
            }
            else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(cipherText);
        }
        else {
            System.out.println("Please enter plain-text and key either in upper-case or in lower-case!");
        }
    }*/

    public String plainText, key, cipherText = "";
    boolean flag = false;

    public VigenereCipher(String plainText, String key) {
        this.plainText = plainText;
        this.key = key;
    }

    public void generateKey() {
        for (int i=0; i < (plainText.length()/key.length()) - 1; i++) {
            key += key;
        }
        key += key.substring(0, (plainText.length() % key.length()));
    }

    public String getEncrypted() {
        this.generateKey();

        for (int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            } 
            if (Character.isUpperCase(plainText.charAt(i)) && Character.isUpperCase(key.charAt(i))) {
                cipherText += (char)(((((int)plainText.charAt(i) - 65) + ((int)key.charAt(i) - 65)) % 26) + 65);
            }
            else if (Character.isLowerCase(plainText.charAt(i)) && Character.isLowerCase(key.charAt(i))) {
                cipherText += (char)(((((int)plainText.charAt(i) - 97) + ((int)key.charAt(i) - 97)) % 26) + 97);
            }
            else {
                flag = true;
            }
        }

        if (flag) {
            return "Please enter plain-text and key either in upper-case or in lower-case!";
        }

        return cipherText;
    }
}