public class Person {
    private String firstName;
    private String lastName;
    private String residence;

    public Person(String firstName, String lastName, String residence){
        this.firstName = firstName;
        this.lastName = lastName;
        this.residence = residence;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
