
public class SickPerson extends Person
{
	private int severity;

	public SickPerson(String name, int age, int severity)
	{
	super(name, age);
	this.severity=severity;
	}
	public int getSeverity()
	{
		return severity;
	}
	public int compareToImpl(Person o)
	{
		if (o instanceof SickPerson)
		{
			SickPerson p=(SickPerson)(o);
			if(this.getSeverity()>p.getSeverity())
			{
				return 1;
			}
			else if(this.getSeverity()<p.getSeverity())
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
		return String.format("%s Severity %d", super.toString(), severity);
	}
	
	

}
