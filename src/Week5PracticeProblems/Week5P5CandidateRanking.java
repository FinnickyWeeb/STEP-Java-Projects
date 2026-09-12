package Week5PracticeProblems;

import java.util.Arrays;

class PlacementCandidate implements Comparable<PlacementCandidate> {

    String name;
    double cgpa;
    int codingScore;

    PlacementCandidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double getCompositeScore() {
        return cgpa * 10 + codingScore * 0.5;
    }

    @Override
    public int compareTo(PlacementCandidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }
}

public class Week5P5CandidateRanking {

    static String shortlistAndRank(PlacementCandidate[] candidates) {
        PlacementCandidate[] shortlisted = new PlacementCandidate[candidates.length];
        int count = 0;

        for (PlacementCandidate candidate : candidates) {
            if (PlacementCandidate.isEligible(candidate.cgpa) ||
                    PlacementCandidate.isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        PlacementCandidate[] finalList = Arrays.copyOf(shortlisted, count);

        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {
            result += (i + 1) + ". " + finalList[i].name +
                    " (" + finalList[i].getCompositeScore() + ")";

            if (i < finalList.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PlacementCandidate[] candidates = {
                new PlacementCandidate("Aisha", 8.2, 40),
                new PlacementCandidate("Rohit", 6.8, 65),
                new PlacementCandidate("Meena", 6.0, 90),
                new PlacementCandidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}