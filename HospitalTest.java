import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HospitalTest {

	@Test
	public void testAddPatient() 
	{
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		StackHospital<Animal> sh1=new StackHospital<Animal>();
		QueueHospital<Animal> qh1=new QueueHospital<Animal>();
		PriorityQueueHospital<Animal> ph1=new PriorityQueueHospital<Animal>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Animal obj2=new Animal("Pitbull", 4);
		
		sh.addPatient(obj);
		qh.addPatient(obj1);
		ph.addPatient(obj1);
		ph1.addPatient(obj2);
		
		
		Assert.assertEquals("Tom",sh.nextPatient().getName());
		Assert.assertEquals(25,qh.nextPatient().getAge());
		Assert.assertEquals("Ana",ph.nextPatient().getName());
		Assert.assertEquals("Pitbull",ph1.nextPatient().getBreed());
		Assert.assertEquals(4,ph1.nextPatient().getAge());
		
		
		
		
	}

	@Test
	public void testNextPatient() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		qh.addPatient(obj);
		
		ph.addPatient(obj1);
		ph.addPatient(obj);
	
		
		Assert.assertEquals("Ana", sh.nextPatient().getName());
		Assert.assertEquals("Ana", qh.nextPatient().getName());
		Assert.assertEquals("Ana", ph.nextPatient().getName());
		
		
		
	}

	@Test
	public void testTreatNextPatient() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Person obj3=new SickPerson("Sam",42, 8);
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		qh.addPatient(obj);
		
		ph.addPatient(obj3);
		ph.addPatient(obj1);
		
		
		Assert.assertEquals("Ana", sh.treatNextPatient().getName());
		Assert.assertEquals("Ana", qh.treatNextPatient().getName());
		Assert.assertEquals("Sam", ph.treatNextPatient().getName());
		
		
		
		
		
		
	}

	@Test
	public void testNumPatients() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Person obj3=new SickPerson("Sam",42, 8);
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		
		
		ph.addPatient(obj3);
		ph.addPatient(obj1);
		ph.addPatient(obj);
		
		Assert.assertEquals(2,sh.numPatients());
		Assert.assertEquals(1,qh.numPatients());
		Assert.assertEquals(3,ph.numPatients());
		
		
	}

	@Test
	public void testHospitalType() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Person obj3=new SickPerson("Sam",42, 8);
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		
		
		ph.addPatient(obj3);
		
		Assert.assertEquals("StackHospital",sh.hospitalType());
		Assert.assertEquals("QueueHospital",qh.hospitalType());
		Assert.assertEquals("PriorityQueueHospital",ph.hospitalType());
		
	}

	@Test
	public void testAllPatientInfo() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Person obj3=new SickPerson("Sam",42, 8);
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		
		
		ph.addPatient(obj);
		ph.addPatient(obj1);
		ph.addPatient(obj3);
		Assert.assertEquals("Tom, a 28-year old. In for CoughAna, a 25-year old. Severity 6", sh.allPatientInfo());
		Assert.assertEquals("Ana, a 25-year old. Severity 6", qh.allPatientInfo());
		Assert.assertEquals("Tom, a 28-year old. In for CoughAna, a 25-year old. Severity 6Sam, a 42-year old. Severity 8", ph.allPatientInfo());
	}

	@Test
	public void testToString() {
		StackHospital<Person> sh=new StackHospital<Person>();
		QueueHospital<Person> qh=new QueueHospital<Person>();
		PriorityQueueHospital<Person> ph=new PriorityQueueHospital<Person>();
		
		Person obj=new HealthyPerson("Tom", 28, "Cough");
		Person obj1=new SickPerson("Ana", 25,6 );
		Person obj3=new SickPerson("Sam",42, 8);
		
		sh.addPatient(obj);
		sh.addPatient(obj1);
		
		
		qh.addPatient(obj1);
		
		
		ph.addPatient(obj);
		ph.addPatient(obj1);
		ph.addPatient(obj3);
		
		Assert.assertEquals("A StackHospital-type hospital with 2 patients.", sh.toString());
		Assert.assertEquals("A QueueHospital-type hospital with 1 patients.", qh.toString());
		Assert.assertEquals("A PriorityQueueHospital-type hospital with 3 patients.", ph.toString());
		
	}

}
