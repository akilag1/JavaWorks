package course.test6;

public class challenge6 {
    public static void main(String[] args){

    }

    public static int sumDigits(int number){
        if(number>=10){
            int mainNum=number/10;
            do{
                int sum=mainNum+number%10;
                return sum;
            }while(main);
        }
        else{
            return -1;
        }
    }
}
