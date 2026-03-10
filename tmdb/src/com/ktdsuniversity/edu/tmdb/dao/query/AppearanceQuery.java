package com.ktdsuniversity.edu.tmdb.dao.query;

public class AppearanceQuery {

	public static String makeSelectQuery() {
		
		StringBuffer query = new StringBuffer();         
		
		query.append("SELECT ap.APPEARANCE_ID            ");
		query.append("	   , ap.ACTOR_ID                 ");
		query.append("	   , ap.MOVIE_ID                 ");
		query.append("	   , ap.\"CHARACTER\"            ");
		query.append("	   , a.ACTOR_NAME                ");
		query.append("	   , a.ACTOR_PROFILE_URL         ");
		query.append("	FROM APPEARANCE ap               ");
		query.append(" INNER JOIN ACTOR a                ");
		query.append("	  ON ap.ACTOR_ID = a.ACTOR_ID    ");
		query.append(" WHERE ap.MOVIE_ID = ?             ");
		
		return query.toString();
	}

	
	
}
