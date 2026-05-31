package Entidades;

public class Itens {

    private int codigo;
    private String nomeItem;

    // Constructors

    public Itens(){
        codigo = 0;
        nomeItem = new String();
    }

    public Itens(int codigo, String nomeItem){
        this.codigo = codigo;
        this.nomeItem = nomeItem;
    }

    // Getters and Setters

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNomeItem(){
        return nomeItem;
    }

    public void setNomeItem(String nomeItem){
        this.nomeItem = nomeItem;
    }

    public String toString(){
        return nomeItem;
    }
    
}
