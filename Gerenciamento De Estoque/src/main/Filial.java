import java.util.ArrayList;

public class Filial{
    private String nome;
    private String endereco;
    private int numerodeprodutos;
    private ArrayList<Produto> listadeProdutos;
    
    public Filial(String nome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;
        this.numerodeprodutos = 0;
        listadeProdutos = new ArrayList<>();
    }

    public int getNumerodeprodutos() {
        return numerodeprodutos;
    }

    public void setNumerodeprodutos(int numerodeprodutos) {
        this.numerodeprodutos = numerodeprodutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarProduto(Produto produto){
        listadeProdutos.add(produto);
        setNumerodeprodutos(getNumerodeprodutos() + 1);
    }

    public void removerProduto(Produto produto){
        if (listadeProdutos.isEmpty()){
            System.out.println("A lista esta vazia... a operaçao nao pode ser feita");
        }else{
            listadeProdutos.remove(produto);
            setNumerodeprodutos(getNumerodeprodutos() - 1);
        }
    }

    public void produtosArmazenados() {
        System.out.println("<<<<< Lista de Produtos na Filial >>>>> \n");
        for (int i = 0; i < listadeProdutos.size(); i++) {
            System.out.println(listadeProdutos.get(i).toString() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Filial [nome= " + nome + ", endereco= " + endereco + ", numerodeprodutos= " + numerodeprodutos
                + "]";
    }
}
