package model;

public class ContaBanco {

    Integer numero;
    String agencia;
    String nome;
    Double balance;

    public ContaBanco() {

    }

    public ContaBanco(Integer number, String agency, String name, Double balance) {
        this.numero = number;
        this.agencia = agency;
        this.nome = name;
        this.balance = balance;
    }

    public Integer getNumber() {
        return numero;
    }

    public void setNumber(Integer number) {
        this.numero = number;
    }

    public String getAgency() {
        return agencia;
    }

    public void setAgency(String agency) {
        this.agencia = agency;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return	"Olá, " + nome.toUpperCase()+"! "+
                " Agradecemos por criar uma conta em nosso banco, sua agência é: " + agencia +
                ", conta: " + numero +
                ", e seu saldo: " + balance +
                " está disponível para saque.";
    }


}