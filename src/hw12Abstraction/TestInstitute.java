package hw12Abstraction;

public class TestInstitute {
	
public static void main(String[] args) {
	System.out.println("------------------ColumbiaUniversity----------------");
	ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
	columbiaUniversity.biology();
	columbiaUniversity.anatomyLab();
	columbiaUniversity.biochemistryLab();
	columbiaUniversity.commonRoom();
	columbiaUniversity.laboratory();
	columbiaUniversity.languageClub();
	columbiaUniversity.emergencyRoom();
	columbiaUniversity.surgeryRoom();
	columbiaUniversity.cafeteria();
	columbiaUniversity.lawInfo();
	columbiaUniversity.vocationalInfo();
	columbiaUniversity.classSize();
	columbiaUniversity.playGround();
	columbiaUniversity.teacher();
	columbiaUniversity.hygiene();
	columbiaUniversity.mechanicalLab();
	columbiaUniversity.gymnasium();
	University.library();

	System.out.println("------------------University----------------");

	University university = new ColumbiaUniversity();
	university.classSize();
	university.playGround();
	university.teacher();
	university.gymnasium();
	University.library();
	university.commonRoom();
	university.laboratory();
	university.languageClub();
	university.dorm();
	College.studyRoom();
	university.emergencyRoom();
	university.surgeryRoom();
	university.cafeteria();
	university.morgue();
	Hospital.pharmacy();
	
System.out.println("------------------MedicalSchool----------------");
		MedicalSchool medicalSchool=new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
	}
}
		
		
	