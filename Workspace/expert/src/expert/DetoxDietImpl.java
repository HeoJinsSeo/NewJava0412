package expert;

public class DetoxDietImpl implements Diet{

	private String DietType = "detox diet";
	private String DietMethod = "독소제거, 음식을 제한적으로 섭취 ";
	private String SideEffect = "영양 불균형  ";
	private double expense;
	private int duration;
	
	
	
	@Override
	public String getDietType() {
		// TODO Auto-generated method stub
		return DietType;
	}

	@Override
	public String getDietMethode() {
		// TODO Auto-generated method stub
		return DietMethod;
	}

	@Override
	public String getSideEffect() {
		// TODO Auto-generated method stub
		return SideEffect;
	}

	@Override
	public double getExpense() {
		return expense;
	}

	@Override
	public void setExpense(double expense) {
		this.expense = expense;
		
	}

	@Override
	public int getDuration() {
		return duration;
	}

	@Override
	public void setDuration(int duration) {
		this.duration = duration;
		
	}

	
	
	
	
}
