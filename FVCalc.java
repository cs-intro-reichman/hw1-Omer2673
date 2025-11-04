// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		
        int current_value = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1])/100;
        int n = Integer.parseInt(args[2]);
        double future_value = current_value*(Math.pow(1+rate,n));
        System.out.println("After " + n + " years, $" + current_value +
                           " saved at " + rate*100 + "% will yield $" + (int)future_value);
    
	}
}

