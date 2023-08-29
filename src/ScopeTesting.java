public class ScopeTesting {


    public static void main(String[] args) {
        int i = 10;

        for (var r = 0;r<5;r++){
            
        }

        class localyClass{
            {
                System.out.println(i + "This in in sid class");
            }
        }
    }
}
