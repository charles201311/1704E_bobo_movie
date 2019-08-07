package com.bobo.movie.service;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;
import com.github.pagehelper.PageInfo;

public interface MovieService {
	
	/**
	 * 
	 * @Title: update 
	 * @Description: TODO
	 * @param movieVO
	 * @return
	 * @return: int
	 */
	int update(MovieVO movieVO);
/**
 * 
 * @Title: selects 
 * @Description: 支持模糊的分页查询
 * @param movieVO
 * @param pageNum 开发页面
 * @param pageSize 每页记录数
 * @return
 * @return: PageInfo<Movie>
 */
	PageInfo<Movie> selects(MovieVO movieVO,Integer pageNum,Integer pageSize);
}
