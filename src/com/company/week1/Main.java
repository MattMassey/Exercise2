package com.company.week1;

public class Main {

    public static void main(String[] args) {
	    int weeklyHighs[] = {45, 29, 10, 22, 41, 28, 33};
	    int precipChance[] = {95, 60, 25, 5, 0, 75, 90};
	    String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	    for (int i = 0; i<weeklyHighs.length; i++) {
	        if (weeklyHighs[i] <= 32 && precipChance[i] > 50) {
                System.out.println("It is likely to snow on " + daysOfWeek[i] + ".");
            }
        }
    }
}
