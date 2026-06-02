package Entidades;

public class Veiculos {

    private int codigo;
    private String modelo;
    private String placa;
    private String cor;
    private Categorias categoria;
    private Clientes cliente;

    // Constructors

    public Veiculos(){
        codigo = 0;
        modelo = new String();
        placa = new String();
        cor = new String();
    }

    public Veiculos(int codigo, String modelo, String placa, String cor, Categorias categoria, Clientes cliente){
        this.codigo = codigo;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.categoria = categoria;
        this.cliente = cliente;
    }

    // Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        
        // Validação para evitar erro (NullPointer)
        String tipoCategoria = (categoria != null) ? categoria.getClassificacao() : "N/A";
        
        return "Veiculos [codigo=" + codigo + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor
                + ", categoria=" + tipoCategoria + "]";
    }
    

    
    
}
