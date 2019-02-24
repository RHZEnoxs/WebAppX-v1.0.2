package com.enoxs.service;

import java.util.List;
import com.enoxs.domain.BookMsg;

/**
 * Book服務層接口
 * */
public interface BookService {
	
	/**
	 * 查找所有圖書
	 * @return Book對象集合
	 * */
	List<BookMsg> getAll();

}
