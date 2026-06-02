package Entidades;

import java.time.LocalDateTime;

public class Pagamentos {

    private int id;
    private String tipo;
    private LocalDateTime dataPagamento;

    // Constructors

    public Pagamentos(){
        id = 0;
        tipo = new String();
        dataPagamento = LocalDateTime.now();
    }

    public Pagamentos(int id, String tipo, LocalDateTime dataPagamento){
        this.id = id;
        this.tipo = tipo;
        this.dataPagamento = dataPagamento;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        return "Pagamento via [" + tipo + "]" + "Realizado na data [ " + dataPagamento + " ID (" + id + ")" + "]";
    }

    
    
}
