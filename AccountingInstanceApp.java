// class를 통해 프로그래밍 (정리상자), class 값은 중복되면 안된다(다른 파일에서 조차도!!!!)
class AccountingInstance{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : "+valueOfSupply);	
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());	
		System.out.println("Income : "+ getIncome());	
		System.out.println("Dividend 1 : "+ getDividend1());		
		System.out.println("Dividend 2 : "+ getDividend2());		
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply*vatRate;
	}
}
public class AccountingInstanceApp {
	
	public static void main(String[] args) {
    	//instance = 다른 값이 들어왔을때 기존 값을 변경하지 않고 값을 구하는 것(class에 이름을 정해준다)
		AccountingInstance a1 = new AccountingInstance();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.05;
		a1.expenseRate = 0.2;
		a1.print();
					
		AccountingInstance a2 = new AccountingInstance();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		a2.print();
			
	}

}
