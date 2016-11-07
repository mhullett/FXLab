package fx;

public class Die8 {
	
	int dieEight1,dieEight2;
	
	public void roll8(){
		dieEight1 = (int)(Math.random()*8)+1;
		dieEight2 = (int)(Math.random()*8)+1;
	}
	
	public int getDieEight1(){
		return dieEight1;
	}
	
	public int getDieEight2(){
		return dieEight2;
	}

}
