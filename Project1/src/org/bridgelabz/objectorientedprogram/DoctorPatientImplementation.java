package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class DoctorPatientImplementation implements DocotorPatientEntries
{
	static ObjectMapper mapper=new ObjectMapper(); 
	List<Patients> personlist=new ArrayList<>();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Appointment> appointmentlist=new ArrayList<>();
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
	
	int id;
	String name;
	String availability;
	String specialization;
	String phone;
	int age;
	boolean saveflag=false;
	boolean changeflag=false;
//	Utility input=new Utility();
	public DoctorPatientImplementation()
	{
		
	}
	@Override
	public void operation()
	{
		int Answer=0;
		do {
			System.out.println("1. Add Doctor");	
			System.out.println("2. Edit Doctor");
			System.out.println("3. Delete Doctor");
			System.out.println("4. Add Patients");
			System.out.println("5. Edit Patients");
			System.out.println("6. Delete Patients");
			System.out.println("7. Save Changes");
			System.out.println("8. Fix Appointment ");
			System.out.println("9. Exit");
			Answer=Utility.getInt();
			switch(Answer)
			{
			case 1:
				addDoctor();
				break;
			case 2:
				editDoctor();
				break;
			case 3:
				deleteDoctor();
				break;
			case 4:
				addPatient();
				break;
			case 5:
				editPatient();
				break;
			case 6:
				deletePatient();
				break;
			case 7:
				save();
				break;
			case 8:
				fixAppointment();
				break;
			case 9:
				if(saveflag==false && changeflag==true)
				{
					System.out.println("Do You Want To save Changes\n 1.yes \n 2. no");
					int Answer2=Utility.getInt();
					if(Answer2==1)
					{
						save();
					}
				}
				break;
			default:
				System.out.println("Invalid Option");
			}
			
		}while(Answer!=9);
		
	}
	@Override
	public void addDoctor()
	{
		saveflag=false;
		changeflag=true;
		System.out.println("Enter Name");
		name=Utility.next();
		System.out.println("Enter Specalization");
		specialization=Utility.next();
		System.out.println("Enter Availability");
		availability=Utility.next();
		id=0;
		if(doctorlist.size()>=1)
		{
			for(int i=0;i<doctorlist.size();i++)
			{
				if(id<doctorlist.get(i).getId())
				{
					id=doctorlist.get(i).getId();
				}
			}
		}
		doctorlist.add(new Doctor(id+1,name,availability,specialization));
	}
	@Override
	public void editDoctor()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Doctor Name");
		name=Utility.next();
		int i=0;
		for(i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getName().equals(name))
			{
			break;
			}
		}
		
		if(i<doctorlist.size())
		{
			System.out.println("What You Want To Update");
			Doctor d=doctorlist.remove(i);
			int Answer2=0;
			do {
				System.out.println("1. Name");
				System.out.println("2. Specialization");
				System.out.println("3. Availability");
				System.out.println("4. Exit");
				Answer2=Utility.getInt();
				switch(Answer2)
				{
				case 1:
					System.out.println("Enter New Name");
					name=Utility.next();
					d.setName(name);
					break;
				case 2:
					System.out.println("Enter New Specialization");
					specialization=Utility.next();
					d.setSpecialization(specialization);
					break;
				case 3:
					System.out.println("Enter New Availability");
					availability=Utility.next();
					d.setAvailability(availability);
					break;
				case 4:
					doctorlist.add(d);
					System.out.println("Exiting");
					break;
				default:
				System.out.println("Invalid Output");
				}
			}while(Answer2!=4);
		}
		else
		{
			System.out.println("Doctor Not Found");
		}
	}
	@Override
	public void deleteDoctor()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Doctor id");
		id=Utility.getInt();
		int i=0;
		for(i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getId()==id)
			{
				doctorlist.remove(i);
			}
		}
		if(i==doctorlist.size())
		{
			System.out.println("No Doctor Found With This Id");
		}
	}
	
	public void addPatient() 
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Patient Name");
		name=Utility.next();
		System.out.println("Enter Patient Phone Number");
		phone=Utility.next();
		System.out.println("Enter Patient Age");
		age=Utility.getInt();
		id=0;
		if(personlist.size()>=1)
		{
			for(int i=0;i<personlist.size();i++)
			{
				if(id<personlist.get(i).getId())
				{
					id=personlist.get(i).getId();
				}
			}
			
		}
		personlist.add(new Patients(id+1,name,phone,age));
	}
	
	public void editPatient()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter id Of Patients");
		id=Utility.getInt();
		int i=0;
		for(i=0;i<personlist.size();i++)
		{
			if(personlist.get(i).getId()==id)
			{
			break;
			}
		}
		
		if(i<doctorlist.size())
		{
			System.out.println("What You Want To Update");
			Patients p=personlist.remove(i);;
			int Answer2=0;
			do {
				System.out.println("1. Name");
				System.out.println("2. Age");
				System.out.println("3. PhoneNumber");
				System.out.println("4. Exit");
				Answer2=Utility.getInt();
				switch(Answer2)
				{
				case 1:
					System.out.println("Enter New Name");
					name=Utility.next();
					p.setName(name);
					
					break;
				case 2:
					System.out.println("Enter New Age");
					age=Utility.getInt();
					p.setAge(age);

					break;
				case 3:
					System.out.println("Enter New PhoneNumber");
					phone=Utility.next();
					p.setPhone(phone);
					break;
				case 4:
					personlist.add(p);
					System.out.println("Exiting");
					break;
				default:
				System.out.println("Invalid Output");
				
				}
				}while(Answer2!=4);
		}
		
		else
		{
			System.out.println("No Patient Found With This Name");
		}
	}
	@Override
	public void deletePatient()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Patient id");
		id=Utility.getInt();
		int i=0;
		for(i=0;i<personlist.size();i++)
		{
			if(personlist.get(i).getId()==id)
			{
				personlist.remove(i);
			}
		}
		if(i==personlist.size())
		{
			System.out.println("No Patient Found With This Id");
		}
	}
	@Override
	public void save()
	{
		try 
		{
			saveflag=true;
			changeflag=false;
			mapper.writeValue(new File("/home/admin1/Desktop/Clinical/Patients.json"), personlist);
			mapper.writeValue(new File("/home/admin1/Desktop/Clinical/Appointment.json"),appointmentlist);
			mapper.writeValue(new File("/home/admin1/Desktop/Clinical/Doctors.json"), doctorlist);
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
	}

	@Override
	public void fixAppointment() {
		saveflag=false;
		changeflag=true;
		System.out.println("Enter DoctorId");
		int doctorId=Utility.getInt();
		System.out.println("Enter PatientId");
		int patientId=Utility.getInt();
		System.out.println("Enter Availibility");
		String avail=Utility.next();
		System.out.println("Enter Patient Phone Number");
		String patientphone=Utility.next();
	//	doctorlist.stream().filter(i -> i.)
		Doctor objtemp=(Doctor)doctorlist.stream().filter(i ->i.getId()==doctorId).collect(Collectors.toList()).get(0);
		Patients objtemp2=(Patients)personlist.stream().filter(i ->i.getId()==patientId).collect(Collectors.toList()).get(0);
		if(objtemp==null || objtemp2==null || !(objtemp2.getPhone().equals(patientphone)))
		{
			System.out.println("Invalid Details");
			return;
		}
		if(objtemp.getAvailability().equals(avail))
		{
			if(objtemp.getAvailability().equals("AM"))
			{
				if(objtemp.getAmCount()>5)
				{
					System.out.println("Doctor Already Have Appointments");
					return;
				}
				else
				{
					for(int i=0;i<doctorlist.size();i++)
					{
						if(doctorlist.get(i).getId()==doctorId)
						{
							int temp=doctorlist.get(i).getAmCount();
							doctorlist.get(i).setAmCount(temp+1);
						}
					}
				}
			}
			else if(objtemp.getAvailability().equals("PM"))
			{
				if(objtemp.getPmCount()>5)
				{
					System.out.println("Doctor Already Have Appointments");
					return;
				}
				else
				{
					for(int i=0;i<doctorlist.size();i++)
					{
						if(doctorlist.get(i).getId()==doctorId)
						{
							int temp=doctorlist.get(i).getPmCount();
							doctorlist.get(i).setPmCount(temp+1);
						}
					}
				}
			}
		}
		
		appointmentlist.add(new Appointment(objtemp.getName(), doctorId, objtemp2.getName(), patientId, patientphone, avail));
		System.out.println("Appointment Fixed");
	}

}
