package test.profile;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class C implements ItemWriter<String>{

	private static int instanceCount = 0;
	public C(){
		instanceCount++;
		System.out.println("C:: Instance created with ID: " + hashCode());
		System.out.println("C:: Instance count: " + instanceCount);
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		instanceCount--;
		System.out.println("C:: Instance GC with ID: " + hashCode());
		System.out.println("C:: Instance count: " + instanceCount);
	}
	
	@Override
	public void write(List<? extends String> l) throws Exception {
		if(null != l){
			for (String string : l) {
				System.out.println("C writes: " + string);
			}
		}
	}
}
