package gravityfalls;
//import java.util.Scanner;

public class TranspositionCipher {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plainText = scanner.nextLine();
        int key = scanner.nextInt();
        String cipherText = "";
        for (int i=0; i < key; i++) {
            for (int j=i; j < plainText.length(); j += key) {
                cipherText += plainText.charAt(j);
            }
        }
        System.out.println(cipherText);
    }*/
    public String plainText, cipherText = "";
    public int key;

    public TranspositionCipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }   

    public String getEncrypted() {
        for (int i=0; i < key; i++) {
            for (int j=i; j < plainText.length(); j += key) {
                cipherText += plainText.charAt(j);
            }
        }
        return cipherText;
    }
}