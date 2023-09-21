public class Disciplinas {

    public static class Disciplina{
        String nome;

        String requisito;

        Professor Professor;

        int cargaHoraria;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRequisito() {
            return requisito;
        }

        public void setRequisito(String requisito) {
            this.requisito = requisito;
        }

        public Disciplinas.Professor getProfessor() {
            return Professor;
        }

        public void setProfessor(Disciplinas.Professor professor) {
            Professor = professor;
        }

        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        public Disciplina(String nome, String requisito, Disciplinas.Professor professor, int cargaHoraria) {
            this.nome = nome;
            this.requisito = requisito;
            Professor = professor;
            this.cargaHoraria = cargaHoraria;
        }
    }

    public static class Professor{
        String nome;

        String area;

        int sala;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getSala() {
            return sala;
        }

        public void setSala(int sala) {
            if(sala > 0 && sala <= 400) {
                this.sala = sala;
            }
        }

        public Professor(String nome, String area, int sala) {
            this.nome = nome;
            this.area = area;
            this.sala = sala;
        }
    }

    public static void main(String[] args) {
        Professor professorUm = new Professor("professor1","teste", 200);
        Disciplina disciplinaUm = new Disciplina("disciplinaTeste1", "nenhum", professorUm, 40);

        Professor professorDois = new Professor("professor2","teste2", 202);
        Disciplina disciplinaDois = new Disciplina("disciplinaTeste2", "disciplinaTeste1", professorDois, 44);


        Disciplina [] disciplinas = {disciplinaUm, disciplinaDois};

        for (int i = 0; i < disciplinas.length; i++){
            System.out.println("Disciplina: " + disciplinas[i].getNome());
            System.out.println("Professor: " + disciplinas[i].getProfessor().getNome());
            System.out.println("Requisito: " + disciplinas[i].getRequisito());
        }

    }
}
