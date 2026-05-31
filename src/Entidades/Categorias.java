package Entidades;

public class Categorias {

    private int codigo;
    private String tipo;

    public Categorias(){
        codigo = 0;
        tipo = new String();
    }

    public Categorias(int codigo, String tipo){
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String toString(){
        return "Categoria [" + tipo + "]";
    }
}
