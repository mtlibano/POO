package poo.exe02.classe;

public class Visitantes {
    private String nome;
    private String fone;
    private String cidade;
    private char sexo;
    private String profissao;
    private int anoNasc;

    public Visitantes(String n, String f, String c, char s, String p, int a) {
        this.setNome(n);
        this.setFone(f);
        this.setCidade(c);
        this.setSexo(s);
        this.setProfissao(p);
        this.setAnoNasc(a);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return this.fone;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getAnoNasc() {
        return this.anoNasc;
    }
}