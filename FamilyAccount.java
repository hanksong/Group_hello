class FamilyAccount 
{
	public static void main(String[] args) 
	{
	   String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
	   int balance = 0;
		label:while(true){
				System.out.println("-------------��ͥ��֧�������-------------------\n");
				System.out.println("              1.��֧��ϸ");
				System.out.println("              2.�Ǽ�����");
				System.out.println("              3.�Ǽ�֧��");
				System.out.println("              4.��    ��\n");
				System.out.print("             ������<1-4>: ");

				char selection = Utility.readMenuSelection();
				
				switch (selection)
				{
				case '1':
						//System.out.println("1.��֧��ϸ");
		System.out.println("-------------��ǰ��֧��ϸ��¼-------------------\n");

		System.out.println(details);
		
		System.out.println("------------------------------------------------");



						break;
				case '2':
						System.out.println("2.�Ǽ�����");
						System.out.print("����������:");
						int moneyin = Utility.readNumber();
						System.out.print("��������˵��:");
						String shuoMingin  = Utility.readString();
						

						//����balance
						balance += moneyin ;

						//����details
						details += ("����\t" + balance + "\t\t" + moneyin + "\t\t" + shuoMingin + "\n");



						System.out.println("--------------------�Ǽ����---------------");
						break;


				case '3':
						//System.out.println("3.�Ǽ�֧��");
						System.out.print("����֧�����:");
						int moneyout = Utility.readNumber();
						System.out.print("����֧��˵��:");
						String shuoMingout  = Utility.readString();
						//����balance

						balance -= moneyout; 

						//����details
						details += ("֧��\t" + balance + "\t\t" + moneyout + "\t\t" + shuoMingout + "\n");

						System.out.println("--------------------�Ǽ����---------------");

						break;
				case '4':
						System.out.print("ȷ���Ƿ��˳�(Y/N):");//System.out.println("1.��    ��");
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
