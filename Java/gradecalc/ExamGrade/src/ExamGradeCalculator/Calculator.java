package ExamGradeCalculator;

import java.io.IOException;
// create your class then code skeleton then we create our product code with throw RuntimeException after we do that we create the testClass then
// run the black box test after that run JUnit test fail put the product code and run the test untill  100% coverge black box test and j unit test
/**
 * @author taflouk
 * @date: 20/02/22
 * @lastModified: 27/02/22
 */

public class Calculator 
{
	
	private int examMarks;
	private int courseMark;
	
	public Calculator() {
		super();
	}
	public Calculator(int examMarks, int courseMarks) {
		super();
		this.examMarks = examMarks;
		this.courseMark = courseMarks;
	}

	/** 
	 * @Method: to validate the exam marks
	 * @param (int)
	 * @return boolean
	 */
	public boolean validateExamMarks(int examMarks) throws MyExceptionHandler
	{
		this.examMarks = examMarks;
		boolean results = false;
		if(0 > examMarks)
		{
			throw new MyExceptionHandler("You cannot enter a negative number for the exam marks!");
		}
		if(75 < examMarks)
		{
			throw new MyExceptionHandler("You cannot go above 75!");
		}
		if(examMarks >= 0 && examMarks <= 75)
		{
			results = true;
		}
		return results;
		
	}	

	/**@Method: to validate the coursework marks
	 * @param courseworkMarks
	 * @return boolean
	 */
	public boolean validateCourseworkMarks(int courseworkMarks)  throws MyExceptionHandler
	{
		this.courseMark = courseworkMarks;
		boolean results = false;
		//Integer.parseInt(this.courseMark);
		if(0 > this.courseMark)
		{
			throw new MyExceptionHandler("You cannot enter a negative number for the coursework marks!");
		}
		if(25 < this.courseMark)
		{
			
			throw new MyExceptionHandler("You cannot go above 25!");
		}
		if(this.courseMark >= 0 && this.courseMark <= 25)
		{
			results = true;
		}
		return results;
	}
	public int getCourseMark() 
	{
		return courseMark;
	}
	public void setCourseMark(int courseMark) 
	{
		this.courseMark = courseMark;
	}
	public int getExamMarks() 
	{
		return examMarks;
	}
	public void setExamMarks(int examMarks) 
	{
		this.examMarks = examMarks;
	}
	//	greater than or equal to 70 - 'A'
	//	greater than or equal to 50, but less than 70 - 'B'
	//	greater than or equal to 30, but less than 50 - 'C'
	//	less than 30 - 'D'
	
	public char findMyGrade(int examMark, int coursework) throws IOException
	{
		this.courseMark = coursework;
		this.examMarks = examMark;
		char myChar = 0;
		int total = this.courseMark + this.examMarks;
		if(total >= 70 )
		{
			myChar = 'A';
		}
		if(total >= 50 && total <= 70 ) 
		{
			myChar = 'B';
		}
		if(total >= 30 && total <= 50 ) 
		{
			myChar = 'c';
		}
		if(total <= 29) 
		{
			myChar = 'D';
		}
		
		return myChar;
	}
	

	
	
}
