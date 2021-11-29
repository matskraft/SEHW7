package task1;

public class Glass implements HouseholdItem{
	
	String name;
	int lenght;
	int width;
	int height;

	int tickness;

	
	public Glass(String name, int lenght, int width, int height, int tickness) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.tickness = tickness;
	
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getTickness() {
		return tickness;}

	public void setTickness(int tickness) {
		this.tickness = tickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void calculateCosts() {
		switch(tickness) {
			case 1:
				System.out.println("The Cost for "+name+" is: "+(lenght*2)+"€");
				break;
			case 2:
				System.out.println("The Cost for "+name+" is: "+(lenght*1.2)+"€");
				break;
			case 3:
				System.out.println("The Cost for "+name+" is: "+(lenght*0.7)+"€");
				break;
		}
	}



	@Override
	public void calculateInstructions() {
		System.out.println(name+":");
		System.out.println(" >should be wrapped with bubble wraps and packed in a box with dimension: "+(lenght+1)+"x"+(width+1)+"x"+(height+1));
	}

	
	


}