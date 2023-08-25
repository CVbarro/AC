public class Aluno{
    String nome, email;
    int total;

    Aluno(String nome, int total, String email){
        this.nome = nome;
        this.total = total;
        this.email = email;
    }
    void matriculaEvento(){

        if (nome != null){
            this.total += 1;
        }
    }

}