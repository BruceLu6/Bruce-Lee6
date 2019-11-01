package com.tedu.sp02.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public List<Item> getItems(String orderId) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item(1,"商品 1",1));
		list.add(new Item(2,"商品 2",3));
		list.add(new Item(3,"商品 3",5));
		list.add(new Item(4,"商品 4",6));
		list.add(new Item(5,"商品 5",8));
		list.add(new Item(6,"商品 6",4));
		return list;
	}
	@Override
	public void decreaseNumbers(List<Item> list) {
		if (log.isInfoEnabled()) {
			for (Item item : list) {
				log.info("减少库存 --- "+item);
			}
		}
		
	}

}
