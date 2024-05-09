package java8;
@FunctionalInterface
interface Square {
	int calculate(int x);
}

class Test {
	public static void main(String args[])
	{
		String name = "dayakar";

	
		Square s = ((name) ->{
			System.out.println("name is:"+name);
		}).start;

		int a;
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}



