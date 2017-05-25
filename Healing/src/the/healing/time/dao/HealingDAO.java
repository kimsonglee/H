package the.healing.time.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.kosta.t0516.dto.Emp2;

import guest.dto.Guest;
import iba.config.MySqlMapClient;
import thehealing.time.DTO.HBoard;

public class HealingDAO {
	SqlMapClient sqlMap;

	public HealingDAO() {
		sqlMap = MySqlMapClient.getSqlMapInstance();

	}// »ý¼ºÀÚ

	public boolean insert(HBoard hboard) {

		try {
			sqlMap.insert("healing.hb_insert", hboard);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<HBoard> hb_select() {
		List<HBoard> list = null;
		try {
			list = sqlMap.queryForList("healing.hb_select");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public HBoard sb_select(int b_no) {
		HBoard hboard = null;
		try {
			hboard = (HBoard) sqlMap.queryForObject("healing.sb_select", b_no);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hboard;
	}

	public List<HBoard> timeline_select() {
		List<HBoard> list = null;
		try {
			list = sqlMap.queryForList("healing.tl_select");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<HBoard> h_search(String hash) {
		List<HBoard> list = null;
		try {
			System.out.println(hash);
			list = sqlMap.queryForList("healing.h_search", hash);
			System.out.println(list.get(0).getB_img());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public HBoard b_edit(int b_no) {
		HBoard hboard = null;
		try {
			hboard = (HBoard) sqlMap.queryForObject("healing.b_edit", b_no);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hboard;

	}

	public boolean updateBoard(HBoard hboard) {

		try {
			int t = sqlMap.update("healing.upBoard", hboard);
			if (t == 1)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<HBoard> editCompare(String nick) {
		ArrayList<HBoard> list = null;
		try {
			list = (ArrayList<HBoard>) sqlMap.queryForList("healing.editCompare", nick);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public boolean delBoard(HBoard hboard) {

		try {
			int t = sqlMap.delete("healing.delBoard", hboard);
			if (t == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
