public class FullInitializationCheck {
    public static void main(String[] args) {
        double d;
        if (true){
            d = 1;
        }
        System.out.println(d);

        int a;
        do {
            a= 5;
        }while (false);

        System.out.println(a);

        
    }
}
