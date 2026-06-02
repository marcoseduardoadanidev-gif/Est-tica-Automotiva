package Entidades;

public class Servicos {

    private int codigo;
    private double valor;
    private String tipo;

    // Contructors

    public Servicos(){
        codigo = 0;
        valor = 0.0;
        tipo = new String();
    }

    public Servicos(int codigo, double valor, String tipo){
        this.codigo = codigo;
        this.valor = valor;
        this.tipo = tipo;
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

    public String getTipoServico() {
        return tipo;
    }

    public void setTipoServico(String tipo) {
        this.tipo = tipo;
    }

    public String toString(){

        return "Serviço [" + tipo + "]" + "Valor R$ " + valor;
    }
    
}
