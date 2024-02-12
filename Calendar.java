/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) 
	{	
		int yearNew = Integer.parseInt(args[0]);
		while (year<=yearNew)
		{
			while (month<=12)
			{
				while (dayOfMonth<=nDaysInMonth(month,year))
				{
					if (((dayOfWeek-1)%7 ==0))
					{
						if (year == yearNew)
						System.out.println(dayOfMonth+"/"+month+"/"+year+ " Sunday");
					}
					else if ((dayOfWeek-1)%7 ==0)
					{
						if (year == yearNew)
						System.out.println(dayOfMonth+"/"+month+"/"+year+ " Sunday");
					}
					else
					{	
						if (year == yearNew)
						System.out.println(dayOfMonth+"/"+month+"/"+year);
					}
					dayOfMonth++;
					dayOfWeek++;
				}
				dayOfMonth=1;
				month++;
			}
			month =1;
			year++;
		}
	}
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	private static void advance()
	{
	
	} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapY = false;
		if ((year%400 ==0) || ((year%4 ==0) && ((year%100) != 0)))
			isLeapY = true;
		return isLeapY;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		boolean checkKind;
		int numDays =0;
		checkKind = isLeapYear(year);
		if (checkKind == true && month == 2)
			numDays =29;
		else if (checkKind == false && month == 2)
			numDays =28;
		else if ((month == 4)|| (month == 6)||(month == 9)|| (month == 11))
			numDays =30;
		else
			numDays = 31;
		return numDays;
	}
}