package gravityfalls;

public class AutoKeyCipher {
    public String plainText, key, cipherText = "";
    boolean flag = false;

    public AutoKeyCipher(String plainText, String key) {
        this.plainText = plainText;
        this.key = key;
    }

    public String getEncrypted() {

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
