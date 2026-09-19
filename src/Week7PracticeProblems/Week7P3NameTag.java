package Week7PracticeProblems;

class NameTagPractice {
    private final String firstName;
    private final String lastName;

    NameTagPractice(String fullName) {
        String[] parts = fullName.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class Week7P3NameTag {
    public static void main(String[] args) {
        NameTagPractice tag = new NameTagPractice("Maria Gomez");

        System.out.println("Nickname: " + tag.getNickname());
    }
}