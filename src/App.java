import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner t = new Scanner(System.in);

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
    }
}
