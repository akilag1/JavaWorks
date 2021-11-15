package course.test6;

//works only with numbers between 1 to 1000

public class challenge6 {
    public static void main(String[] args){
        System.out.println(sumDigits(439));
    }

    public static int sumDigits(int number){
        if(number>=10){
            int mainNum=0;
            if(number>=100 && number<1000){
                mainNum=number/100;
                number=number%100;
            }
           int sum=mainNum+number/10+number%10;
           return sum;
        }
        else{
            return -1;
        }
    }
}
