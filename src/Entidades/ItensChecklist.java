package Entidades;

public class ItensChecklist {

    private String status;
    private String observacao;
    private Itens item;
    private Checklists checklist;

    // Constructors

    public ItensChecklist(){
        status = new String();
        observacao = new String();
    }

    public ItensChecklist(String status, String observacao ,Itens item, Checklists checklist) {
        this.status = status;
        this.observacao = observacao;
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
