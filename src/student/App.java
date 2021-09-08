package student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Student highschoolStudent = 
				context.getBean("myHighschoolStudent", HighschoolStudent.class);
		Student collegeStudent =
				context.getBean("myCollegeStudent", CollegeStudent.class);
		
		System.out.println("Highschool tip: " + highschoolStudent.getDailyTips());
		System.out.println("College tip: " + collegeStudent.getDailyTips());
		
		context.close();

	}

}
