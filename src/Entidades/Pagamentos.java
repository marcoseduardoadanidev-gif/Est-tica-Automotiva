package Entidades;

import java.time.LocalDateTime;

public class Pagamentos {

    private int codigo;
    private String tipo;
    private LocalDateTime dataPagamento;

    // Constructors

    public Pagamentos(){
        codigo = 0;
        tipo = new String();
        dataPagamento = LocalDateTime.now();
    }

    public Pagamentos(int codigo, String tipo, LocalDateTime dataPagamento){
        this.codigo = codigo;
        this.tipo = tipo;
        this.dataPagamento = dataPagamento;
    }

    // Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // toString

    public String toString(){

        return "Pagamento via [" + tipo + "]" + "Realizado na data [ " + dataPagamento + " ]";
    }

    
    
}
