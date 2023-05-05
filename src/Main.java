import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz : ");

        heat = input.nextInt();
        if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(heat >= 15 && heat<25){
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=5 && heat<15){
            System.out.println("Sinemaya gidebilirsin");
        }else if(heat < 5){
            System.out.println("Kayak Yapabilirsin");
        }
    }
}