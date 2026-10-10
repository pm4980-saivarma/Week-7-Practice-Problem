public class PiggyBank {
    private final String id;
    private int savings;

    public PiggyBank(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID must not be null or empty.");
        }
        this.id = id;
        this.savings = 0;
    }

    public String getId() {
        return id;
    }

    public int getSavings() {
        return savings;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        savings += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > savings) {
            return false;
        }
        savings -= amount;
        return true;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        System.out.println("After deposit: " + pb.getSavings());
        pb.withdraw(30);
        System.out.println("After withdrawal: " + pb.getSavings());
        System.out.println("Large withdrawal accepted: " + pb.withdraw(500));
        System.out.println("Final savings: " + pb.getSavings());
    }
}
