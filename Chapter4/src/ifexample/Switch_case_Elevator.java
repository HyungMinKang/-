package ifexample;

public class Switch_case_Elevator {

	public static void main(String[] args) {
		int floor=3;
		String floor_inf=" ";
		switch(floor)
		{
		case 1:
			floor_inf="�౹";
			break;
		case 2:
			floor_inf="�����ܰ�";
			break;
		case 3:
			floor_inf="�Ǻΰ�";
			break;
		case 4:
			floor_inf="ġ��";
			break;
		case 5:
			floor_inf="�ｺŬ��";
			break;
		}
		System.out.println(floor+"��"+floor_inf+"�Դϴ�");

	}

}
