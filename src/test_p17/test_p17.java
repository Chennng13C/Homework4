package test_p17;

public class test_p17 {

	public static void main(String[] args) {
		car cars[] = new car[2];
		cars[0] = new car();
		cars[0].setcar(1234, 20.5);
		
		cars[1] = new racingcar();
		cars[1].setcar(4567, 30.5);
		
		for(int i=0 ; i<cars.length;i++)
			cars[i].show();
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
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q"+gas);		
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class racingcar extends car{
	private int course ;
	public racingcar() {
		course =0 ;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("�N�ɨ����]��"+course);
	}
	public void show() {
		System.out.println("�ɨ������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}