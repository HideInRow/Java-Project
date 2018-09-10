package com.java1234.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java1234.entity.Link;

/**
 * 友情链接Repository接口
 */
public interface LinkRepository extends JpaRepository<Link, Integer>{
}
