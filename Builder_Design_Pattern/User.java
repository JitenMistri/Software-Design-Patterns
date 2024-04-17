package Builder_Design_Pattern;

public class User {
    
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    // Inner class to create Objects

    static class UserBuilder {

        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.userId + ":" + this.userName +":"+ this.emailId;
        }

        public User builder() {
            User user = new User(this);
            return user;
        }

    }

}
