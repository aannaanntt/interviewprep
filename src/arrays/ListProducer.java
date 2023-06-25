package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
public class ListProducer {
	
	static Supplier<List<?>> getListObject(){
	
		
		return ArrayList::new;
	}

}
