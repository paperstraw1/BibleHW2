package Biblehw2;
public class biblehw2 {

	public static int years(long[] numPeople) {
		long[] Disciples = new long[numPeople.length];
		int year = 0;
		Disciples[18] = 13;
		while(!allConverted(numPeople, Disciples)) {
			year++;
			
			for(int x = numPeople.length - 1; x > 0; x--) {
				numPeople[x] = numPeople[x - 1];					Disciples[x] = Disciples[x - 1];
				}
			numPeople[0] = 0;
			Disciples[0] = 0;
			long disciples = allConvert(Disciples);
			long allConvert = disciples * 2;
			int age = 18;
			if(year % 3 == 0) {
				while(allConvert > 0 && age < 73) {
					long available = numPeople[age] - Disciples[age];
					if(allConvert < available) {
						Disciples[age] = allConvert + Disciples[age];
						allConvert = 0;
					}else { 
						Disciples[age] = available + Disciples[age];
						allConvert = allConvert - available;
					}
						age++;
					}
			}	
				numPeople[0] = numPeople[30];
			}
		return year;
		}
	public static boolean allConverted(long[] people, long[] Disciples) {
		long totalPeople = 0;
		long totalDisciples = 0;
		for(int i = 0; i < people.length; i++) {
			totalPeople = people[i] + totalPeople;
			totalDisciples = Disciples[i] + totalDisciples;
			}
			return(totalPeople == totalDisciples);
		}
	public static long allConvert(long[] Disciples) {
		long totalConverted = 0;
		for(int i = 0; i < Disciples.length; i++) {
			totalConverted = Disciples[i] + totalConverted;
			}
		return totalConverted;
		}
	public static void main(String[] args) {
		long[] people = new long[73];
		people[18] = 7700000000L;
			
		System.out.println("It will take " + years(people) + " years to convert everyone in the world. ");
		}
}