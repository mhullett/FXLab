package fx;

public class Die {
	
	int die1,die2;
	
	public void roll(){
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
	}
	
	public int getDie1(){
		return die1;
	}
	
	public int getDie2(){
		return die2;
	}

}
