import java.util.Scanner;
public class Test13{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入成绩：");
	int score  = input.nextInt();
	if(score >=90){
		System.out.println("A");
	}else if(score>80 && score<=89){
		System.out.println("B");
	}else if(score>70 && score<=89){
		System.out.println("C");
	}else if(score>60 && score<=69){
		System.out.println("D");
	}else if(score>50 && score<=59){
		System.out.println("E");
	}else{
		System.out.println("其他");
	}
	}
}