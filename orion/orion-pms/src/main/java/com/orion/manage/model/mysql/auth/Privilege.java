package com.orion.manage.model.mysql.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.orion.manage.model.mysql.BaseMysqlObject;
import com.orion.manage.model.tools.dic.auth.PrivilegeEnum;

/**
 * 权限表
 * 
 * @author John
 *
 */
@Entity
@Table(name = "pms_privilege")
public class Privilege extends BaseMysqlObject {

	private static final long serialVersionUID = 5240662074365174587L;

	private PrivilegeEnum type; // 权限类型

	private String description; // 权限描述

	@Column(name = "type", nullable = false, length = 16, columnDefinition = "varchar(16) default '' comment '权限类型(menu, element, file, operation等)'")
	public PrivilegeEnum getType() {
		return type;
	}

	public void setType(PrivilegeEnum type) {
		this.type = type;
	}

	@Column(name = "description", nullable = false, length = 255, columnDefinition = "varchar(255) default '' comment '权限描述'")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
