package Study;

public class generic<K,V> {
	
	private K first;
	private V second;
	
	public void set(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	public K getFirst() {
		return first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public <T> T genericMethod(T o) {
		return o;
	}
	
	public static <T> T genericmethod2(T o) {
		return o;
	}
	
	public static <T> T genericmethod3(T o) {
		return o;
	}
	
}	


												
	
