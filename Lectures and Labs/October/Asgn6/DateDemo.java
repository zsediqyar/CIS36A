class DateDemo
{
	public static void main(String[] args) {
		Date date = new Date(1, 3, 2000);
		System.out.println("Entered Date: \t DAY: [" + date.day + "] \t MONTH: [" + date.month + "] \t YEAR: [" + date.year + "]");
		System.out.println("# Of Days Since January Of [" + date.year + "] --> [" + date.daySinceJan1() + "] days");
	}
}