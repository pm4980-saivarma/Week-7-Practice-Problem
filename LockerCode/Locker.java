public class Locker {
    private final int lockerNumber;
    private String combinationCode;

    public Locker(int lockerNumber, String initialCode) {
        if (initialCode == null || initialCode.isEmpty()) {
            throw new IllegalArgumentException("Combination code must not be null or empty.");
        }
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (currentCode == null || !combinationCode.equals(currentCode)) {
            return false;
        }
        if (newCode == null || newCode.isEmpty()) {
            throw new IllegalArgumentException("New combination code must not be null or empty.");
        }
        combinationCode = newCode;
        return true;
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");
        System.out.println("Correct code accepted: " + locker.changeCode("1234", "5678"));
        System.out.println("Wrong code accepted: " + locker.changeCode("0000", "9999"));
    }
}
