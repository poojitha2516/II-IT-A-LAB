//Enumeration

class EnumEx {
	public enum Weeks {
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	
	public static void main(String args[]) {
		for(Weeks w : Weeks.values())
		System.out.println(w);
	}
}
