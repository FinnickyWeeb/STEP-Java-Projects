package Week7AssignmentProblems;

class PasswordCheckerAssignment {
    private final String password;

    PasswordCheckerAssignment(String password) {
        this.password = password;
    }

    public String getStrength() {
        int length = password.length();

        if (length < 6)
            return "Weak";
        else if (length <= 9)
            return "Medium";
        else
            return "Strong";
    }
}

public class Week7A3Password {
    public static void main(String[] args) {
        PasswordCheckerAssignment pc1 =
                new PasswordCheckerAssignment("abcd");

        PasswordCheckerAssignment pc2 =
                new PasswordCheckerAssignment("abcdefgh");

        PasswordCheckerAssignment pc3 =
                new PasswordCheckerAssignment("abcdefghijkl");

        System.out.println(pc1.getStrength());
        System.out.println(pc2.getStrength());
        System.out.println(pc3.getStrength());
    }
}