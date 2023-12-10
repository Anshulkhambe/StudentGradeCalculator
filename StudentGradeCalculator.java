import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Student Grade Calculator");
		System.out.println("Enter marks- (0 out of 100)");
		System.out.println("Enter The Number of Subject:");
		float totalsubject=sc.nextInt();
		float totalmarks=0;
		for(int i=0;i<totalsubject;i++) {
			System.out.println("Enter the marks of subject"+(i+1));
		  int marks=sc.nextInt();
		  totalmarks+=marks;
		}
		
		float per = totalmarks/totalsubject;
		System.out.println("Total marks are" +totalmarks);
		System.out.println("Percentage is :"+per);	
		if(per>=90)
			System.out.println("Grade is A+ Grade");
		else if(per<=90 && per>=80)
			System.out.println("Grade is A");
		else if(per<=80 && per>=70)
			System.out.println("Grade is B");
		else if(per<=70 && per>=60)
			System.out.println("Grade is C");
		else if(per<=60 && per>=50)
			System.out.println("Grade is D");
		else if(per<=50 && per>=35) {
			System.out.println("Pass");
	}
		else {
			System.out.println("Fail");
		}
	}
	}


