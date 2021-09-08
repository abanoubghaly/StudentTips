package student;

public class CollegeStudent implements Student 
{
	private TipService tipService;
	
	public CollegeStudent (TipService tipService) {
		this.tipService = tipService;
	}
	
	public String getDailyTips()
	{
		return tipService.getTip();
	}
}
