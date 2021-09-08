package student;

public class HighschoolStudent implements Student 
{
	private TipService tipService;
	
	public HighschoolStudent (TipService tipService) {
		this.tipService = tipService;
	}
	
	public String getDailyTips()
	{
		return tipService.getTip();
	}
}
