package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames= new Student("James",5000); //학생 1
		Student studentTomas= new Student("Tomas",10000); //학생2
		Student studentEdward=new Student("Edward",15000); //학생3
		
		Bus bus100= new Bus(100); // busNumner=100번 버스   버스 생성자 호출 
		studentJames.takeBus(bus100); // 버스탑승 = 학생1 소유돈-1000 , 버스 승객수++, 버스 수입++
		studentJames.showInfo();
		bus100.showInfo();
		
		
		Subway subwayGreen=new Subway("2호선"); //2호선= String lineNumber 지하철 생성자 호출
		studentTomas.takeSubway(subwayGreen); //지하철 탑승= 학생2 소유돈-1500, 지하철 승객수++, 지하철수입++
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiyellow=new Taxi("노란"); // 노랑색= TaxiColorr 택시
		studentEdward.takeTaxi(taxiyellow);
		studentEdward.showInfo();
		taxiyellow.showInfo();
				
	}

}
