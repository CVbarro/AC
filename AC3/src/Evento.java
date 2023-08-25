
public class Evento {
    int totalParticipantes ;
    String local, nome, data;

    Evento(String local, String nome, String data, int totalParticipantes){
        this.local = local;
        this.nome = nome;
        this.totalParticipantes = totalParticipantes;
    }

    void inscreveParticipante() {
        this.totalParticipantes -= 1;
    }
    

}

