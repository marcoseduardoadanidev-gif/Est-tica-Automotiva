package Entidades;

public class ServicosOs {

    private int qtd;

    // FK
    private OrdensServico os;
    private Servicos servico;

    // Constructors

    public ServicosOs(){
        qtd = 0;
    }

    public ServicosOs(int qtd, OrdensServico os, Servicos servico){
        this.qtd = qtd;
        this.os = os;
        this.servico = servico;
    }

    public int getQtd(){
        return qtd;
    }

    public OrdensServico getOs(){
        return os;
    }

    public Servicos getServico(){
        return servico;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public void setOs(OrdensServico os){
        this.os = os;
    }

    public void setServico(Servicos servico){
        this.servico = servico;
    }

    public String toString(){

        // Validação para evitar NullPointer

        String nomeServico = (servico != null) ? servico.getNomeServico() : "Serviço não definido";
        String nrProtocolo = (os != null) ? String.valueOf(os.getCodigo()) : "O.S não encontrada";

        return "Serviço [" + nomeServico + "]" + ", Realizado na O.S de numero : " + nrProtocolo;
    }
    
}
