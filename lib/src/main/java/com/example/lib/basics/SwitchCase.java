package com.example.lib.basics;

public class SwitchCase {

    public static void main(String[] args) {
        String nameOfMonth = "January";

        switch (nameOfMonth) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "Juli":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown season of the year");
        }

//        int month = 3;
//        switch (month) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Unknown season of the year");
//        }
    }
}
