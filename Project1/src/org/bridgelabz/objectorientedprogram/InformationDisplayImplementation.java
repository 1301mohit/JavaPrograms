package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class InformationDisplayImplementation implements InformationDisplay {
	
	static ObjectMapper mapper=new ObjectMapper(); 
	List<Patients> personlist=new ArrayList<>();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Appointment> appointmentlist=new ArrayList<>();
	Utility input=new Utility();
	
	{
		try {
			personlist=mapper.readValue(new File("/home/admin1/Desktop/Clinical/Patients.json"), new TypeReference<List<Patients>>() {});
			doctorlist=mapper.readValue(new File("/home/admin1/Desktop/Clinical/Doctors.json"), new TypeReference<List<Doctor>>() {});
			appointmentlist=mapper.readValue(new File("/home/admin1/Desktop/Clinical/Appointment.json"), new TypeReference<List<Appointment>>() {});
	
		}
		catch(Exception e)
		{
	
		}
	}

	public void operation()
	{
		int Answer=0;
		do {
			System.out.println("1. Print Patients Information");	
			System.out.println("2. Print Doctors Information");
			System.out.println("3. Print Appointments Information");
			System.out.println("4. Exit");
			Answer=input.getInt();
			switch(Answer)
			{
			case 1:
				patientInformation();
				break;
			case 2:
				doctorInformation();
				break;
				
			case 3:
				appointmentInformation();
				break;
				
			case 4:
				System.out.println("Exiting");
				break;
			default :
			System.out.println("Invalid Entry");
			}
		}while(Answer!=4);
	}
	@Override
	public void patientInformation() {
		// TODO Auto-generated method stub
		//String spaces="              ";
		System.out.println("PatientName  Patientid  PatientPhone  Patientage");
		personlist.stream().forEach(i ->{
			System.out.println(i.getName()+"   "+i.getId()+"   "+i.getPhone()+"   "+i.getAge());
		});
		
		
	}

	@Override
	public void doctorInformation() {
		// TODO Auto-generated method stub
		//String spaces="              ";
		System.out.println("DoctorName  Doctorid  Doctoravailability Doctorspecialization");
		doctorlist.stream().forEach(i ->{
			System.out.println(i.getName()+"   "+i.getId()+"   "+i.getAvailability()+"   "+i.getSpecialization());
		});
	}

	@Override
	public void appointmentInformation() {
		// TODO Auto-generated method stub
		
	}

}
