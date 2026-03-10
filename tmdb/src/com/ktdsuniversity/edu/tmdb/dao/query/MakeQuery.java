package com.ktdsuniversity.edu.tmdb.dao.query;

public class MakeQuery {

	public static String makeSelectQuery() {
		
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT m.MAKE_ID                      ");
		query.append("	   , m.PRODUCER_ID                  ");
		query.append("	   , m.MOVIE_ID                     ");
		query.append("	   , m.ROLE                         ");
		query.append("	   , m.PART                         ");
		query.append("	   , p.PRODUCER_NAME                ");
		query.append("  FROM MAKE m                         ");
		query.append(" INNER JOIN PRODUCER p                ");
		query.append("	  ON p.PRODUCER_ID = m.PRODUCER_ID  ");
		query.append(" WHERE m.MOVIE_ID = ?                 ");
		
		return query.toString();
	}

}
