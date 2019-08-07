/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieServiceImpl.java 
 * @Prject: bobo-movie
 * @Package: com.bobo.movie.service.impl 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月5日 下午3:30:41 
 * @version: V1.0   
 */
package com.bobo.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import com.bobo.movie.dao.MovieMapper;
import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
 * @ClassName: MovieServiceImpl 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月5日 下午3:30:41  
 */
@Service
public class MovieServiceImpl implements MovieService {
	
	
	@Resource
	private MovieMapper movieMapper;

	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: TODO
	 * @param movieVO
	 * @param pageNum
	 * @param pageSize
	 * @return 
	 * @see com.bobo.movie.service.MovieService#selects(com.bobo.movie.vo.MovieVO, java.lang.Integer, java.lang.Integer) 
	 */
	@Override
	public PageInfo<Movie> selects(MovieVO movieVO, Integer pageNum, Integer pageSize) {
		
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> list = movieMapper.selects(movieVO);
		
		PageInfo<Movie> info = new PageInfo<Movie>(list);
		
		return info;
	}

	/* (non Javadoc) 
	 * @Title: update
	 * @Description: TODO
	 * @param movieVO
	 * @return 
	 * @see com.bobo.movie.service.MovieService#update(com.bobo.movie.vo.MovieVO) 
	 */
	@Override
	public int update(MovieVO movieVO) {
		// TODO Auto-generated method stub
		return movieMapper.update(movieVO);
	}

}
