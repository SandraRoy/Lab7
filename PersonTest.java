import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PersonTest {

	@Test
	public void testPerson() {
		HealthyPerson obj=new HealthyPerson("Tom",28,"Cough");
		Assert.assertEquals("Tom", obj.getName());
		Assert.assertEquals(28, obj.getAge());
		Assert.assertEquals("Cough", obj.getReason());
		
		SickPerson obj1=new SickPerson("Anna",21,5);
		Assert.assertEquals("Anna", obj1.getName());
		Assert.assertEquals(21, obj1.getAge());
		Assert.assertEquals(5, obj1.getSeverity());	
		
	}

	
	
	
	@Test
	public void testCompareTo() {
		HealthyPerson obj=new HealthyPerson("Tom",28,"Cough");
		
		SickPerson obj1=new SickPerson("Anna",21,5);
		Person obj2=new HealthyPerson("Jim",30,"Cold");
		Person obj3=new SickPerson("Pam",26,9);
		HealthyPerson obj4=new HealthyPerson("Tom",27,"Injury");
		SickPerson obj5=new SickPerson("Pat",22,5);
		Assert.assertEquals(1,obj.compareToImpl(obj2));
		Assert.assertEquals(-1,obj2.compareToImpl(obj));
		Assert.assertEquals(1, obj3.compareToImpl(obj1));
		Assert.assertEquals(-1,obj1.compareToImpl(obj3));
		Assert.assertEquals(0, obj.compareTo(obj4));
		Assert.assertEquals(0, obj1.compareTo(obj5));
		Assert.assertEquals(0, obj.compareTo(obj1));
		Assert.assertEquals(0, obj3.compareTo(obj4));
		
		Animal a=new Animal("Pitbull", 8);
		Animal a1=new Animal("Golden", 7);
		Assert.assertEquals(-1, a.compareTo(a1));
		
		
		
	}

	@Test
	public void testToString() {
		HealthyPerson obj=new HealthyPerson("Tom",28,"Cough");
		Assert.assertEquals("Tom, a 28-year old. In for Cough" , obj.toString());
		
		SickPerson obj1=new SickPerson("Tom",28,5);
		Assert.assertEquals("Tom, a 28-year old. Severity 5" , obj1.toString());
		
		Animal obj2=new Animal("Pitbull", 4);
		Assert.assertEquals("A 4-year old Pitbull." , obj2.toString());
	}

}
