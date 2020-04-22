package com.chaolong.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.MillisecondInstantPrinter;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.chaolong.pojo.Match;
import com.chaolong.pojo.Type;
import com.chaolong.service.MatchService;
import com.chaolong.vo.QueryVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MatchController {
	@Autowired
	private MatchService service;
	// 模糊+分页 查询
	@RequestMapping("show")//克隆更新一下
	public ModelAndView show(@RequestParam(defaultValue = "1")Integer pageNum,QueryVo vo) {
		ModelAndView mv = new ModelAndView("show");
		int size = 3;
		PageHelper.startPage(pageNum, size);
		List<Match> list = service.show(vo);
		PageInfo<Match> page = new PageInfo<>(list);
		mv.addObject("list", list);
		mv.addObject("vo", vo);
		mv.addObject("page", page);
		mv.addObject("size", size);
		mv.addObject("ty", vo.getType());
		return mv;
	}
	// ajax返回所有赛事类型
	@RequestMapping("getTypes")
	@ResponseBody
	public List<Type> getTypes(){
		return service.getTypes();
	}
	// 去到add页面
	@RequestMapping("toAdd")
	public String toAdd(){
		return "add";
	}
	// 添加赛事
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("file")MultipartFile file,Match m) throws IllegalStateException, IOException {
		ModelAndView mv = new ModelAndView("redirect:show");
		if(file != null && file.getSize() > 0) {
			String path = "F:\\vedio";
			file.transferTo(new File(path,file.getOriginalFilename()));
			m.setPic("F:\\vedio\\"+file.getOriginalFilename());
		}
		System.out.println(m);
		service.add(m);
		
		
		
		return mv;
	}
	
}
