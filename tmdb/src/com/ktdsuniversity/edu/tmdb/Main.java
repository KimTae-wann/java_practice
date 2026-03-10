package com.ktdsuniversity.edu.tmdb;

import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.service.MovieService;
import com.ktdsuniversity.edu.tmdb.vo.MovieVO;

public class Main {

	public static void main(String[] args) {
		
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "TMDB", "TMDB");
		
		MovieService movieService = new MovieService(dah);
		MovieVO movieInfo = movieService.readMovie("MV-20260227-000001");
		
		System.out.println("영화 정보: " + movieInfo);
		System.out.println("장르 정보: " + movieInfo.getCategory());
		System.out.println("출연진 정보: " + movieInfo.getAppearance());
		System.out.println("출연진 정보: " + movieInfo.getMake());
		
		dah.close();
	}
}
