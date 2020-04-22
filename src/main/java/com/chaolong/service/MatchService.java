package com.chaolong.service;

import java.util.List;

import com.chaolong.pojo.Match;
import com.chaolong.pojo.Type;
import com.chaolong.vo.QueryVo;

public interface MatchService {
	
	List<Match> show(QueryVo vo);
	
	List<Type> getTypes();

	void add(Match m);

}
