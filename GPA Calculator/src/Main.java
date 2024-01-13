import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Creating a Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("How Many Scores Would You Be Entering: ");
        int noOfScores = in.nextInt();


//      Making Data Elements
        ArrayList<Double> score = new ArrayList<>();
        //double[] score;
        ArrayList<Double> weight = new ArrayList<>();
        //double[] weight;
        double numerator = 0;
        double denominator = 0;

        for (int i = 0; i < noOfScores; i++){
            System.out.println("Enter The Score Of Course " + (i + 1));
            double placeHolderScore = in.nextDouble();
            // Assigning grades
            if (placeHolderScore >= 70 && placeHolderScore <= 100) {
                placeHolderScore = 4;
            } else if (placeHolderScore >= 60 && placeHolderScore < 70) {
                placeHolderScore = 3;
            } else if (placeHolderScore >= 50 && placeHolderScore < 60) {
                placeHolderScore = 2;
            } else if (placeHolderScore >= 35 && placeHolderScore < 50) {
                placeHolderScore = 1;
            } else if (placeHolderScore >= 0 && placeHolderScore < 35) {
                placeHolderScore = 0;
            } else {
                System.out.println("Invalid Score");
                System.exit(0);  // Exit the program if an invalid score is entered
            }
            score.add(placeHolderScore);
            //Implement a system to assign the scores to a grade(A,B,C) ?Could Use If Statements

            System.out.println("Enter The Weight Of The Course " + (i + 1));
            double placeHolderWeight = in.nextDouble();
            weight.add(placeHolderWeight);
        }

        //
        for (int j = 0; j < score.size(); j++) {
            System.out.println("Score: " + score.get(j));
            System.out.println("Weight: " + weight.get(j));

            // Accumulate the weighted sum
            numerator += score.get(j) * weight.get(j);
        }

        for (int j = 0; j < weight.size(); j++) {
            denominator += weight.get(j);
        }

        // Calculate and display the final result
        double weightedAverage = numerator / denominator;
        System.out.println("Weighted Average: " + weightedAverage);

        in.close();
}}