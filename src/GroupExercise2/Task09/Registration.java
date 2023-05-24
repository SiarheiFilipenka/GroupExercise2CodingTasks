package GroupExercise2.Task09;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("email available");
        } else {
            System.out.println("email must be only yahoo");
        }
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("username cannot be empty");
        } else if (userName.length() <= 6) {
            System.out.println("username must be larger than 6 characters");
        } else {
            this.userName = userName;
            System.out.println("username is available");
        }
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("password cannot be empty");
        } else if (password.contains(userName.toLowerCase())) {
            System.out.println("password cannot contain username");
        } else {
            this.password = password;
            System.out.println("password is available");
        }
    }
}