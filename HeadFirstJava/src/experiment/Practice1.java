package experiment;

public class Practice1 {
	int var;
	public Practice1(){}
	public Practice1(int var)
	{
		this.var = var;
	}
	public static void main(String[] args) {
		Practice1 one = new Practice1(2);
		Practice1 two = new Practice1(2);
		Practice1 three = one;
		System.out.println(one == two);
		System.out.println("One: "+one.hashCode());
		System.out.println("three: "+three.hashCode());
		System.out.println("two: "+two.hashCode());
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		System.out.println(one==three);
		
	}

}
