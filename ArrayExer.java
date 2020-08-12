import java.util.Scanner;
//Exercise : 输入学生的成绩 找出最高分 并且输出学生的等级

public class ArrayExer {
    public static void main(String[] args) {
	//读取学生个数
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("请输入学生人数");
    	int num = scanner.nextInt(); 
    	
    	 
    	
    	
    //创建数组存储成绩
    	int[] scores = new int[num];
    	for(int i= 0; i < scores.length ; i++) {
    		System.out.println("请输入第" +( i + 1) + "位学生的成绩");
    		scores[i] = scanner.nextInt();
    	}
    	
    	
 //获取最高分
    	int maxScore = 0;
    	for(int i = 0; i < scores.length; i++) {
    		if(maxScore < scores[i]) {
    			maxScore = scores[i];
    					}
    	}
    	
    	
    	
//获取学生等级    	
    	
    		char level;
    		for (int j = 0; j < scores.length; j++) {
				if (scores[j] >= maxScore - 10){
			level = 'A';
					}else if(scores[j] <= maxScore - 10 && scores[j]>=maxScore - 20) {
				level = 'B';		
					}else if (scores[j] <= maxScore - 20 && scores[j]>=maxScore - 30) {
					level = 'C';
					}else {
						level = 'D';
					}
				System.out.println("score is " +  scores[j] + "  grade is " + level);
			}
    		
    	
    	
    	
     
}
		}
