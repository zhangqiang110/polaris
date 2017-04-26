package com.polaris.manage.model.order.mysql;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="pms_order")
public class Order {
	
	private String id; //订单号，预备采用Redis的RedisAtomicLong来生成唯一标识
	
	private int status; // 订单状态
	
	private double totalPrice; // 订单总金额
	
	private double paymentAmount; // 实际已支付金额
	
	private String saleChannel; // 订单来源渠道
	
	private Timestamp createTime; // 创建时间
	
	private Timestamp updateTime; // 更新时间
	
	private Date completeTime; // 完成时间
	
	// 处于后期效率的考虑，这里不适用级联
	// 这里的一对多，默认是由多的一方来维护关系，这里mappedBy指向的是多的一方中的order字段，不加这个的话，jpa会自动生成一个中间表
	/*@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy="order")
	@JoinColumn(name = "order_id")
	private Set<OrderItem> orderItems = Collections.synchronizedSet(new HashSet<OrderItem>());*/
	
	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "com.saving.ecm.resource.entity.IdGenerator", parameters = {
			@Parameter(name = "idLength", value = "15"), @Parameter(name = "perfix", value = "OD")})
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "status", nullable = false, columnDefinition = "int(2) default 0 comment '订单状态'")
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "total_price", nullable = false, columnDefinition = "double(11,2) default 0 comment '订单总金额'")
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "payment_amount", nullable = false, columnDefinition = "double(11,2) default 0 comment '实际已支付金额'")
	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Column(name = "sale_channel", nullable = false, columnDefinition = "varchar(10) default '' comment '订单来源渠道'")
	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	@Column(name = "create_time", nullable = false, columnDefinition = "DATETIME default CURRENT_TIMESTAMP comment '创建时间'")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "updat_time", nullable = false, columnDefinition = "DATETIME default CURRENT_TIMESTAMP comment '更新时间'")
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "complete_time", nullable = false, columnDefinition = "DATETIME default CURRENT_TIMESTAMP comment '完成时间'")
	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	
}