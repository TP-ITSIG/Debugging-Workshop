public class Person {
    private final String firstName;
    private final String lastName;
    private final boolean reverseFirstAndLastName;

    public Person(String firstName, String lastName, boolean reverseFirstAndLastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reverseFirstAndLastName = reverseFirstAndLastName;
    }

    public String getFullName() {
        if (this.reverseFirstAndLastName) {
            return this.lastName + " " + this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
