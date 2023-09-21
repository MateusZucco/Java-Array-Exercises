import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        char[] respostas = fazPerguntas();

        String resultado = analisaRespostas(respostas);

        System.out.println(resultado);
    }

    public static char [] fazPerguntas(){
        Scanner sc = new Scanner(System.in);

        String[] perguntas = {"Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"};

        char[] respostas = new char[5];

        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            System.out.println("y/n");
            char resposta = sc.next().charAt(0);
            respostas[i] = resposta;
        }
        return respostas;
    }

    public static String analisaRespostas(char [] respostas){
        int summ = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i] == 'y') {
                summ++;
            }
        }

        switch (summ){
            case 2:
                return "Suspeito!";
            case 3, 4:
                return "Cúmplice!";
            case 5:
                return "Assassino!";
            default:
                return "Inocente!";
        }
    }
}
