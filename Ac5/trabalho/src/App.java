import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoCrud crud = new AlunoCrud();


        Aluno aluno1 = new Aluno("Quadrat", "Ciencia da computação", "12345");
        Aluno aluno2 = new Aluno("Firmeza", "ADS", "67890");
        crud.adicionarAluno(aluno1);
        crud.adicionarAluno(aluno2);

        ArrayList<Aluno> listaAlunos = crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
        String matriculaBusca = "202303378785";
        Aluno alunoEncontrado = crud.buscarAluno(matriculaBusca);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
            crud.atualizarCurso(matriculaBusca, "Ciências da Computação");
            System.out.println("Curso atualizado: " + alunoEncontrado.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }
        String matriculaRemover = "67890";
        crud.removerAluno(matriculaRemover);

        listaAlunos = crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

}
