package fx;

public class Die12 {
	
	int dieTwelve1,dieTwelve2;
	
	public void roll12(){
		dieTwelve1 = (int)(Math.random()*12)+1;
		dieTwelve2 = (int)(Math.random()*12)+1;
	}
	
	public int getDieTwelve1(){
		return dieTwelve1;
	}
	
	public int getDieTwelve2(){
		return dieTwelve2;
	}

}
