/**
 * 
 */
package design.lld.splitwise;

import java.util.List;
import java.util.Map;

/**
 * @author 91978
 *
 *
 *Requirements:
 *
 *1. Add/Manage User
 *2. Add/Manage Group
 *3. Add/Manage Expenses Within or outside group
 *4. Split the Expenses/ Split Type - Equal, UnEqual & Percentage
 *5. Maintain Balance Sheet for each user - Owe, expenses, pay, getBack
 *
 *
 *Object identification:
 *1. Splitwise
 *2. User
 *3. Group
 *4. Expense
 *5. Split
 *6. BalanceSheet
 *
 */
public class DesignSplitwiseLldExample {

	/**
	 * 
	 */
	public DesignSplitwiseLldExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Splitwise{
	
	
	private UserController userController;
	
	private GroupController groupController;
	
	private ExpenseControlller expenseController;
	
	
}

class UserController{
	
	private List<User> users;
	
	//CRUD - getUser, addUser, deleteUser
	
}

class GroupController{
	
	private List<Group> users;
	
	//CRUD - getGroup, addGroup, deleteGroup
	
}

class ExpenseControlller{
	
	private UserExpenseBalanceSheetControlller balanceSheetControlller;
	
	//CRUD
	
	public Expense createExpense(User paidBy, int expenseAmount, String description, List<Split> splits, ExpenseSplitType expenseSplitType) { return null;}
	
	
}

class User{
	
	int userId;
	
	String userName;
	
	UserExpenseBalanceSheet userExpenseBalanceSheet;
	
	
}

class Expense{
	
	int expenseId;
	
	String description;
	
	double expenseAmount;
	
	User paidBy;
	
	List<Split> splits;
	
}

class Split{
	
	double amount;
	
	int userId;
	
	double percentage;
}

enum ExpenseSplitType{
	
	EQUAL,UNEQUAL,PERCENTAGE;
	
}

class Group{
	
	int groupId;
	
	String groupName;
	
	List<User> groupMembers;
	
	List<Expense> expenses;
	
}

class UserExpenseBalanceSheet{
	
	int userId;
	
	double totalExpenseAmount;
	
	double totalPaidAmount;
	
	double totalOweAmount;
	
	double totalGetBackAmount;
	
	Map<Integer,Balance> userBalaceMap;
	
}

class Balance{
	
	double oweAmount;
	
	double getBackAmount;
	
}

interface ExpenseValidator{

	boolean validateExpense (double amount, List<Split> splits);
	
}

class EqualExpenseValidator implements ExpenseValidator{

	@Override
	public boolean validateExpense(double amount, List<Split> splits) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

class UnEqualExpenseValidator implements ExpenseValidator{

	@Override
	public boolean validateExpense(double amount, List<Split> splits) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

class PercentageExpenseValidator implements ExpenseValidator{

	@Override
	public boolean validateExpense(double amount, List<Split> splits) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

class ExpenseValidatorFactory{
	
	public static ExpenseValidator getExpenseValidator(ExpenseSplitType expenseSplitType) {
		
		ExpenseValidator expenseValidator = null;
		
		switch (expenseSplitType.toString()) {
		case "EQUAL":
			expenseValidator = new EqualExpenseValidator();
			break;
			
		case "UNEQUAL":
			expenseValidator = new UnEqualExpenseValidator();
			break;

		default:
			expenseValidator = new PercentageExpenseValidator();
			break;
		}
		
		return expenseValidator;
		
	}
	
}

class UserExpenseBalanceSheetControlller{
	
	//CRUD
	
	public void upadteBalanceSheet(User paidBy, int expenseAmount, List<Split> splits, ExpenseSplitType expenseSplitType) { }
	
	
}