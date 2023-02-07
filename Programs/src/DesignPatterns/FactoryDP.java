package DesignPatterns;

public class FactoryDP {
    public static void main(String[] args) {
        Account acc = FactoryDP.getAccount("saving");
    }

}

class Account {
    private int accNo;
    private String accName;

}

class SavingAccount extends Account {

}

class CurrentAccount extends Account {

}

class FactoryDP {
    public static Account getAccount(String type) {
        if (type.equalsIgnoreCase("saving"))
            return new SavingAccount();
        else if (type.equalsIgnoreCase("current"))
            return new CurrentAccount();
    }
}
