import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {


        char[] letras = lerCaracteres(new char[10]);

        int count = contaConsoantes(letras);

        System.out.println(count);

    }

    public static char [] lerCaracteres(char [] letras) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Diga uma letra:");
            char novoChar = sc.next().charAt(0);
            letras[i] = novoChar;
        }
        return letras;
    }

    public static int contaConsoantes(char [] letras) {
        int count = 0;

        char[] vogais = {'a', 'e', 'i', 'o','u'};

        for (int i = letras.length -1; i >= 0 ; i--) {
            boolean ehVogal = false;
            for (int x = vogais.length - 1; x >= 0 ; x--){
                if (vogais[x] == letras[i]){
                    ehVogal = true;
                }
            }
            if(!ehVogal){
                count++;
            }else{
                ehVogal = false;
            }
        }
        return count;
    }
}
