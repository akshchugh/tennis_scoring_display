class TennisScoring {
	private int state_d,state_f;
	private int[] scoreMap = {0, 15, 30, 40};
	
	static void nextState(char point)
	{
		if((state_d==4)&&(state_f==4))
            {
                state_d-=1;
                state_f-=1;
            }
            if(point=='d')
                state_d+=1;
            else
                state_f+=1;
	}
	static void displayState()
	{
		//Displays the present score to be displayed 
	}
	static void nextState(char point)
	{
		//computes the next point score
	}
}
