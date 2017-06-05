package com.polaris.manage.model.mongo.order;

import java.sql.Timestamp;

import org.springframework.data.mongodb.core.mapping.Document;

import com.polaris.manage.model.mongo.BaseMongoObject;

@Document(collection = "pms_order")
public class MongoOrder extends BaseMongoObject {

	private static final long serialVersionUID = -3212665630676024012L;

	private Integer status; // 订单状态

	private Double totalPrice; // 订单总金额

	private Double paymentAmount; // 实际已支付金额

	private String saleChannel; // 订单来源渠道

	private Timestamp completeTime; // 完成时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public Timestamp getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}

}
