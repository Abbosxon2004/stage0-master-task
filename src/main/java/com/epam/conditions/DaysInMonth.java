package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (month==2&&isLeapYear)
        {
            System.out.println(29);
            return;
        }

        switch (month){
            case 2:
                System.out.println(28);break;
            case 1,3,5,7,8,10,12:
                System.out.println(31);break;
            case 4,6,9,11:
                System.out.println(30);break;
            default:System.out.println("invalid date");break;
        }
    }

}
