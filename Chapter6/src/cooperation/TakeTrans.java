package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames= new Student("James",5000); //�л� 1
		Student studentTomas= new Student("Tomas",10000); //�л�2
		Student studentEdward=new Student("Edward",15000); //�л�3
		
		Bus bus100= new Bus(100); // busNumner=100�� ����   ���� ������ ȣ�� 
		studentJames.takeBus(bus100); // ����ž�� = �л�1 ������-1000 , ���� �°���++, ���� ����++
		studentJames.showInfo();
		bus100.showInfo();
		
		
		Subway subwayGreen=new Subway("2ȣ��"); //2ȣ��= String lineNumber ����ö ������ ȣ��
		studentTomas.takeSubway(subwayGreen); //����ö ž��= �л�2 ������-1500, ����ö �°���++, ����ö����++
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiyellow=new Taxi("���"); // �����= TaxiColorr �ý�
		studentEdward.takeTaxi(taxiyellow);
		studentEdward.showInfo();
		taxiyellow.showInfo();
				
	}

}
