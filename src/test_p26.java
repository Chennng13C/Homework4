
public class test_p26 {

	public static void main(String[] args) {
		car[] cars = new car[2];
		cars[0] = new car();
		cars[1] = new racingcar();
		for(int i=0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}
}
class car{
	protected int num ;
	protected double gas;
	public car() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}
class racingcar extends car{
	public racingcar() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}
