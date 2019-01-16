package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class SearchingImplementation implements Searching{

	static ObjectMapper mapper=new ObjectMapper(); 
	List<Patients> personlist=new ArrayList<>();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Appointment> appointmentlist=new ArrayList<>();
	{
		try {
			personlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Patients.json"), new TypeReference<List<Patients>>() {});
			doctorlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Doctors.json"), new TypeReference<List<Doctor>>() {});
			appointmentlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Appointment.json"), new TypeReference<List<Appointment>>() {});
	
		}
		catch(Exception e)
		{
	
		}
	}
	String name;
	String phone;
	int id;
	//Utility input=new Utility();
	@Override
	public void operation()
	{
		int Answer=0;
		do {
			System.out.println("1. Search Doctor by Name");	
			System.out.println("2. Search Doctor by id");
			System.out.println("3. Search Doctor by Specialization");
			System.out.println("4. Search Doctor by Availability");
			System.out.println("5. Search Patients by Name");
			System.out.println("6. Search Patients by id");
			System.out.println("7. Search Patients by Phone");
			System.out.println("8. Search Most Popular Doctor");
			System.out.println("9. Search Most Popular Specialization");
			System.out.println("10. Exit");
			Answer=Utility.getInt();
			switch(Answer)
			{
			case 1:
				searchByDoctorName();
				break;
			case 2:
				searchByDoctorId();
				break;
				
			case 3:
				searchByDoctorSpecialization();
				break;
				
			case 4:
				searchByDoctorAvailability();
				break;
			case 5:
				searchByPatientName();
				break;
			case 6:
				serarchByPatientid();
				break;
			case 7:
				searchByPatientphone();
				break;
			case 8:
				mostPopularDoctor();
				break;
			case 9:
				mostPopularSpecialization();
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid entry");
			}
		}while(Answer!=10);
		}
	@Override
	public void searchByPatientName() {
		System.out.println("Enter Name");
		name=Utility.next();
		List<Patients> listtemp=(List<Patients>)personlist.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());
		System.out.println("Name     id      age      phone");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
		
	}

	@Override
	public void serarchByPatientid() {
		System.out.println("Enter id");
		id=Utility.getInt();
		try
		{
			List<Patients> listtemp=personlist.stream().filter(i -> i.getId()==id).collect(Collectors.toList());
			System.out.println("Name     id      age      phone");
			System.out.println(listtemp.get(0).toString());
		}
		catch(Exception e)
		{
			System.out.println("Unknown Id");
		}
		
	}

	@Override
	public void searchByPatientphone() {
		System.out.println("Enter Name");
		phone=Utility.next();
		try
		{
		Patients obj=(Patients)(Object)personlist.stream().filter(i -> i.getPhone().equals(phone)).findFirst();
		System.out.println(obj.toString());
		}
		catch(Exception e)
		{
			System.out.println("Unknown Phone Number");
		}
	}

	@Override
	public void searchByDoctorName() {
		
		System.out.println("Enter Name");
		name=Utility.next();
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());
		System.out.println("Name     id      Availability      Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
		
	}

	@Override
	public void searchByDoctorId() {
		System.out.println("Enter id");
		id=Utility.getInt();
		try
		{
			List<Doctor> listtemp=doctorlist.stream().filter(i -> i.getId()==id).collect(Collectors.toList());
			System.out.println("Name     id      Availibility      Specialist");
			System.out.println(listtemp.get(0).toString());
		}
		catch(Exception e)
		{
			System.out.println("Unknown Id");
		}
	}

	@Override
	public void searchByDoctorSpecialization() {
		System.out.println("Enter Specialization");
		name=Utility.next();
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getSpecialization().equals(name)).collect(Collectors.toList());
		System.out.println("Name     id      Availability      Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}

	}

	@Override
	public void searchByDoctorAvailability() {
		System.out.println("Enter Availability");
		name=Utility.next();
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getAvailability().equals(name)).collect(Collectors.toList());
		System.out.println("Name     id      Availability      Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
	}

	@Override
	public void mostPopularDoctor() {
		
		
	}

	@Override
	public void mostPopularSpecialization() {
		
	}

}
