package course.MinAndMaxInputChallenge;

import java.util.Scanner;

public class challenge {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        boolean first=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("------------");
        while(1>0){
            System.out.println("Enter Number: ");
            boolean isNum=sc.hasNextInt();
//            int num=sc.nextInt();
//            sc.nextLine();
            if(isNum){
                int num=sc.nextInt();
                sc.nextLine();
//                if(first){
//                    first=false;
//                    min=max=num;
//                }
                if(num<min){
                    min=num;
                }
                else if(num>max){
                    max=num;
                }
            }
            else{
                System.out.println("Maximum Number Entered: "+max);
                System.out.println("Minimum number Entered "+min);
                break;
            }
        }
        sc.close();
    }
}
