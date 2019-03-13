
public class HealthyPerson extends Person
{
	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason=reason;
	}
	public String getReason()
	{
		return reason;
	}
	public int compareToImpl(Person o)
	{
		if (o instanceof HealthyPerson)
		{
			if(this.getName().compareTo(o.getName())>0)
			{
				return 1;
			}
			else if(this.getName().compareTo(o.getName())<0)
			{
				return -1;
			}
			else
				{
				return 0;
				}
		}
		else
		{
			return 0;
		}
		
	}
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), reason);
	}
	
	

}

	


