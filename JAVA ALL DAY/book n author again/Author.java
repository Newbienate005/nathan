public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }

    @Override
    public String toString() {
        return "Authour[name= " + name + ", email= " + email;
    }
}
