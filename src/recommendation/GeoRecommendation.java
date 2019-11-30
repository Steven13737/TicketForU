package recommendation;

import entity.Item;

import java.util.ArrayList;
import java.util.List;

public class GeoRecommendation {
	  public List<Item> recommendItems(String userId, double lat, double lon) {
			List<Item> recommendedItems = new ArrayList<>();

			// Step 1, get all favorited itemids

			// Step 2, get all categories,  sort by count
			// {"sports": 5, "music": 3, "art": 2}
				

			// Step 3, search based on category, filter out favorite items
			
			return recommendedItems;
	  }


}
