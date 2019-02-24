package com.enoxs.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.enoxs.domain.UserInfo;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根據登錄名和密碼查詢用戶
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User對象，沒有找到返回null
	 * */
	@Select("select * from SYSTEM_USER_INFO where ACCOUNT = #{account} and PASSWORD = #{password}")
	UserInfo findWithLoginnameAndPassword(@Param("account")String account,
										  @Param("password") String password);

}
