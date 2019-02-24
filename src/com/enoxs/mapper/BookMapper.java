package com.enoxs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.enoxs.domain.BookMsg;

/**
 * BookMapper接口
 * */
public interface BookMapper {

	/**
	 * 查詢所有圖書
	 * @return 圖書對象集合
	 * */
	@Select(" select * from BOOK_MSG ")
	List<BookMsg> findAll();
	
}
