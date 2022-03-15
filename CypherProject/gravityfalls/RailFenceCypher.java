package gravityfalls;

public class RailFenceCypher {
    public String plainText, Text01 = "", Text02 = "", cipherText = "";
    public int key;

    public RailFenceCypher(String plainText) {
        this.plainText = plainText;
        this.key = key;
    }

    public String getEncrypted() {
        for (int i = 0; i < plainText.length(); i++) {
            if (i % 2 == 0) {
                cipherText += plainText.charAt(i);
            }
        }
        for (int i = 0; i < plainText.length(); i++) {
            if (i % 2 != 0) {
                cipherText += plainText.charAt(i);
            }
        }

        return cipherText;
    }
}

