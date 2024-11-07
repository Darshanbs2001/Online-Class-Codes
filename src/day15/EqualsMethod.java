package day15;

public class EqualsMethod {
	int age;
	public EqualsMethod(int age) {
		this.age=age;
		
	}
	/*
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return this.hashCode()==1234; }
	 */
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			
			return false;
		}
		if(getClass()==obj.getClass())
			return false;
	    EqualsMethod newobj=(EqualsMethod) obj;
	    return newobj==obj;
	}

	public static void main(String[] args) {
		EqualsMethod e=new EqualsMethod(21);
		/*
		 * EqualsMethod e2=new EqualsMethod(22); EqualsMethod nullVar=null;
		 * System.out.println(e.equals(e2)); System.out.println(e.equals(nullVar));
		 * System.out.println(e.equals(2));
		 */
		EqualsMethod e1=new EqualsMethod(22);
		System.out.println(e==e1);
		System.out.println(e.equals(e1));
		//System.out.println(null.hasCode());
	}



}
