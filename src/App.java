import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner t = new Scanner(System.in);

        //a
        System.out.println("Ange namn: ");
        String namn = t.nextLine();
        System.out.println("Ange lösenord: ");
        String lösenord = t.nextLine();

        if(namn.equals("root") && lösenord.equals("pass")){
            System.out.println("Ditt bankkonto har 0 kr");
        }
        else{
            System.out.println("Fel namn och lösenord");
        }

        //b
        System.out.println("\n");
        System.out.println("Ange tal: ");
        int tal = t.nextInt();
        if(tal>10){
            System.out.println("Talet är större än 10");
        }
        else{
            System.out.println("Talet är lika med eller mindre än 10");
        }
    }
}
