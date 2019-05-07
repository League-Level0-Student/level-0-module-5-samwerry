package nested_loops;

public class LoopGuantlet {public static void main(String[] args) {
	for(int i =0; i <100; i++) {
		System.out.println(i+1);
	}
	for(int i=100;i>0;i--) {
		System.out.println(i-1);
	}
	for(int i=0;i<100;i++) {
		System.out.println(i++);
	}
	for(int i=1;i<100;i++) {
		System.out.println(i++);
	}
	
	
	for(int i=0; i <500;i++) {
		String da="odd"+i++ +1;
		String ba="even"+i+1;
		System.out.println(ba+da);
		}
	for(int i =0; i<777;i++) {
		System.out.println(i+7);
	}
	
	
	
	
	
	
	

}
}
