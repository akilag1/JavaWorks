package course.test3;

public class challenge3 {
    public static void main(String[] args){
        System.out.println(getDurationString(3800));
    }

    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0){
            if(seconds>=0 && seconds<=59){
                int hourVal=minutes/60;
                int minVal=minutes%60;
                return hourVal+"hh "+minVal+"mm "+seconds+"ss";
            }
            else {
                return "invalid value";
            }
        }
        else {
            return "invalid value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minVal=seconds/60;
            int secVal=seconds%60;
            return getDurationString(minVal,secVal);
        }
        else {
            return "invalid value";
        }
    }

}
