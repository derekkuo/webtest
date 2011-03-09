package corejava.math;
import java.math.BigDecimal;
import java.math.MathContext;


public class TestBigDecimal {

	public static void main(String[] args) {
		double d = 22.1476;
		BigDecimal big = new BigDecimal( Double.toString(d) );
		big = big.setScale(1,   java.math.BigDecimal.ROUND_HALF_UP);
		System.out.println(big.toString());

	}
}
