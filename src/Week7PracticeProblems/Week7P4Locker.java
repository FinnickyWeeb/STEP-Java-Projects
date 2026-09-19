package Week7PracticeProblems;

class LockerPractice {
    private String code;
    private final int lockerNumber;

    LockerPractice(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public void changeCode(String currentCode, String newCode) {
        if (code.equals(currentCode))
            System.out.println("Code changed successfully");
        else {
            System.out.println("Code change rejected");
            return;
        }

        code = newCode;
    }
}

public class Week7P4Locker {
    public static void main(String[] args) {
        LockerPractice l = new LockerPractice(101, "1234");

        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}