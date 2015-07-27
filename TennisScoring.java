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
	
	public void displayState()
	{
		if(gameOver()){
			state_d = 0;
			state_e =0;
		}
		if (state_d == 3 && state_e == 3){
			System.out.println("deuce");
		}
		else if (state_d == 4 && state_e == 3) {
			System.out.println("Advantage D");
		}
		else if (state_d == 3 && state_e == 4) {
			System.out.println("Advantage F");
		}
		else {
			System.out.println( "D : " + scoreMap[state_d] + "E : " + scoreMap[state_e])
		}
	}
	
	static void nextState(char point)
	{
		//computes the next point score
	}
}
