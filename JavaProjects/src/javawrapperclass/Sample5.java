package javawrapperclass;

class Max {
	private int  maxi = 0;
	private int size =0;
	
	void insert(int x) {
		this.size++;
		if(x <= this.maxi)
			return;
		this.maxi = x;
	}
	public int top() {
		return this.maxi;
	}
	public int eleNumber() {
		return this.size;
	}
}

public class Sample5 {

	public static void main(String[] args) {
		Max m1 = new Max();
		m1.insert(20);
		m1.insert(44);
		m1.insert(55);
		
		System.out.println("Maximum ele : " + m1.top());
		System.out.println("Number of element inserted : " + m1.eleNumber());

	}

}
