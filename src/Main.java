import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        Translator translator = new Translator(alphabetic,numeric);
        boolean play = true;
        String ongeldig = "Ongeldige invoer\n";
        Scanner scanner = new Scanner(System.in);

        // Code voor de hoofd-opdracht

        while (play){
            System.out.println("Type\033[1;97m x\u001B[0m" + " om te stoppen \nType\033[1;97m v\u001B[0m om te vertalen");
            String input = scanner.nextLine();
            if(input.equals("x")){
                play=false;
                System.out.println("Programma wordt beëindigd");
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van\033[1;97m 0 t/m 9\u001B[0m");
                int number = scanner.nextInt();
                scanner.nextLine();
                if(number<10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van\033[1;94m " + number + "\u001B[0m is\033[1;94m " + result + "\u001B[0m\n");
                }else {
                    System.out.println(ongeldig);
                }
            }else {
                System.out.println(ongeldig);
            }
        }
    }
}
