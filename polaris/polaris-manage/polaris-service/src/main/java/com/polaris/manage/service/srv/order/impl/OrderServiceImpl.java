package com.polaris.manage.service.srv.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polaris.manage.model.order.mysql.Order;
import com.polaris.manage.persist.order.pub.OrderDao;
import com.polaris.manage.service.srv.order.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void saveOrder(Order order) {
		this.orderDao.save(order);
	}

	@Override
	public void deleteOrder(Order order) {
		this.orderDao.delete(order);
	}

	@Override
	public Order findOne(String orderId) {
		return this.orderDao.findOne(orderId);
	}
	
	/*@Override
	public List<Order> searchOrders(SearchOrderCriteria criteria) {
		return this.orderDao.searchOrders(criteria);
	}*/
	
}
