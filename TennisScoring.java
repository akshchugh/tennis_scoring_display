package tennisscoring;

import java.util.Scanner;

public class TennisScoring {

    private int state_d=0;
    private int state_f=0;
    private int[] scoreMap = {0, 15, 30, 40};
        
     void nextState(char point) {
            if (point=='d')
                state_d+=1;
            else
                state_f+=1;
            
            if ((state_d==4)&&(state_f==4)) {
                state_d-=1;
                state_f-=1;
            }
    }
     
    public boolean gameOver() {
        if ( state_f < 4 && state_d < 4) {
            return false;
        }
        if ( state_f - state_d >= 2) {
            System.out.print ("F won the game ; ");
            return true;
        }
        else if ( state_d - state_f >=2) {
            System.out.print ("D won the game ; ");
            return true;
        }
        return false;
    }
    
    void displayState() {        
        if(gameOver()){
            state_d = 0;
            state_f =0;
        }
        else if (state_d == 4 && state_f == 3) {
            System.out.println("Advantage D");
        }
        else if (state_d == 3 && state_f == 4) {
            System.out.println("Advantage F");
        }
        else {
            System.out.println( "D : " + scoreMap[state_d] + "  F : " + scoreMap[state_f]);
        }
        
    }
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        TennisScoring score=new TennisScoring();
        score.displayState();
        for(int i=0;i<input.length();i++)
        {
            score.nextState(input.charAt(i));
            score.displayState();
        }       
       
    }
    
}
