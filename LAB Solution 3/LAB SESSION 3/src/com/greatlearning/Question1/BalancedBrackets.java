package com.greatlearning.Question1;

public class BalancedBrackets {
    public static void main(String[] args) {
        String inp = "({a}";
        int l = inp.length();
        if(l%2==0){
            //Odd length string cannot be a Balanced bracket string
            checkBalanceBrackets(inp);
        }
        else{
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
    public static void checkBalanceBrackets(String inp){
        //If a bracket is opened at 'x' position from left, corresponding closing bracket
       // shall be at 'x' from right
        int front = 0, back = inp.length()-1;
        char chf,chb;
        while(front<back){
            chf = inp.charAt(front);
            chb = inp.charAt(back);
            switch (chf){
                case '{':
                    if(chb!='}'){
                        System.out.println("The entered String does not contain Balanced Brackets");
                        return;
                    }
                     break;
                case '(':
                    if(chb!=')'){
                        System.out.println("The entered String does not contain Balanced Brackets");
                        return;
                    }
                    break;
                case'[':
                    if(chb!=']'){
                        System.out.println("The entered String does not contain Balanced Brackets");
                        return;
                    }
                    break;
                  default:
                       System.out.println("Incorrect Input");
                       return;
            }
            front++;
            back--;
        }
        System.out.println("The entered String contains Balanced Brackets");
    }
}
