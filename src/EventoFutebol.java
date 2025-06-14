import java.util.ArrayList;

public abstract class EventoFutebol implements EventoEsportivo {
    private String nomeDoEvento;
    private String vencedor;
    private ArrayList<Aposta> apostas;

    public EventoFutebol(String nomeDoEvento, String vencedor) {
        this.nomeDoEvento = vencedor;
        this.vencedor = vencedor;
        this.apostas = new ArrayList<>();
    }
    @Override
    public Aposta registrarAposta(Aposta aposta) {
        apostas.add(aposta);
        return aposta;
    }

    @Override
    public double calcularGanho(Aposta aposta){
        double Ganho = aposta.getValorApostado();
        if(aposta.getResultadoEscolhido().equals(vencedor)){
            return Ganho*10;
        }
        else{
            return Ganho*0;
        }
    }
    @Override
    public String getNomeDoEvento(){
        return nomeDoEvento;
    }
    public ArrayList<Aposta> getApostas(){
        return apostas;
    }
}