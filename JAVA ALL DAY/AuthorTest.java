public class AuthorTest {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paultan@nowhere.caom");
        System.out.println("name is " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }

}
