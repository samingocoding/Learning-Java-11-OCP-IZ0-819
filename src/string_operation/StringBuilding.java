package string_operation;

public class StringBuilding {
    public static void main(String[] args) {
        // creates empty builder
        // An empty StringBuilder always has initial capacity of 16
        StringBuilder sb = new StringBuilder();

        // adds 5 character string at beginning
        sb.append("Hello");
        System.out.println("sb.length 5 =" + sb.length());
        System.out.println("sb.capacity 16 = " + sb.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2.length  5= " + sb2.length());

        // Capacity is the initial capacity (16) + "Hello".length()
        System.out.println("sb2.capacity 21= " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder();
        // Add 26 character string at beginning, which exceeds the
        // initial capacity of 16
        sb3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb3.length 26 = " + sb3.length());
        System.out.println("sb3.capacity 42= " + sb3.capacity());

        // You can set initial capacity manually
        StringBuilder sb4 = new StringBuilder(26);
        // Add 26 character string at beginning
        sb4.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb4.length 26= " + sb4.length());
        System.out.println("sb4.capacity 52= " + sb4.capacity());

        System.out.println("@@@@@@@@@@@INSERT METHODS@@@@@@@@@@@@@@@@");

        StringBuilder sb6 = new StringBuilder(100);
        sb6.insert(0, "Hello , is a float with the value of ")
                .insert(6, new char[]{'W', 'o', 'r', 'l', 'd'})
                .insert(13, (Object) "My ")
                .insert(16, "NewNumber ", 3, 10)
                .insert(sb6.length(), 204.5f);

        System.out.println("sb2 = " + sb6);
        System.out.println("sb2.length() = " + sb6.length());
        System.out.println("sb2.capacity() = " + sb6.capacity());

        System.out.println("@@@@@@@@@@@APPEND METHODS@@@@@@@@@@@@@@@@");

        StringBuilder sb7 = new StringBuilder(100);
        sb7.append("Hello ")
                .append(new char[]{'W', 'o', 'r', 'l', 'd'})
                .append(',')
                .append((Object) " My ")
                .append("NewNumber ", 3, 9)
                .append(" is ")
                .appendCodePoint(97)
                .append(" float with the value of: ")
                .append(204.50f);
        System.out.println("sb = " + sb7);
        System.out.println("sb.length() = " + sb7.length());
        System.out.println("sb.capacity() = " + sb7.capacity());

        System.out.println("@@@@@@@@@@@TRY METHODS@@@@@@@@@@@@@@@@");
        StringBuilder sam = new StringBuilder(16);
//        sam.insert(0,"Sam"); //outof bounds >0
        sam.append("Samuel");
        sam.append("ccc33",0,3);

        System.out.println(sam);
    }
}
