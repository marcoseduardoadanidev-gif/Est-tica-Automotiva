package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Checklists {

    private LocalDateTime data;
    private int id;
    private Veiculos veiculo;
    private Funcionarios funcionario;
    private ArrayList<ItensChecklist> listaCheckList = new ArrayList<>();

    // Constructors 

    public Checklists(){
        data = LocalDateTime.now();
        id = 0;
    }

    public Checklists(LocalDateTime data, int id, Veiculos veiculo, Funcionarios funcionario, ArrayList<ItensChecklist> listaChecklist) {
        this.data = data;
        this.id = id;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.listaCheckList = listaChecklist;
    }

      // Getters and Setters

       public ArrayList<ItensChecklist> getListaCheckList() {
        return listaCheckList;
    }

    public void setListaCheckList(ArrayList<ItensChecklist> listaCheckList) {
        this.listaCheckList = listaCheckList;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }    


    // toString 

    @Override
    public String toString(){

        // Validação para evitar erro (NullPointer)
        String descVeiculo = (veiculo != null) ? veiculo.getPlaca() : "N/A";
        String nomeFunc = (funcionario != null) ? funcionario.getNome() : "N/A";

        return "Protocolo [" + id + "] Data [" + data + "] Veículo Placa [" + descVeiculo + "] Funcionario [" + nomeFunc + "]";
    }
    
}
