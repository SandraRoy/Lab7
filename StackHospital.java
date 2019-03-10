import java.util.Stack;

public class StackHospital <PatientType> extends Hospital <PatientType>
{
	Stack <PatientType> Patient=new Stack <PatientType>();
	
	public void AddPatient(PatientType patient)
	{
		Patient.push(patient);
	}
	public PatientType nextPatient()
	{
		return Patient.peek();
	}
	public PatientType treatNextPatient()
	{
		 return Patient.pop();
	}
	public int numPatients()
	{
		return Patient.size();
	}
