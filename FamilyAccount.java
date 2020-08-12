class FamilyAccount 
{
	public static void main(String[] args) 
	{
	   String details = "收支\t账户金额\t收支金额\t说    明\n";
	   int balance = 0;
		label:while(true){
				System.out.println("-------------家庭收支记账软件-------------------\n");
				System.out.println("              1.收支明细");
				System.out.println("              2.登记收入");
				System.out.println("              3.登记支出");
				System.out.println("              4.退    出\n");
				System.out.print("             请输入<1-4>: ");

				char selection = Utility.readMenuSelection();
				
				switch (selection)
				{
				case '1':
						//System.out.println("1.收支明细");
		System.out.println("-------------当前收支明细记录-------------------\n");

		System.out.println(details);
		
		System.out.println("------------------------------------------------");



						break;
				case '2':
						System.out.println("2.登记收入");
						System.out.print("本次收入金额:");
						int moneyin = Utility.readNumber();
						System.out.print("本次收入说明:");
						String shuoMingin  = Utility.readString();
						

						//处理balance
						balance += moneyin ;

						//处理details
						details += ("收入\t" + balance + "\t\t" + moneyin + "\t\t" + shuoMingin + "\n");



						System.out.println("--------------------登记完成---------------");
						break;


				case '3':
						//System.out.println("3.登记支出");
						System.out.print("本次支出金额:");
						int moneyout = Utility.readNumber();
						System.out.print("本次支出说明:");
						String shuoMingout  = Utility.readString();
						//处理balance

						balance -= moneyout; 

						//处理details
						details += ("支出\t" + balance + "\t\t" + moneyout + "\t\t" + shuoMingout + "\n");

						System.out.println("--------------------登记完成---------------");

						break;
				case '4':
						System.out.print("确认是否退出(Y/N):");//System.out.println("1.退    出");
						char isExit = Utility.readConfirmSelection();
						if (isExit == 'Y')
						{
							break label;
						}

						break;

				}
				
				
		}






	}
}
