package seven;

//Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD

public class AlternateCase {

    static String alternateCase(final String string) {

        String result = new String();
        for (int i = 0; i < string.length(); i++) {
            char temporary = string.charAt(i);
            if (temporary < 97){
                result += Character.toString(temporary).toLowerCase();
            } else {
                result += Character.toString(temporary).toUpperCase();
            }
        }
        return result;
    }
}
