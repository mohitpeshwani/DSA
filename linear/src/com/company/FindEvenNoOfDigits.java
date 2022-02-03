package com.company;

public class FindEvenNoOfDigits {
    public static int solution(int arr[]){
        int count=0;
        for(int i:arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int no){
        int count=0;
        while(no!=0){
            count++;
            no=no/10;
        }
        boolean answer= (count%2==0) ?true:false;
        return answer;
    }

    public static void main(String[] args) {
        int array[]={10,2,44,55,6};
        System.out.println(solution(array));
    }
}
