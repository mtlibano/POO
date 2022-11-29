package poo.exe04.classe;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private int anoNasc;
    private char sexo;
    private double salario, peso, altura, acumSalario;
    private int contadorM, contadorF, contadorT;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcIdade() {
        LocalDate dataAtual = LocalDate.now();
        return String.valueOf(dataAtual.getYear() - this.anoNasc);
    }

    public double calcImc() {
        return this.peso / (this.altura * this.altura);
    }

    public void calcNum() {
        if (this.sexo == 'M' || this.sexo == 'm') {
            this.contadorM++;
            this.contadorT++;
        } else if (this.sexo == 'F' || this.sexo == 'f') {
            this.contadorF++;
            this.contadorT++;
        }
        System.out.println("Total de homens: " + this.contadorM);
        System.out.println("Total de mulheres: " + this.contadorF);
    }

    public void calcAcum() {
        this.acumSalario += this.salario;
        System.out.println("Somatório salários: " + this.acumSalario);
    }

    public double calcMedia() {
        return this.acumSalario / this.contadorT;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Ano de nascimento: " + this.anoNasc + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "Salário: " + this.salario + "\n" +
                "Peso: " + this.peso + "kg\n" +
                "Altura: " + this.altura + "m";
    }
}