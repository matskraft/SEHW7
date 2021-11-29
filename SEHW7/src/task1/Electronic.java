package task1;

public class Electronic implements HouseholdItem{
	
	String name;
	
	int lenght;
	int width;
	int height;

	int weight;
	
	Boolean fragile;
	


	public Electronic(String name, int lenght, int width, int height, int weight, Boolean fragile) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
	}

	
//Getters and Setters

	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(Integer width) {
		this.width = width;}

	public Integer getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	public Boolean getFragile() {
		return fragile;}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;}


	@Override
	public void calculateCosts() {
		if(fragile) {
			System.out.println("The Cost for "+name+" is: "+((double)weight/(double)15*(double)5)+"€");
		}else {
			System.out.println("The Cost for "+name+" is: "+((double)weight/(double)10*(double)5)+"€");
		}
	}


	@Override
	public void calculateInstructions() {
		System.out.println(name+":");
		System.out.println(" >should be covered with Polyethylene foam film and packed in a box with dimension: "+(lenght+1)+"x"+(width+1)+"x"+(height+1));
	}
	
	
	

}
