package work;

import java.util.Scanner;

public class Complex implements Cloneable{
	
	private int a;
	private int b;
	
	
	
	public Complex() {
		this.a = 0;
		this.b = 0;
	}

	public Complex(int a) {
		super();
		this.a = a;
		this.b = 0;
	}

	public Complex(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	public Complex add(Complex a, Complex b){
		Complex res = new Complex();
		res.a = a.a + b.a;
		res.b = a.b + b.b;
		
		return res;
	}
	
	public Complex substract(Complex a,Complex b){
		Complex res = new Complex();
		res.setA(a.getA() - b.getA());
		res.setB(a.getB() - b.getB());
		
		return res;
	}
	
	public Complex multiply(Complex a, Complex b){
		Complex res = new Complex();
		res.setA(a.getA()*b.getA() - a.getB()*b.getB());
		res.setB(a.getB()*b.getA() + a.getA()*b.getB());
		
		return res;
	}
	
	public Complex divide(Complex a, Complex b){
		Complex res = new Complex();
		res.setA((a.getA()*b.getA()+a.getB()*b.getB())/(b.getA()*b.getA() + b.getB()*b.getB()));
		res.setB((a.getB()*b.getA()-a.getA()*b.getB())/(b.getA()*b.getA() + b.getB()*b.getB()));
		
		return res;
		
	}
	
	public double abs(Complex a){
		return Math.sqrt(a.getA()*a.getA() + a.getB()*a.getB());
	}
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getRealPart(){
		return this.a;
	}
	
	public int getImaginaryPart(){
		return this.b;
	}
	
	
	@Override
	public String toString() {
		if (b != 0)
			return this.a + "+" + this.b + "i";
		else
			return String.valueOf(this.a);
	}

	public static void main(String[] args) {
		
		System.out.println("请输入两个复数");
		int a,b;
		int c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个复数的实部和虚部");
		a = in.nextInt();
		b = in.nextInt();
		Complex c1 = new Complex(a,b);
		System.out.println("请输入第二个复数的实部和虚部");
		c = in.nextInt();
		d = in.nextInt();
		Complex c2 = new Complex(c, d);
		
		System.out.println("和为：" + c1.add(c1, c2));
		System.out.println("差为：" + c1.substract(c1, c2));
		System.out.println("商为：" + c1.divide(c1, c2));
		System.out.println("积为：" + c1.multiply(c1, c2));

		
	}

}
