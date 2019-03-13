
import java.util.LinkedList;


public class PriorityQueueHospital <PatientType extends Comparable <PatientType>> extends Hospital<PatientType>
{
	
	LinkedList<PatientType> Patient;

	public PriorityQueueHospital()
	{
		Patient=new LinkedList<PatientType>();
	}
	public void addPatient(PatientType patient)
	
	{
		Patient.add(patient);
	}
	
	public int numPatients()
	{
		return Patient.size();
	}
	public PatientType nextPatient()
	{
		return Patient.peek();
	}
	public PatientType treatNextPatient()
	{
		 return Patient.remove();
	}
	
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	public String allPatientInfo()
	{
		String s="";
		for(int i=0;i<Patient.size();i++)
		{
			s+=((LinkedList<PatientType>) Patient).get(i).toString();
		}
		return s;
		
	}
}

	


