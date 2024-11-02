public class Customer {
    int id;
    String name;
    char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer name is " + name + " Customer id is " + id + " Customer gender is " + gender;
    }
}

