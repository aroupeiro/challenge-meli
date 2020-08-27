package com.init.items.rest;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.init.items.entities.Child;
import com.init.items.entities.ItemWithChildren;
import com.init.items.entities.ItemWithoutChildren;

@RestController
@RequestMapping("/items")
public class ItemsRest {
	
	/** GET - Item.
	 * 
	 * @param itemId
	 * @return Item
	 */
	@RequestMapping(value="/{itemId}",method=RequestMethod.GET)
	public ResponseEntity<ItemWithoutChildren> item(@PathVariable("itemId") String itemId) {
		try {
			ResponseEntity<String> response = new RestTemplate().getForEntity("https://api.mercadolibre.com/items/".concat(itemId), String.class);		
			ItemWithoutChildren item = new Gson().fromJson(response.getBody(), ItemWithoutChildren.class);
		    return ResponseEntity.ok(item);
		}catch(HttpStatusCodeException exception) {
			return ResponseEntity.status(exception.getStatusCode()).build();
		}
	}
	
	/** GET - Item with childrens.
	 * 
	 * @param itemId
	 * @return Item
	 */
	@RequestMapping(value="/{itemId}/children",method=RequestMethod.GET)
	public ResponseEntity<ItemWithChildren> itemWithChildrens(@PathVariable("itemId") String itemId) {
		
		try {
			ResponseEntity<String> responseItem = new RestTemplate().getForEntity("https://api.mercadolibre.com/items/".concat(itemId), String.class);
			ResponseEntity<String> responseChildrens = new RestTemplate().getForEntity("https://api.mercadolibre.com/items/".concat(itemId).concat("/children"), String.class);
			
			ItemWithChildren item = new Gson().fromJson(responseItem.getBody(), ItemWithChildren.class);
	        ArrayList<Child> childrens = new Gson().fromJson(responseChildrens.getBody(), new TypeToken<ArrayList<Child>>() {}.getType());
	        item.setChildren(childrens);
	        
			return ResponseEntity.ok(item);
		}catch(HttpStatusCodeException exception) {
			return ResponseEntity.status(exception.getStatusCode()).build();
		}
		
	}

}
