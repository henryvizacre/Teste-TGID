public class Produto
{
    private String nome;
    private double preco;
    private double quantidade; 
    
    public Produto(String nome, double preco, double quantidade)
    {
        this.nome           = nome;
        this.precoUnitario  = preco;
        this.quantidade     = quantidade;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public double getPreco()
    {
        return preco;
    }

    public double getQuantidade()
    {
        return quantidade;
    }
    
    public void setNome(String novoNome)
    {
        nome = novoNome;
    }
    
    public void setPreco(double novoPreco)
    {
        if(novoPreco <= 0)
        {
            preco = 1.0;
        }
        else 
        {
            preco = novoPreco;
        }
            
    }
    
    public void setQuantidade(double novaQuantidade)
    {
        if(quantidade < 0)
        {
            quantidade = 1.0;        
        }
        else
        {
            quantidade = novaQuantidade;
        }
    }

    public String getGastoComProduto()
    {
        DecimalFormat duas = new DecimalFormat("0.00");
        return "Produto: " + nome + "   " + 
                "Preço: R$ " + duas.format(preco) + " / kg   " +
                "Quantidade: " + duas.format(quantidade) + " kg   " +
                "Total: R$ " + duas.format(quantidade*preco) + "\n";
    }
    
    
}