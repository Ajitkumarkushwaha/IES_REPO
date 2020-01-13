class Demo
{
	void show(){
		System.out.println("-----From Show Method--------");
	}
}
class Test
{
	public static void main(String[] args){
			System.out.println("Hello...");
			System.out.println("Welcome To GitHub");
			Demo d = new Demo();
			d.show();
	}
}
