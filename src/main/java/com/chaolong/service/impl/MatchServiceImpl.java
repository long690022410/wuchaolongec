package com.chaolong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaolong.dao.MatchDao;
import com.chaolong.pojo.Match;
import com.chaolong.pojo.Type;
import com.chaolong.service.MatchService;
import com.chaolong.vo.QueryVo;
@Service
public class MatchServiceImpl implements MatchService {
	@Autowired
	private MatchDao dao;
	// 模糊查询
	@Override
	public List<Match> show(QueryVo vo) {
		// TODO Auto-generated method stub
		return dao.show(vo);
	}
	// 查询所有赛事类型
	@Override
	public List<Type> getTypes() {
		// TODO Auto-generated method stub
		return dao.getTypes();
	}
	//新增赛事
	@Override
	public void add(Match m) {
		// TODO Auto-generated method stub
		dao.add(m);
	}
	
	
	
	
}
