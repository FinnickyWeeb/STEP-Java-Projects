package Week7AssignmentProblems;

class TrafficLightAssignment {
    private String color;
    private final String id;

    TrafficLightAssignment(String id) {
        this.id = id;
        color = "RED";
    }

    public void next() {
        if (color.equals("RED"))
            color = "GREEN";
        else if (color.equals("GREEN"))
            color = "YELLOW";
        else
            color = "RED";
    }

    public String getColor() {
        return color;
    }
}

public class Week7A4Traffic {
    public static void main(String[] args) {
        TrafficLightAssignment t =
                new TrafficLightAssignment("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}