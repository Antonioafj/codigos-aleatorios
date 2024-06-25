public class Pessoa {

    private Integer codigo;
    private String nome;
    private String endereço;
    private Integer idade;
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo + 
        ", nome=" + nome +
         ", endereço=" + 
         endereço + 
         ", idade=" 
         + idade + "]";
    }

}