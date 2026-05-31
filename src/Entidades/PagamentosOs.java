package Entidades;

import java.util.ArrayList;

public class PagamentosOs {

    private String status;
    private double valorPago;

    private ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();

    // FKs

    private Pagamentos pagamento;
    private OrdensServico os;

    // Constructors

    public PagamentosOs(){
        status = new String();
        valorPago = 0.0;
        listaPagamentos = new ArrayList<>();
    }

    public PagamentosOs(String status, double valorPago, ArrayList<Pagamentos> listaPagamentos, Pagamentos pagamento, OrdensServico os){
        this.status = status;
        this.valorPago = valorPago;
        this.listaPagamentos = listaPagamentos;
        this.pagamento = pagamento;
        this.os = os;
    }

     // Getters and Setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public ArrayList<Pagamentos> getListaPagamentos() {
        return listaPagamentos;
    }

    public void setListaPagamentos(ArrayList<Pagamentos> listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }

    public Pagamentos getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamentos pagamento) {
        this.pagamento = pagamento;
    }

    public OrdensServico getOs() {
        return os;
    }

    public void setOs(OrdensServico os) {
        this.os = os;
    }

    @Override
    public String toString(){

        // Validações para evitar NullPointer

        String descPagamento = (pagamento != null) ? pagamento.toString() : "Sem registro de pagamento";
        String codOs = (os != null) ? String.valueOf(os.getCodigo()) : "N/A";
        
        return descPagamento + "\nReferente à Ordem de Serviço [" + codOs + "]";
    }
    
}
