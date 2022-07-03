package lista22b;

public class Fornecedor {
    private String nomeFornecedor;
    private long telefoneFornecedor;
    private String enderecoFornecedor;
    private long cnpjFornecedor;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public long getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(long telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public long getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(long cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }
}
