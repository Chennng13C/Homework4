
public class test_p41 {
	public static void main(String[] args) {
		car car1 = new car(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}
interface ivehicle{
	void vshow();
}
interface imaterial{
	void mshow();
}
class car implements ivehicle , imaterial{
	private int num;
	private double gas;
	public car (int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	public void vshow() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public void mshow() {
		System.out.println("���l������O�K");
	}
}