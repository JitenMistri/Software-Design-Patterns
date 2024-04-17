package Builder_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        
        User user = new User.UserBuilder()
                    .setUserName("jitenMistri")
                    .setUserId("User123")
                    .setEmailId("User@user.com")
                    .builder();

        System.out.println(user);
    }
}
