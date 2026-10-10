public final class NameTag {
    private final String firstName;
    private final String lastName;

    public NameTag(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name must not be null.");
        }
        String[] nameParts = fullName.split(" ", -1);
        if (nameParts.length != 2 || nameParts[0].isEmpty() || nameParts[1].isEmpty()) {
            throw new IllegalArgumentException("Full name must contain a first and last name.");
        }
        firstName = nameParts[0];
        lastName = nameParts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("Nickname: " + tag.getNickname());
    }
}
