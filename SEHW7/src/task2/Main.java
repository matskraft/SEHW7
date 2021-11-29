package task2;

public class Main {

	public static void main(String[] args) {
		Sports Teakwondo= new Sports("Teakwondo",4,1);
		Sports Waterpolo= new Sports("Waterpolo",8,3);
		Sports ArtisticGym= new Sports("Artistic Gymnastics",5,0);
		Sports Shooting= new Sports("Shooting",2,1);
		Sports Cycling= new Sports("Cycling",9,3);
		Sports Tennis= new Sports("Tennis",4,2);
		Sports TableTennis= new Sports("Table Tennis",6,4);
		Sports FootbalGER= new Sports("Footbal",2,0);
		Sports AlpineSky= new Sports("Alpine Sky",10,2);
		Sports FootbalITA= new Sports("Footbal",3,2);
		Sports Swimming= new Sports("Swimming Team",15,5);
		
		SubTeam WomenCH = new SubTeam("Women's Team",0,0);
		SubTeam MenCH = new SubTeam("Men's Team",0,0);
		SubTeam WomenGER = new SubTeam("Women's Team",0,0);
		SubTeam MenGER = new SubTeam("Men's Team",0,0);
		SubTeam WomenITA = new SubTeam("Women's Team",0,0);
		SubTeam MenITA = new SubTeam("Men's Team",0,0);
		
		SubTeam China = new SubTeam("China Team",0,0);
		SubTeam Germany = new SubTeam("Germany Team",0,0);
		SubTeam Italy = new SubTeam("Italy Team",0,0);
		
		SubTeam Asia = new SubTeam("Asia Team",0,0);
		SubTeam Europe = new SubTeam("Europa Team",0,0);
		
		SubTeam Olympics = new SubTeam("Olympics Team",0,0);
		
		WomenCH.addTeam(Teakwondo);
		WomenCH.addTeam(Waterpolo);
		WomenCH.addTeam(ArtisticGym);
		
		MenCH.addTeam(Shooting);
		
		WomenGER.addTeam(Cycling);
		WomenGER.addTeam(Tennis);
		
		MenGER.addTeam(TableTennis);
		MenGER.addTeam(FootbalGER);
		
		WomenITA.addTeam(AlpineSky);
		MenITA.addTeam(Swimming);
		
		China.addTeam(WomenCH);
		China.addTeam(MenCH);
		
		Germany.addTeam(MenGER);
		Germany.addTeam(WomenGER);
		
		Italy.addTeam(WomenITA);
		Italy.addTeam(MenITA);
		
		Asia.addTeam(China);
		Europe.addTeam(Germany);
		Europe.addTeam(Italy);
		
		Olympics.addTeam(Asia);
		Olympics.addTeam(Europe);
		
		MenGER.printNameAthlete();
		Germany.printNameMedals();
		Asia.printNameMedals();
		Olympics.printNameAthlete();
		
	}

}
