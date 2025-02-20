public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pluralize(String word){
		String wordLowercase = word.toLowerCase();
		if (wordLowercase.endsWith("ey")){
			return "eys";
		}
		else if (wordLowercase.endsWith("y")){
			return "ies";
		}
		else if (wordLowercase.endsWith("ife")){
			return "ives";
		}
		else {
			return "s";
		}
	}
	public static int min (int num1, int num2, int num3){
		if (num1 < num2 && num1 < num3) {
			return num1;
		}
		else if (num2 < num1 && num2 < num3){
			return num2;
		}
		else {
			return num3;
		}
	}
	public static boolean isLeapYear(int year){
		boolean bool = false; 
		if (year%4 == 0){
			if (year%100 == 0){
				if (year%400 ==0){
					bool = true;
				}
			}
			else {
				bool = true;
			}
		}
		else {
			bool = false;
		}
		return bool; 
	}
}
