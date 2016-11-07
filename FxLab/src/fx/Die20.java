package fx;

public class Die20 {
	
	int dieTwenty1,dieTwenty2;
	
	public void roll20(){
		dieTwenty1 = (int)(Math.random()*20)+1;
		dieTwenty2 = (int)(Math.random()*20)+1;
	}
	
	public int getDieTwenty1(){
		return dieTwenty1;
	}
	
	public int getDieTwenty2(){
		return dieTwenty2;
	}

}
