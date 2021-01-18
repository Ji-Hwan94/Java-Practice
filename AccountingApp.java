
public class AccountingApp {

	public static void main(String[] args) {
		
		// 시간 순서대로 프로그래밍
		//System.out.println("Value of supply : "+12345.0);
		//System.out.println("VAT : "+ (12345.0*0.1));
		//System.out.println("Total : "+ (12345.0 + 12345.0*0.1));
		//System.out.println("Expense : "+ (12345.0*0.3));
		//System.out.println("Income : "+ (12345.0 - 12345.0*0.3));
		//System.out.println("Dividend 1 : "+ (12345.0 - 12345.0*0.3) * 0.5);
		//System.out.println("Dividend 2 : "+ (12345.0 - 12345.0*0.3) * 0.3);
		//System.out.println("Dividend 3 : "+ (12345.0 - 12345.0*0.3) * 0.2);
		
		// 변수를 통해서 프로그래밍    
		//double ValueOfSupply = 10000.0;
		//double vatRate = 0.1;
		//double expenseRate = 0.3;
		//double vat = ValueOfSupply*vatRate;
		//double expense = ValueOfSupply*expenseRate;
		//double income = ValueOfSupply - expense;
		//double dividend1 = income * 0.5;
		//double dividend2 = income * 0.3;
		//double dividend3 = income * 0.2;
	    
		//System.out.println("Value of supply : "+ValueOfSupply);	
		//System.out.println("VAT : "+ vat);
		//System.out.println("Total : "+ (ValueOfSupply + vat));
		//System.out.println("Expense : "+ expense);	
		//System.out.println("Income : "+ income);	
		//System.out.println("Dividend 1 : "+ dividend1);		
		//System.out.println("Dividend 2 : "+ dividend2);		
		//System.out.println("Dividend 3 : "+ dividend3);
		
		//입력값을 이용한 프로그래밍
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply*vatRate;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
	    
		System.out.println("Value of supply : "+ValueOfSupply);	
		System.out.println("VAT : "+ vat);
		System.out.println("Total : "+ (ValueOfSupply + vat));
		System.out.println("Expense : "+ expense);	
		System.out.println("Income : "+ income);	
		System.out.println("Dividend 1 : "+ dividend1);		
		System.out.println("Dividend 2 : "+ dividend2);		
		System.out.println("Dividend 3 : "+ dividend3);
		
		
	}

}
