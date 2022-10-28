package onboarding;

import java.util.List;

class Problem1 {
    public static boolean isSuccessivePage(List<Integer> pagenumber){
        if (pagenumber.get(1) - pagenumber.get(0)!=1){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isLeftOddNumber(List<Integer> pagenumber){
        if(pagenumber.get(0)%2==1){
            return true;
        }else{
            return false;
        }
    }
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        if(isSuccessivePage(pobi)==false||isSuccessivePage(crong)==false){
            answer=-1;
            return answer;
        }
        if(isLeftOddNumber(pobi)==false||isLeftOddNumber(crong)==false){
            answer=-1;
            return answer;
        }


        return answer;
    }
}