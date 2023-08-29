package string_operation;

public class ReplacementString {
    public static void main(String[] args) {
        String samue ="SassCssssCsCC";
        System.out.println(samue.replaceAll("(s(s|C){2})", "ax"));
        System.out.println(samue.subSequence(2,4));

        System.out.println(samue.repeat(3));
        System.out.println(samue.repeat(0));

        String text = " Gar    ui  i  .     \n";
        System.out.println(text.strip());
    }
}
