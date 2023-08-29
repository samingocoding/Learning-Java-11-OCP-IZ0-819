package string_operation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Textsearch {
    public static void main(String[] args) {
        String findString = "findSamuel";
        String search = "Sam";
        System.out.println(findString.lastIndexOf(search));

        System.out.println(findString.lastIndexOf(search,3));

        System.out.println(findString.lastIndexOf(search,7));

        System.out.println("@@@@@@---Matchers---@@@@@@");

        String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();

        System.out.println(matches);

        System.out.println("@@@@@@---Region Matchers---@@@@@@");

        String samuel= "simSamuel";
        System.out.println(samuel.regionMatches(3,"Sam",0,3));
        System.out.println(samuel.regionMatches(true,3,"sam",0,3));

    }
}
