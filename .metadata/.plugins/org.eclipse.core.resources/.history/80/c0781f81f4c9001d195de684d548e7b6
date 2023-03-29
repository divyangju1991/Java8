package cloud;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HitCounter {
	
	public static Map<String, List<Long>> urlHitMap = new ConcurrentHashMap<>();
	
	public void record(String url, long timestamp){
		if(urlHitMap.get(url) != null){
			 urlHitMap.get(url).add(timestamp);
		} else {
			List<Long> list = new ArrayList<>();
			list.add(timestamp);
			urlHitMap.put(url, list);
		}
	}
	
	public int total(String url){
		return urlHitMap.get(url).size();
	}
	
	public int range(String url, long lower, long upper) {
		List<Long> list = urlHitMap.get(url);
		return (int) list.stream()
				.filter(t -> t>lower && t < upper)
				.count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
