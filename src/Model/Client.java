//package src.Model;

    /**
     * @param conta
     */



public class Client {

    static int quantidade;

    private Conta[] contas = new Conta[2];
    String nomeCompleto;
    String nomeSegTitutar;
    String profissao;
    String email;
    int telefone;
    int dinheiroInicial;

    public Client(String nomeCompleto, String nomeSegTitutar,String profissao, String email, int telefone, int dinheiroInicial){
        this.nomeCompleto = nomeCompleto;
        this.nomeSegTitutar = nomeSegTitutar;
        this.profissao = profissao;
        this.email = email;
        this.telefone = telefone;
        this.dinheiroInicial = dinheiroInicial;
        quantidade++;
    }


    void addConta(Conta conta){
        contas[quantidade++] = conta;
    }


}