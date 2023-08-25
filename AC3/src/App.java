public class App {
    public static void main(String[] args) throws Exception {

        Evento ev1 =  new Evento("sala 101", "palestra", "26/08/23", 50);

        System.out.println(ev1.nome);
        System.out.println(ev1.totalParticipantes);
        ev1.inscreveParticipante();
        System.out.println(ev1.totalParticipantes);



    }
}
