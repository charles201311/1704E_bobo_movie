package com.bobo.movie.dao;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;
/**
 */
public interface MovieMapper {

	/**
	 * 
	 * @Title: update 
	 * @Description: TODO
	 * @param movieVO
	 * @return
	 * @return: int
	 */
	int update(MovieVO movieVO);
  
	List<Movie> selects(MovieVO movieVO);
	
	
	
}
