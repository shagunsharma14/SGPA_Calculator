package javaProgram;
import java.util.*;
class marks{
	int mat1,ds1,ade1,co1,se1,dms1,dsl1,adel1,cps1;
	float subm;
	Scanner sc = new Scanner(System.in);
	//taking marks as  input from the user and searching for the "gradepoint"  value for it simoultaneously
	void analyse() {
		System.out.println("Maths : ");
		int mat = sc.nextInt();
		mat1 = checkGradePoint(mat)*3; //storing "gradePoint+creditPoint value

		System.out.println("DS: ");
		int ds = sc.nextInt();
		 ds1 = checkGradePoint(ds) *4; //storing "gradePoint+creditPoint value
	
		System.out.println("ADE: ");
		int ade = sc.nextInt();
		 ade1 = checkGradePoint(ade)*3; //storing "gradePoint+creditPoint value
		 
		System.out.println("CO: ");
		int co = sc.nextInt();
		 co1 = checkGradePoint(co)*3; //storing "gradePoint+creditPoint value
		 
		System.out.println("SE: ");
		int se= sc.nextInt();
		 se1 = checkGradePoint(se)*3; //storing "gradePoint+creditPoint value
		 
		System.out.println("DMS: ");
		int dms = sc.nextInt();
		 dms1 = checkGradePoint(dms)*3; //storing "gradePoint+creditPoint value
		 
		System.out.println("DSL: ");
		int dsl = sc.nextInt();
		 dsl1 = checkGradePoint(dsl)*2; //storing "gradePoint+creditPoint value
		 
		System.out.println("ADEL: ");
		int adel = sc.nextInt();
		 adel1 = checkGradePoint(adel)*2; //storing "gradePoint+creditPoint value
		 
		System.out.println("CPS: ");
		int cps = sc.nextInt();
		 cps1 = checkGradePoint(cps)*1; //storing "gradePoint+creditPoint value
		
	}
	//Searching for the respective  grade point value 
	public int  checkGradePoint(int n) {
		if (n<40) {
			return 00; 
		}
		else if(n>=40 && n<45) {
			return 4;
		}
		else if(n>=45 && n<50) {
			return 5;
		}
		else if(n>=50 && n<60) {
			return 6;
		}
		else if(n>=60 && n<70) {
			return  7;
		}
		else if(n>=70 && n<80) {
			return 8;
		}
		else if(n>=80 &&n<90) {
			return 9;
		}
		else if(n>=90) {
			return 10;
		}
		return -1;
	}
	
	//formulla to calculate SGPA "SGPA = submission of ((gradePoint values * creditPoint value)/(total creditPoint values))
	float sgpais() {
		return (mat1+ds1+ade1+co1+se1+dms1+dsl1+adel1+cps1)/(float)24;

	}
	
	//formulla to calculate percentage  = (SGPA - 0.75)*10
	float percentageis() {
		return (float) ((sgpais()-0.75)*10);
	}
}

public class SGPA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//creating the object of marks class
		marks mk = new marks();
		mk.analyse();
		System.out.println();
		System.out.println("**********Your Result************");
		System.out.println();
		System.out.printf("SGPA: %.2f\n\n",mk.sgpais());
		System.out.printf("Percentage: %.1f ",mk.percentageis());System.out.println("%");
	}
}
