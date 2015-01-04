package enums;

public class MealPrices {
	public static void main(String[] args) { // (8)
		System.out.println("Please note that "+Meal.BREAKFAST.name()+", "+Meal.BREAKFAST.getHour()+":"+Meal.BREAKFAST.getMins() + " on " + Day.MONDAY + " costs $ "+Meal.BREAKFAST.mealPrice(Day.MONDAY));
		System.out.println("Meal prices on " + Day.SATURDAY + " are as follows:");
		Meal[] meals = Meal.values();
		for (Meal meal : meals)
			System.out.println(meal+" costs $ "+ meal.mealPrice(Day.SATURDAY));
	}
}
/*Output from the program:
Please note that BREAKFAST, 7:30 on MONDAY costs $ 10.5
Meal prices on SATURDAY are as follows:
Breakfast costs $ 15.75
Lunch costs $ 41.0
DINNER costs $ 63.75*/
