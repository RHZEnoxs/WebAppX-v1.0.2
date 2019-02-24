package com.enoxs.service.impl;

import java.util.List;

import com.enoxs.domain.BookMsg;
import com.enoxs.mapper.BookMapper;
import com.enoxs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Book服務層接口實現類
 * @Service("bookService")用於將當前類注釋為一個Spring的bean，名為bookService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("bookService")
public class BookServiceImpl implements BookService {
	
	/**
	 * 自動注入BookMapper
	 * */
	@Autowired
	private BookMapper bookMapper;

	/**
	 * BookService接口getAll方法實現
	 * @see { BookService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<BookMsg> getAll() {
		return bookMapper.findAll();
	}

}
