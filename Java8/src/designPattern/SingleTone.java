package designPattern;

public class SingleTone {
	
	private static volatile SingleTone instance = null;
	
	private SingleTone() {
		if(instance != null){
			throw new RuntimeException("");
		}
	}
	
	public static SingleTone getInstance(){
		
		if(instance == null){
			synchronized(SingleTone.class){
				if(instance == null){
					instance = new SingleTone();
				}
			}
		}
		
		return instance;
	}

	public static void main(String[] args){
		System.out.println(SingleTone.getInstance().hashCode());
		System.out.println(SingleTone.getInstance().hashCode());
		System.out.println(SingleTone.getInstance().hashCode());
		System.out.println(SingleTone.getInstance().hashCode());
	}
}
