import gravityfalls.*;

class GravityFalls {
    public static void main(String[] args) {
        String plainText = "abcdefghi", cipherText = "", key1 = "jkl";
        int shift = 2, key2 = 2;
        String key3 = "rhjwebtgb";
        String key4 = "213546879";
        CaesarCipher cipher1 = new CaesarCipher(plainText, shift);
        System.out.println("Cipher Text: " + cipher1.getEncrypted()); // cdefghijk

        AtbashCipher cipher2 = new AtbashCipher(plainText);
        System.out.println("Cipher Text: " + cipher2.getEncrypted());
        // zyxwvutsr

        TranspositionCipher cipher3 = new TranspositionCipher(plainText, key2);
        System.out.println("Cipher Text: " + cipher3.getEncrypted()); // acegibdfh

        VigenereCipher cipher4 = new VigenereCipher(plainText, key1);
        System.out.println("Cipher Text: " + cipher4.getEncrypted()); // jlnmoqprt

        //from here its mine baby:

        AutoKeyCipher cipher5 = new AutoKeyCipher(plainText, key3); // this cipher requires length of plaintext and key same
        System.out.println("Cipher Text: " + cipher5.getEncrypted());

        MonoAlphabetCipher cipher6 = new MonoAlphabetCipher(plainText);
        System.out.println("Cipher Text: " + cipher6.getEncrypted());

        RailFenceCypher cipher7 = new RailFenceCypher(plainText);
        System.out.println("Cipher Text: " + cipher7.getEncrypted());

        RowTransposeCypher cipher8 = new RowTransposeCypher(plainText,key4);
        System.out.println("Cipher Text: " + cipher8.getEncrypted());


    }
}