package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Winter");break;
            case 3,4,5:
                System.out.println("Spring");break;
            case 6,7,8:
                System.out.println("Summer");break;
            case 9,10,11:
                System.out.println("Autumn");break;
            default:
                System.out.println("Wrong month number");break;
        }
    }
}
