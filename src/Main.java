import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static void main(String[] args) {
        SistemaApostas sistemaapostas = new SistemaApostas();
        ArrayList<Aposta> apostasEvento = new ArrayList<>();
        EventoFutebol futebol = new EventoFutebol("Brasil vs Argentina", "Brasil") {
            @Override
            public String getNomeEvento() {
                return "";
            }
        };
        sistemaapostas.adicionarEvento(futebol);
        Aposta apostaana = futebol.registrarAposta(new Aposta("Ana",200, "Argentina"));
        Aposta apostacarlos = futebol.registrarAposta(new Aposta("Carlos",100,"Brasil"));
        apostasEvento.add(apostaana);
        apostasEvento.add(apostacarlos);
        System.out.println(futebol.getApostas());
        System.out.println(futebol.calcularGanho(apostaana));
        System.out.println(futebol.calcularGanho(apostacarlos));
        System.out.println("\nGanhadores do evento Brasil vs Argentina:");
        EventoEsportivo.exibirGanhadores(apostasEvento, futebol);

    }
}