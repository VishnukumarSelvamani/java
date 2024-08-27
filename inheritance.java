

public class git {
	public int addfun(int x , int y) {
		return x+y;
	}

}
class git1 extends git{
	public static void main(String[] args) {
		git g1 = new git();
		
		System.out.println(g1.addfun(10,10));
	}
	
}