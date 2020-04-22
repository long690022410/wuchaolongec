package com.chaolong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chaolong.pojo.Match;
import com.chaolong.pojo.Type;
import com.chaolong.vo.QueryVo;

public interface MatchDao {
	/**
	 * 
	 * @Title: show 
	 * @Description: 模糊查询所有赛事
	 * @param vo 模糊查询的条件
	 * @return
	 * @return: List<Match>
	 */
	
	List<Match> show(QueryVo vo);
	/**
	 * 
	 * @Title: getTypes 
	 * @Description: ajax返回所有赛事类型
	 * @return
	 * @return: List<Type>
	 */
	@Select("select * from match_type")
	List<Type> getTypes();
	/**
	 * 
	 * @Title: add 
	 * @Description: 添加一个赛事
	 * @param m 赛事的属性
	 * @return: void
	 */
	void add(Match m);

}
