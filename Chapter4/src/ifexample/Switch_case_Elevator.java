package ifexample;

public class Switch_case_Elevator {

	public static void main(String[] args) {
		int floor=3;
		String floor_inf=" ";
		switch(floor)
		{
		case 1:
			floor_inf="약국";
			break;
		case 2:
			floor_inf="정형외과";
			break;
		case 3:
			floor_inf="피부과";
			break;
		case 4:
			floor_inf="치과";
			break;
		case 5:
			floor_inf="헬스클럽";
			break;
		}
		System.out.println(floor+"층"+floor_inf+"입니다");

	}

}
