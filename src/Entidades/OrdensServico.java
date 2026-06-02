package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdensServico {

    private int codigo;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private Funcionarios funcionario;
    private String status;
    private Clientes cliente;
    private Checklists checklist;
    private ArrayList<ServicosOs> listaServicos = new ArrayList<ServicosOs>();
    private ArrayList<PagamentosOs> pagamento = new ArrayList<PagamentosOs>();

    // Constructors


    public OrdensServico(){
        codigo = 0;
        dataEntrada = LocalDateTime.now();
        dataSaida = LocalDateTime.now();
        status = new String();
        listaServicos = new ArrayList<>();
        pagamento = new ArrayList<>();
    }

    public OrdensServico(int codigo, LocalDateTime dataEntrada, LocalDateTime dataSaida, String status, Funcionarios funcionario,
        Clientes cliente, Checklists checklist, ArrayList<ServicosOs>listaServicos, ArrayList<PagamentosOs> pagamento) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.checklist = checklist;
        this.listaServicos = listaServicos;
        this.pagamento = pagamento;
    }

    // Getters and Setters

    public ArrayList<PagamentosOs> getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList<PagamentosOs> pagamento) {
        this.pagamento = pagamento;
    }

    public ArrayList<ServicosOs> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(ArrayList<ServicosOs> listaServicos) {
        this.listaServicos = listaServicos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Checklists getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklists checklist) {
        this.checklist = checklist;
    }

    //toString

    @Override
    public String toString() {

        // Validação para evitar erro (NullPointer)
        String nomeFunc = (funcionario != null) ? funcionario.getNome() : "Não Atribuído";
        String nomeCli = (cliente != null) ? cliente.getNome() : "Não Atribuído";
        String idChecklist = (checklist != null) ? String.valueOf(checklist.getId()) : "N/A";

        return "OrdensServico [Numero = " + codigo + ", dataEntrada = " + dataEntrada + ", dataSaida = " + dataSaida
                + ", funcionario = [" + nomeFunc + "], cliente = [" + nomeCli + "], Checklist ID = " + idChecklist + "]" + "Status da OS [ " + status + "]" ;
    }

    
}
