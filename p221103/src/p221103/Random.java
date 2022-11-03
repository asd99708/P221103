package p221103;

public class Random {

	public static void main(String[] args) {
//		0.0 <= m < 1.0
//		0.0 <= (99 * m) <99.0
//		0 <= (int)(99 * m) < 90
//		1 <= (int)(99 * m) + 1 < 100
		
		int time = (int) (Math.random()*99)+1;
		double time1 = Math.random();
		System.out.println(time);
		System.out.printf("%.2f",time1);
	}

}
