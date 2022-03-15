package gravityfalls;

import java.util.Arrays;

public class RowTransposeCypher {
    public String plainText, cipherText = "";
    public String key;

    public RowTransposeCypher(String plainText, String key) {
        this.plainText = plainText;
        this.key = key;
    }

    public String getEncrypted() {
        char temp[][] = new char [plainText.length()][key.length()];
        char msg[] = plainText.toCharArray();
        int x=0;
        int y=0;

        for (int i=0; i< msg.length;i++)
        {
            temp[x][y]=msg[i];
            if (y==(key.length()-1))
            {
                y=0;
                x=x+1;
            }
            else
            {
                y++;
            }
        }

       char SortedKey[] = new char [key.length()];
       SortedKey = key.toCharArray();
       Arrays.sort(SortedKey);

        for (int j=0; j<key.length(); j++){
            char posChar = key.charAt(j);
            int pos = posChar-1;
           for (pos = 0; pos < key.length(); pos++){
               if (key.charAt(j)== SortedKey[pos]){
                   break;
               }
           }

            for (int i=0; i<x; i++){
                cipherText += temp[i][pos];
            }

        }

        return cipherText;
    }
}
