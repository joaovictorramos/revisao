package lista22b;

public class Mercadorias extends Fornecedor{
    private String nome;
    private float valorCompra;
    private float valorVenda;
    private int validade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        float vV = (float) (this.getValorCompra()+(this.getValorCompra()*(0.3)));
        setValorVenda(vV);
        
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        
        this.valorVenda = valorVenda;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    @Override
    public void setCnpjFornecedor(long cnpjFornecedor) {
        super.setCnpjFornecedor(cnpjFornecedor); 
    }

    @Override
    public long getCnpjFornecedor() {
        return super.getCnpjFornecedor(); 
    }

    @Override
    public void setEnderecoFornecedor(String enderecoFornecedor) {
        super.setEnderecoFornecedor(enderecoFornecedor);
    }

    @Override
    public String getEnderecoFornecedor() {
        return super.getEnderecoFornecedor(); 
    }

    @Override
    public void setTelefoneFornecedor(long telefoneFornecedor) {
        super.setTelefoneFornecedor(telefoneFornecedor);
    }

    @Override
    public long getTelefoneFornecedor() {
        return super.getTelefoneFornecedor(); 
    }

    @Override
    public void setNomeFornecedor(String nomeFornecedor) {
        super.setNomeFornecedor(nomeFornecedor); 
    }

    @Override
    public String getNomeFornecedor() {
        return super.getNomeFornecedor(); 
    }
}
