package java_week2;

public class Week2 {

	public static void main(String[] args) {
		// week 2 coding assignment
		// working on Conditions and Loops
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.49;
		double moneyInWallet = 23.00;
		double thirstLevel = 4;
		
		boolean shouldByIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2);
		
		System.out.println(shouldByIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
	}

}
