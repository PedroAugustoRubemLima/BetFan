import java.util.ArrayList;
public class Aposta{
    private String apostador;
    private double valorApostado;
    private String resultadoEscolhido;
    public Aposta(String apostador, double valorApostado, String resultadoEscolhido) {
        this.apostador = apostador;
        this.valorApostado = valorApostado;
        this.resultadoEscolhido = resultadoEscolhido;
    }
    String getResultadoEscolhido(){
        return resultadoEscolhido;
    }
    double getValorApostado(){
        return valorApostado;
    }
    @Override
    public String toString(){
        String detalhesAposta;
        detalhesAposta = "Apostador:"+apostador+"valorApostado:"+valorApostado+"resultadoEscolhido:"+resultadoEscolhido;
        return detalhesAposta;
    }
}
