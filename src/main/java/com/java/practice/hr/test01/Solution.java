import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class PasswordSanitizer{

    public String filter(List<String> passwords){
        List<String> validPasswords = new ArrayList<>();

        for(String password : passwords){
            if(password.length()>=5 && !password.contains(" ")){
                char[] chars = password.toCharArray();
                boolean ischar = false;
                boolean isNum = false;
                for (Character c : chars) {
                    if(Character.isLetter(c)){
                        ischar = true;
                    }
                    if(Character.isDigit(c)){
                        isNum = true;
                    }
                }
                if(isNum && ischar){
                    validPasswords.add(password);
                }

            }
        }
        return String.join(" ", validPasswords);

    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        //reader and writer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] passwords = bufferedReader.readLine().split(" ");

        PasswordSanitizer ps = new PasswordSanitizer();

        String output = ps.filter(Arrays.asList(passwords));

        bufferedWriter.write(output);
        bufferedWriter.newLine();;

        bufferedReader.close();
        bufferedWriter.close();
    }
}