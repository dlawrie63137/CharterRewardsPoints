// A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
//
// A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
//
// (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
//
// Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.
//
// • Make up a data set to best demonstrate your solution
//
// • Check solution into GitHub


package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Array 1 = 450 points
    // Array 2 = 1105 points
    // Array 3 = 541 points
    // Total Points = 2096 points

       int[][] dataTestSet = {{21, 50, 100, 150, 200}, {50, 51, 101, 200, 251, 300}, {200, 151, 99, 120}};
       int pointsThisMonth = 0;
       int totalPoints = 0;
       int temp = 0;
       int i;
       int j;

            for (i = 0; i < dataTestSet.length; i++) {
                for (j = 0; j < dataTestSet[i].length; j++) {
                    if ((dataTestSet[i][j] > 50) && (dataTestSet[i][j] <= 100)) {
                        pointsThisMonth = pointsThisMonth + dataTestSet[i][j] - 50;
                    }
                    if (dataTestSet[i][j] > 100) {
                        pointsThisMonth = pointsThisMonth + 50;
                        temp = 2 * (dataTestSet[i][j] - 100);
                        pointsThisMonth = pointsThisMonth + temp;
                        //out.println(dataTestSet[i]);
                    }
                }
                out.println("Points earned in month " + (i + 1) + ": " + pointsThisMonth);
                totalPoints = totalPoints + pointsThisMonth;
                pointsThisMonth = 0;
            }
                out.println("Total points earned: " + totalPoints);
        }
}
