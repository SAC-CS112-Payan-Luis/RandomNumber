public class RandomNumber1 {
	private int num=0;

	// lab 1 
	public int GetANumber_Between_1_and_10()

	{		
		num= 1 + (int) (Math.random()*10);
		return num;
	}
	//lab 2 with choice of random max 
	public int GetANumber(int high)
	{
		//Returns a number between 0 and High

		num= (int) (Math.random()*high);
		return num;
	}
}