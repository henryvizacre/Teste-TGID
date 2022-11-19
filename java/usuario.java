package usuário;

public class Usuário
{
    private String nome;
    private String cpf;
    private String email;
     
    public Usuário(String nome, String cpf, String email)
    {
        this.nome   = nome;
        this.cpf    = cpf;
        this.email  = email;
    }
    
    public String getNome()
    {
        return nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }
    
    public void setNome(String novoNome)
    {
        nome = novoNome;
    }

    public void setCpf( String newCpf ){
        this.cpf = newCpf;
    }

    public void setEmail( String newEmail ){
        this.cpf = newEmail;
    }
        
}