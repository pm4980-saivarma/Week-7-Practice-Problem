public class AttendanceSheet {
    private final String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maximumClassSize) {
        if (maximumClassSize < 0) {
            throw new IllegalArgumentException("Maximum class size must not be negative.");
        }
        presentStudents = new String[maximumClassSize];
    }

    public boolean markPresent(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be null or empty.");
        }
        if (isPresent(name)) {
            return false;
        }
        if (presentCount == presentStudents.length) {
            return false;
        }
        presentStudents[presentCount] = name;
        presentCount++;
        return true;
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {
        if (name == null) {
            return false;
        }
        for (int i = 0; i < presentCount; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}
