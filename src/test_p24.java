
public class test_p24 {

	public static void main(String[] args) {
		car car1 = new car();
		car1.setcar(1234, 20.5);
		System.out.println(car1);
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
	public String toString() {
		String str ="����:"+num+",�T�o�q"+gas;
		return str;
	}
}
