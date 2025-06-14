import java.util.ArrayList;

public class SistemaApostas {
    ArrayList<EventoEsportivo> eventos;

    public SistemaApostas() {
        eventos = new ArrayList<>();
    }

    public void adicionarEvento(EventoEsportivo evento) {
        eventos.add(evento);
    }

    public String buscarEvento(String nomeDoEvento) {
        for (EventoEsportivo evento : eventos) {
            if (evento.getNomeEvento().equals(nomeDoEvento)) {
                return nomeDoEvento;
            }
        }
        return null;
    }

    public void exibirTodosEventos() {
        for (EventoEsportivo evento : eventos) {
            System.out.println(" " + evento);
        }
    }
}