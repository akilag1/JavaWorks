package course.test7;

import java.util.Scanner;

public class challenge7{
    public static void main(String[] args){
        System.out.println("------------------Hello Welcome------------------");
        System.out.println("-----------------");
        System.out.println("Enter Numbers one by one and press enter for the submission with each number. Max-10 numbers ");
        System.out.println("-----------------");
        int i=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        while(i<10){
            System.out.println("Enter Number #"+(i+1));
            boolean isNum=sc.hasNextInt();
            if(isNum){
                int num=sc.nextInt();
                sum=sum+num;
                i++;
            }
            else {
                System.out.println("Invalid Number");
                i++;
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Total of 10 numbers: "+sum);
    }
}



