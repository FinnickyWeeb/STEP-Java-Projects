package Week9AssignmentProblems;

import java.util.*;

abstract class Parcel {
    double weight;
    double declaredValue;

    Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    abstract double getCharge();

    double getInsurance() {
        return 0;
    }

    double getTotal() {
        return getCharge() + getInsurance();
    }
}

class Standard extends Parcel {
    Standard(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double getCharge() {
        return 40 + (10 * weight);
    }
}

class Express extends Parcel {
    Express(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double getCharge() {
        return 80 + (15 * weight);
    }

    double getInsurance() {
        return declaredValue * 0.02;
    }
}

class Fragile extends Parcel {
    Fragile(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double getCharge() {
        return 40 + (10 * weight) + 50;
    }

    double getInsurance() {
        return declaredValue * 0.02;
    }
}

public class Week9A2ParcelShipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            Parcel parcel;

            if (type.equals("STANDARD")) {
                parcel = new Standard(weight, value);
            } else if (type.equals("EXPRESS")) {
                parcel = new Express(weight, value);
            } else {
                parcel = new Fragile(weight, value);
            }

            double charge = parcel.getCharge();
            double insurance = parcel.getInsurance();
            double total = parcel.getTotal();

            System.out.printf(
                    "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    type, charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}