package the.healing.time.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import iba.conf.MySqlMapClient;
import the.healing.time.dto.HUserInfo;

public class HDAO {
	SqlMapClient sqlMap;
	
	public HDAO() {
		sqlMap = MySqlMapClient.getSqlMapInstance();
	}
	
	public boolean insert(HUserInfo huserinfo){
		try {
			sqlMap.insert("healing.insert",huserinfo);
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}//insert
	
	
	public HUserInfo findPass(String email){
		HUserInfo huserinfo = null;
	
		try {
			huserinfo = (HUserInfo) sqlMap.queryForObject("healing.findPass", email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return huserinfo;
	}
	
}