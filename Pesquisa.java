import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {

        Opcao [] opcoes = realizaPesquisa();

        float total = calculaTotal(opcoes);

        System.out.println("SO Votos %\n" + "---------------------------");

        for (int i = 0; i < opcoes.length; i++) {
            printaResultados(opcoes[i], total);
        }

        System.out.println("---------------------------");
        System.out.println("Total: " + total);
    }

    public static Opcao [] realizaPesquisa(){
        Scanner sc = new Scanner(System.in);
        Opcao [] opcoes = {new Opcao("Windows Server"), new Opcao("Unix"), new Opcao("Linux"),
                new Opcao("Netware"), new Opcao("Mac OS"), new Opcao("Outros")};

        while(true) {
            System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
            System.out.println("1- Windows Server\n" +
                    "2- Unix\n" +
                    "3- Linux\n" +
                    "4- Netware\n" +
                    "5- Mac OS\n" +
                    "6- Outro\n" +
                    "0- Encerrar");
            int resposta = sc.nextInt();
            if(resposta < 7 && resposta > 0) {
                opcoes[resposta - 1].setVotos(opcoes[resposta -1].getVotos() + 1);
            }
            if(resposta == 0){
                break;
            }
        }
        return opcoes;

    }

    public static float calculaTotal(Opcao [] opcoes){
        float total = 0;
        for (int i = 0; i < opcoes.length; i++) {
            total = total + opcoes[i].getVotos();
        }
        return total;
    }

    public static void printaResultados(Opcao opcao, float total){
        float porcentagem = opcao.getVotos() *  100 / total  ;
        System.out.println(opcao.getNome() + " " + opcao.getVotos() + " " + porcentagem + "%");
    }

    public static class Opcao{
        String nome;

        int votos;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getVotos() {
            return votos;
        }

        public void setVotos(int votos) {
            this.votos = votos;
        }

        public Opcao(String nome) {
            this.nome = nome;
            this.votos = 0;
        }
    }
}
