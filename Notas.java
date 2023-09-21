import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1:");
        float noteOne = sc.nextFloat();

        System.out.println("Nota 2:");
        float noteTwo = sc.nextFloat();

        System.out.println("Nota 3:");
        float noteThree = sc.nextFloat();

        System.out.println("Nota 4:");
        float noteFour = sc.nextFloat();

        float [] notes = {noteOne, noteTwo, noteThree, noteFour};

        float accum = 0;
        for (int i = 0; i < notes.length; i++){
            accum += notes[i];
            System.out.println(notes[i]);
        }
        System.out.println("Media final:" + (accum / notes.length));
    }
}
