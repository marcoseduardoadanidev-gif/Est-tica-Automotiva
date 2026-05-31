package Entidades;

public class Servicos {

    private int codigo;
    private double valor;
    private String nomeServico;

    // Contructors

    public Servicos(){
        codigo = 0;
        valor = 0.0;
        nomeServico = new String();
    }

    public Servicos(int codigo, double valor, String nomeServico){
        this.codigo = codigo;
        this.valor = valor;
        this.nomeServico = nomeServico;
    }

    //Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String toString(){

        return "Serviço [" + nomeServico + "]" + "Valor R$ " + valor;
    }
    
}
