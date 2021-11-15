package course.test2;

public class challenge2 {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(-2));
    }

    public static float calcFeetAndInchesToCentimeters(int feet,int inches){
        if(feet >=0){
            if(inches>=0 && inches<=12){
                return (feet*12+inches)*2.54f;
            }
        }
        return -1;
    }

    public static float calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){
            int noOfFeet=inches/12;
            int noOfInches=inches%12;
            return calcFeetAndInchesToCentimeters(noOfFeet,noOfInches);
        }
        else {
            return -1;
        }
    }

}
