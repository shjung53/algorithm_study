package inflearn.first;

import java.util.Scanner;

public class String_2 {
    public String solution(String str) {
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        String_2 T = new String_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}


