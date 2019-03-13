import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital <PatientType> extends Hospital <PatientType>{
	Queue<PatientType> Patient;
	public QueueHospital()
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
		return Patient.element();
	}
	public PatientType treatNextPatient()
	{
		 return Patient.remove();
	}
	
	public String hospitalType()
	{
		return "QueueHospital";
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



