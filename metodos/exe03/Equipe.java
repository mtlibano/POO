package poo.exe03.classe;

public class Equipe implements Comparable<Equipe> {

    private String nome;
    private String cidade;
    private String nomeTec;
    private int qtaPontos;
    private int numVitorias;
    private int setsVencidos;
    private int finalCampeonato;
    private String email;


    public Equipe(String n, String c, String nt, int q, int nv, int sv, int fc, String em) {
        this.nome = n;
        this.cidade = c;
        this.nomeTec = nt;
        this.qtaPontos = q;
        this.numVitorias = nv;
        this.setsVencidos = sv;
        this.finalCampeonato = fc;
        this.email = em;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setNomeTec(String nomeTec) {
        this.nomeTec = nomeTec;
    }

    public String getNomeTec() {
        return this.nomeTec;
    }

    public void setQtaPontos(int qtaPontos) {
        this.qtaPontos = qtaPontos;
    }

    public int getQtaPontos() {
        return this.qtaPontos;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public int getNumVitorias() {
        return this.numVitorias;
    }

    public void setSetsVencidos(int setsVencidos) {
        this.setsVencidos = setsVencidos;
    }

    public int getSetsVencidos() {
        return this.setsVencidos;
    }

    public void setFinalCampeonato(int finalCampeonato) {
        this.finalCampeonato = finalCampeonato;
    }

    public int getFinalCampeonato() {
        return this.finalCampeonato;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public int compareTo(Equipe pEquipe) {
        return (this.finalCampeonato - pEquipe.getFinalCampeonato());
    }
}