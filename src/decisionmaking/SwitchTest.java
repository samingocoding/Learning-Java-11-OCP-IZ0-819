package decisionmaking;

public class SwitchTest {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5};
        stafr_for:
        for (int i = 0 ; i<numbers.length; i++){
            switch (numbers[i]){
                case 2:
                    System.out.println("Got 2");
                    break;
                case 3:
                    System.out.println("Got 3");
                    break stafr_for;
                case 4:
                    System.out.println("Got 4");
                    break;
                case 5:
                    System.out.println("Got 5");
                    break;
            }
        }
    }
}
