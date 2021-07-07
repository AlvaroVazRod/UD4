/**
 * 
 * Ejercicio UD4 
 * @author Alvaro
 *
 */
public class DeclaracionVariablesApp {
	public static void main(String args[]) {
		int num1=6,num2=5,n=21, x=10,y=20,n3=16,a1=1,b1=2,c1=3,d1=4;
		double a=9.5,n2=5.5,m=12.4;
		char c='A';
		computos(num1,num2);
		variables(n, a, c);
		variables2(x, y, n2, m);
		incremento(n3);
		intercambio(a1, b1, c1, d1);
	}
	/*
	 * Metodo que resuelve el Ejercicio 1
	 */
	public static void computos (int num1, int num2) {
		System.out.println("Ejercicio 1: ");
		System.out.println("Suma "+(num1+num2));
		System.out.println("Resta "+(num1-num2));
		System.out.println("Multiplicacion "+(num1*num2));
		System.out.println("Division "+((double)num1/num2)+"\n");
	}
	/*
	 * Metodo que resuelve el Ejercicio 2
	 */
	public static void variables (int n, double a, char c) {
		System.out.println("Ejercicio 2: ");
		System.out.println("N= "+n);
		System.out.println("A= "+a);
		System.out.println("C= "+c);
		System.out.println("Suma "+(n+a));
		System.out.println("Resta "+(a-n));
		System.out.println("Valor c "+((int)c)+"\n");
	}
	/*
	 * Metodo que resuelve el Ejercicio 3
	 */
	public static void variables2 (int x, int y, double n2, double m) {
		System.out.println("Ejercicio 3: ");
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		System.out.println("N= "+n2);
		System.out.println("M= "+m);
		System.out.println("Suma "+(x+y));
		System.out.println("Resta "+(x-y));
		System.out.println("Multiplicacion "+(x*y));
		System.out.println("Division "+(x/y));
		System.out.println("Resto "+(x%y));
		System.out.println("Suma "+(n2+m));
		System.out.println("Resta "+(n2-m));
		System.out.println("Multiplicacion "+(n2*m));
		System.out.println("Division "+(n2/m));
		System.out.println("Resto "+(n2%m));
		System.out.println("Suma "+(x+n2));
		System.out.println("Division "+(y/m));
		System.out.println("Resto "+(y%m));
		System.out.println("X "+x*2+" Y "+y*x+" N "+n2*2+" M "+m*2);
		System.out.println("Suma todos "+(x+y+n2+m));
		System.out.println("Producto todos "+(x*y*n2*m)+"\n");
	}
	/*
	 * Metodo que resuelve el Ejercicio 4
	 */
	public static void incremento (int n) {
		System.out.println("Ejercicio 4: ");
		System.out.println("Valor n "+n);
		n=n+77;
		System.out.println("Valor n incrementado "+n);
		n=n-3;
		System.out.println("Valor n decrementado "+n);
		n=n*2;
		System.out.println("Valor n duplicado "+n);
	}
	/*
	 * Metodo que resuelve el Ejercicio 5
	 */
	public static void intercambio (int a,int b,int c,int d) {
		System.out.println("Ejercicio 5: ");
		int aux;
		// Utilizo un auxiliar para no perder valor b
		aux=b;
		b=c;
		c=a;
		a=d;
		d=aux;
		System.out.println("Resultado "+a+" "+b+" "+c+" "+d+" ");
	}
}
