/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieController.java 
 * @Prject: bobo-movie
 * @Package: com.bobo.movie.controller 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月5日 下午3:33:27 
 * @version: V1.0   
 */
package com.bobo.movie.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.utils.PageUtil;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: MovieController
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月5日 下午3:33:27
 */
@Controller
public class MovieController {

	@Resource
	private MovieService movieService;

	@RequestMapping("selects")
	public String selects(HttpServletRequest request, MovieVO movieVO,
			@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "2") Integer pageSize) {

		PageInfo<Movie> info = movieService.selects(movieVO, pageNum, pageSize);

		// 前台分页工具类
		PageUtil.page(request, "/selects", pageSize, info.getList(), (int) info.getTotal(), pageNum);

		request.setAttribute("movies", info.getList());
		request.setAttribute("movieVO", movieVO);
		return "list";

	}

	@ResponseBody
	@RequestMapping("update")
	public boolean update(MovieVO movieVO) {
		return movieService.update(movieVO) > 0;
	}

}
