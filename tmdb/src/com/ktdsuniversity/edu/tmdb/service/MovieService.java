package com.ktdsuniversity.edu.tmdb.service;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.AppearanceDAO;
import com.ktdsuniversity.edu.tmdb.dao.CategoryDAO;
import com.ktdsuniversity.edu.tmdb.dao.MakeDAO;
import com.ktdsuniversity.edu.tmdb.dao.MovieDAO;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.vo.AppearanceVO;
import com.ktdsuniversity.edu.tmdb.vo.CategoryVO;
import com.ktdsuniversity.edu.tmdb.vo.MakeVO;
import com.ktdsuniversity.edu.tmdb.vo.MovieVO;

public class MovieService {

	private DataAccessHelper dah;
	private MovieDAO movieDAO;
	private CategoryDAO categoryDAO;
	private MakeDAO makeDAO;
	private AppearanceDAO appearanceDAO;
	
	public MovieService(DataAccessHelper dah) {
		this.dah = dah;
		this.movieDAO = new MovieDAO(this.dah);
		this.categoryDAO = new CategoryDAO(this.dah);
		this.makeDAO = new MakeDAO(this.dah);
		this.appearanceDAO = new AppearanceDAO(this.dah);
	}

	public MovieVO readMovie(String movieId) {
		MovieVO movie = this.movieDAO.selectMovie(movieId);
		
		List<CategoryVO> categories = this.categoryDAO.selectCategoriesByMovieId(movieId);
		movie.setCategory(categories);
		
		List<MakeVO> make = this.makeDAO.selectMakeByMovieId(movieId);
		movie.setMake(make);
		
		List<AppearanceVO> appearance = this.appearanceDAO.selectAppearanceByMovieId(movieId);
		movie.setAppearance(appearance);
		
		return movie;
	}
}
