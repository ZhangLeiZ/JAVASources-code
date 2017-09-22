package Paly;

public class Carclass extends Car {
	
	public Carclass(){
		
	}
	
	public Carclass(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	public Carclass(float radii){
		this.radii=radii;
		
	}
	public Carclass(float down,float high){
		this.down=down;
		this.high=high;
	}
	public Carclass(float up,float downe,float highe){
		this.up=up;
		this.downe=downe;
		this.highe=highe;
	}
	

	@Override
	public float dispaly() {
		
		return down*high/2;
	}

	@Override
	public float dispaly2() {
		
		return 3.14f*radii*radii;
	}

	@Override
	public float dispaly3() {
		
		return (downe+up)*highe/2;
	}

	@Override
	public void getAer() {
		System.out.println("商标: "+brand+"\t"+"颜色："+color);
		
	}

}
