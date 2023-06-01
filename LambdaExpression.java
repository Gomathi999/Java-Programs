package assignment;

//@Functional Interface
interface StringSpace{
	String addSpace(String s);

}

public class LambdaExpression {

	public static void main(String[] args) {

		StringSpace obj = (String s) -> {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ' ') {
					continue;
				}
				System.out.print(s.charAt(i)+" ");
			}
			return s;
		};
		obj.addSpace("Gomathi V");
	}
}
