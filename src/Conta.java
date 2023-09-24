public class Conta {
    int number;
    String agency;
    String name;
    double balance;

    public Conta() {
    }

    public Conta(int number, String agency, String name, double balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Olá " +name+ " obrigado por criar uma conta em nosso banco, sua agência é "+ agency
        +", conta " +number+ " e e seu saldo "+ String.format(String.valueOf(balance), "%.2f")  
        + "já está disponível para saque";
    }

    

}
