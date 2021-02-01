
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 98;
		marks[1] = 87;
		System.out.println("Size of Array = " + marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		String []names = new String[6];
		names[0] = "Sunil";
		names[2] = "Naveen";
		for(String name : names) {
			System.out.print(name+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean b : status) {
			System.out.print(b+"   ");
		}
	}
}