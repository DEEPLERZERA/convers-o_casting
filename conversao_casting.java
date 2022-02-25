package conversão_casting;

public class conversao_casting {

	public static void main(String[] args) {
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1;  //Passa o valor de short para byte
		
		long l1;
		int i1 = 10; 
		l1 = i1; //Passa o valor int para o long
		
		int i2;
		long l2 = 100000090000L;
		i2 = (int) l2;  //Passa o valor de long para o int
		
		System.out.println(b1);
		System.out.println(l1);
		System.out.println(i2);
		
	}

}
