package course.test4;

public class challenge4 {
    public static void main(String[] args){
        printDayOfTheWeek(10);
    }

    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0 ->System.out.println("Sunday");
            case 1 ->System.out.println("Monday");
            case 2 ->System.out.println("Tuesday");
            case 3 ->System.out.println("Wednesday");
            case 4 ->System.out.println("Thursday");
            case 5 ->System.out.println("Friday");
            case 6 ->System.out.println("Saturday");
            default ->System.out.println("Invalid Day");
        }
    }

}
