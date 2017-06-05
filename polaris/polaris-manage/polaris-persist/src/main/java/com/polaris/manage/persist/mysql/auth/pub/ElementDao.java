package com.polaris.manage.persist.mysql.auth.pub;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polaris.manage.model.mysql.auth.Element;
import com.polaris.manage.persist.mysql.auth.custom.ElementCustomDao;

public interface ElementDao extends JpaRepository<Element, String>, ElementCustomDao {

}
