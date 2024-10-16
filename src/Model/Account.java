package Model;

public class Account {
    public String id;
    public String name;
    public int balance;

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Account(String id, String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance"); }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= this.balance){
            another.balance += amount;
            this.balance -= amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
