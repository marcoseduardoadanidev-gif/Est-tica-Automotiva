package Entidades;

public class ItensChecklist {

    private String status;
    private String observacao;
    private int qtd;
    private Itens item;
    private Checklists checklist;

    // Constructors

    public ItensChecklist(){
        status = new String();
        observacao = new String();
        qtd = 0;
    }

    public ItensChecklist(String status, String observacao, int qtd ,Itens item, Checklists checklist) {
        this.status = status;
        this.observacao = observacao;
         this.qtd = qtd;
        this.item = item;
        this.checklist = checklist;
       
    }

    // Getters and Setters


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Itens getItem() {
        return item;
    }

    public void setItem(Itens item) {
        this.item = item;
    }

    public Checklists getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklists checklist) {
        this.checklist = checklist;
    }


    // tostring

    @Override
    public String toString(){

        // Validação para evitar erro (NullPointer)
        String nomeItemExibicao = (item != null) ? item.getNomeItem() : "Item Nulo";
        
        return nomeItemExibicao + ", Status [" + status + "]" + ", OBS: " + observacao; 
    }
}
