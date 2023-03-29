package chap18_enum.enums;

public enum RGB {

	RED("red",255, 0, 0), 
	GREEN ("green",0,255,0),
	BLUE ("blue",0,0,255);
	
	private String color;
	private int redN;
	private int greenN;
	private int blueN;

	RGB(String color, int redN, int greenN, int blueN) {
		this.color = color;
		this.redN = redN;
		this.greenN = greenN;
		this.blueN = blueN;
	}

	public String getColor() {
		return color;
	}

	public int getRedN() {
		return redN;
	}

	public int getGreenN() {
		return greenN;
	}

	public int getBlueN() {
		return blueN;
	}
	
}
