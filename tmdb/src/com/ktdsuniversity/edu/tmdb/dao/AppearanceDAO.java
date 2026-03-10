package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.AppearanceQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.ActorVO;
import com.ktdsuniversity.edu.tmdb.vo.AppearanceVO;

public class AppearanceDAO {

	private DataAccessHelper dah;
	
	public AppearanceDAO(DataAccessHelper dah) {
		this.dah = dah;
	}

	public List<AppearanceVO> selectAppearanceByMovieId(String movieId) {
		
		List<AppearanceVO> result = new ArrayList<>();
		
		dah.preparedStatement(AppearanceQuery.makeSelectQuery(), (pstmt) -> {
			pstmt.setString(1, movieId);
		});
		
		dah.executeQuery(SQLType.SELECT, rs -> {
			AppearanceVO eachAppearance = new AppearanceVO();
			eachAppearance.setAppearanceId( rs.getString("APPEARANCE_ID"));
			eachAppearance.setActorId( rs.getString("ACTOR_ID"));
			eachAppearance.setMovieId( rs.getString("MOVIE_ID"));
			eachAppearance.setCharacter( rs.getString("CHARACTER"));
			
			ActorVO eachActor = new ActorVO();
			eachActor.setActorId( rs.getString("ACTOR_ID"));
			eachActor.setActorName( rs.getString("ACTOR_NAME"));
			eachActor.setActorProfileUrl( rs.getString("ACTOR_PROFILE_URL"));
			
			eachAppearance.setActor(eachActor);
			
			result.add(eachAppearance);
		});
		
		
		return result;
	}
	
	

}
