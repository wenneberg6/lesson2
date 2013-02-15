public class Person {
    private String name;
    private Cprno cpr;
    private double balance;
    private String address;
    
    public Person(String name, Cprno cpr, String address) {
        this.name = name;
        this.cpr = cpr;
        this.address = address;
        this.balance = 0.0;
    }

    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public Cprno getCprno() {
        return this.cpr;
    }
    
    public void addBalance(double amount) {
        this.balance += amount;
    }
    
    public void setBalance(double amount) {
        this.balance = amount;
    }
    
    public String toString() {
        String s = String.format("%12s %40s: %8.2f", this.cpr, this.getName(), this.getBalance());
        return s;
    }
    
    public static void main(String[] args) {
        Cprno c = new Cprno(1212120012L);
        Person p2 = new Person("Jim", c, "Vejen 12");
        System.out.println(p2);
        //p1.addBalance(3333.67);
        //System.out.println(p1);
    }
}
