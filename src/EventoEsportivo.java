import java.util.ArrayList;

public interface EventoEsportivo {
    Aposta registrarAposta(Aposta aposta);
    double calcularGanho(Aposta aposta);
    String getNomeEvento();
    static void exibirApostas(ArrayList<Aposta> apostas) {
            for(Aposta aposta: apostas){
                System.out.println(aposta);
            }
    }
    static void exibirGanhadores(ArrayList<Aposta> apostas, EventoEsportivo evento) {
        ArrayList<Aposta> ganhadores = new ArrayList<>();
        for (Aposta aposta : apostas) {
            if (evento.calcularGanho(aposta) != 0) {
                ganhadores.add(aposta);
            }
        }

        for (Aposta ganhador : ganhadores) {
            System.out.println(ganhador);
        }
    }


    String getNomeDoEvento();
}
