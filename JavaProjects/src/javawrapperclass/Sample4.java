package javawrapperclass;

public class Sample4 {

	public static void main(String[] args) {
		byte a = 1;
		Byte bObj = Byte.valueOf(a);
		
		int b = 25;
		Integer intObj = Integer.valueOf(b);
		
		float c = 25.5f;
		Float fObj = Float.valueOf(c);
		
		double d = 1000.252d;
		Double dObj = Double.valueOf(d);
		
		char f = 'd';
		Character ch =f;
		
		System.out.println("Object Type");
		System.out.println(bObj);
		System.out.println(fObj);
		System.out.println(dObj);
		System.out.println(ch);

		
		byte bv = bObj;
		int iv = intObj;
		double dv = dObj;
		float fv = fObj;
		char cv = ch;
		
		System.out.println();
		System.out.println("Primitive type");
		System.out.println(bv);
		System.out.println(iv);
		System.out.println(dv);
		System.out.println(fv);
		System.out.println(cv);
	}

}
