// class�� ���� ���α׷��� (��������), class ���� �ߺ��Ǹ� �ȵȴ�(�ٸ� ���Ͽ��� ������!!!!)
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
    	//instance = �ٸ� ���� �������� ���� ���� �������� �ʰ� ���� ���ϴ� ��(class�� �̸��� �����ش�)
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
