package RandomQuestion;

import java.util.Stack;

public class Random6 {
    public static boolean isValidParenthesis(String str) {
        Stack<Character> s1=new Stack<>();

        if(str.length()%2 == 1) {
            return false;
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') {
                s1.push(ch);
            } else if(s1.isEmpty()) {
                return false;
            } else if((s1.peek()=='(' && ch==')') || (s1.peek()=='{' && ch=='}') || (s1.peek()=='[' && ch==']')) {
                s1.pop();
            } else {
                return false;
            }
        }

        if(!s1.isEmpty()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="([}}])";
        if(isValidParenthesis(str)) {
            System.out.println(str+" is valid parenthesis");
        } else {
            System.out.println(str+" is NOT a valid parenthesis");
        }
    }
}
