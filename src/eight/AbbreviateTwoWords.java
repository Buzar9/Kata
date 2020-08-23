package eight;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        String result = new String();
        for (int i = 0; i < name.length(); i++) {
            char temporary = name.charAt(i);
            if (Character.isUpperCase(temporary)) {
                result += temporary;
            } else if (Character.isSpaceChar(temporary)) {
                result += ".";
            }
        }

        return result;
    }
}
