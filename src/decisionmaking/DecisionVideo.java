package decisionmaking;

public class DecisionVideo {
    public static void main(String[] args) {
        boolean flagged= false;
        boolean subflaged= false;

        if (flagged);
        else System.out.println("We got 1 unflaged");

        if(flagged)
            if (subflaged) System.out.println("subfleged");
        else System.out.println("subfleged false");
        else if (!flagged) System.out.println("We used else if");
        else System.out.println("flagged false");

        boolean a = false;
        boolean b = false;
        boolean c = false;

        if ((a=true) || (b = true) && (c=true)) System.out.println(a+"\t"+b+"\t"+c);
    }
}
