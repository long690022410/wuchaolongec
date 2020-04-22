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
	 * @Description: ģ����ѯ��������
	 * @param vo ģ����ѯ������
	 * @return
	 * @return: List<Match>
	 */
	
	List<Match> show(QueryVo vo);
	/**
	 * 
	 * @Title: getTypes 
	 * @Description: ajax����������������
	 * @return
	 * @return: List<Type>
	 */
	@Select("select * from match_type")
	List<Type> getTypes();
	/**
	 * 
	 * @Title: add 
	 * @Description: ���һ������
	 * @param m ���µ�����
	 * @return: void
	 */
	void add(Match m);

}
