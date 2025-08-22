package javaopps;


public class staticnonstatic {
	
	static int count = 0; // 
	
	public staticnonstatic() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticnonstatic c1 = new staticnonstatic();
		staticnonstatic c2 = new staticnonstatic();
		staticnonstatic c3 = new staticnonstatic();
		

	}

}
