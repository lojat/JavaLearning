package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductMain {

	public static void main(String[] args) {
		 
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"jeans",3500));
		list.add(new Product(2,"top",200));
		list.add(new Product(3,"mobile",7500));
		list.add(new Product(4,"baslet",100));
		list.add(new Product(5,"bag",4000));
		list.add(new Product(6,"buds",5000));
		list.add(new Product(7,"watch",1500));
		list.add(new Product(8,"tv",5500));
		
		// Iteration without stream 
		
		System.out.println("Wihpout Stream: ");
		for(Product l: list) {
			if(l.getPrice()>=3000) {
				System.out.println(l.toString() );
			}
		}
		
		// with stream
		System.out.println("With Sream: ");
		list.stream().filter(x -> x.getPrice()>=3000)
					.forEach(product -> System.out.println(product.toString()));
		
		//get list of price is greater then 3000
		List<Integer> prices = list.stream().filter(price -> price.getPrice()>=3000)
								.map(price -> price.getPrice()).collect(Collectors.toList());
	
		//print list of price
		System.out.println("List of Prices: ");
		for(int i=0; i< prices.size(); i++) {
			System.out.print(prices.get(i)+"   ");
		}
	
	}

}
