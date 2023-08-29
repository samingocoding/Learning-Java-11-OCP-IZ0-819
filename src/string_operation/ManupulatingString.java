package string_operation;

import java.util.Arrays;
import java.util.StringJoiner;

public class ManupulatingString {
    public static void main(String[] args) {
        String name= "";
        String[] nameChar = new String[]{"S","a","m"};
//        for (String charSingle : nameChar)name = name.join(charSingle);
        name = name.join("",nameChar);
        System.out.println(name);

        StringJoiner sj = new StringJoiner("");
        for (String charSingle : nameChar)sj.add(charSingle);
        System.out.println(sj);

        System.out.println("@@@@---Splitting String---@@@@@");
        String sma= "Samuel Mahembe";
        String[] smaSplited= sma.split("-");
        System.out.println(Arrays.toString(smaSplited));


        System.out.println("@@@@@@@@2manipulation");

        String mani = "SamuelSamingo";
        String shortGeorge2 = String.valueOf(mani.toCharArray(), 4, 6);
        System.out.println(shortGeorge2);

        String shortGeorge1 = mani.substring(4, 6);
        System.out.println(shortGeorge1);

    }
}
