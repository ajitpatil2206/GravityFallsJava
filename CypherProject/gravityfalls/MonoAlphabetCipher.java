package gravityfalls;

public class MonoAlphabetCipher {
    public String plainText, cipherText = "";
    public String alphabets = "MQRTYVJXUOPWSACDFEIZBHLKNG";

    public MonoAlphabetCipher(String plainText) {
        this.plainText = plainText;
    }

    public String getEncrypted() {
        for(int i=0; i<plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            if (Character.isLowerCase(plainText.charAt(i))) {
                cipherText += Character.toLowerCase(alphabets.charAt(i));
            }
            else {
                cipherText += (alphabets.charAt(i));
            }
        }
        return cipherText;
    }
}
