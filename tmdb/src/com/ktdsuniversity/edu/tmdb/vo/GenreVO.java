package com.ktdsuniversity.edu.tmdb.vo;

/**
 * @TableName GENRE
 * @TableComment null
 */
public class GenreVO {

    /**
     * @ColumnName GENRE_ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment GN-YYYYMMDD-일련번호(6자리)
     */
    private String genreId;

    /**
     * @ColumnName MOVIE_ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment MV-YYYYMMDD-일련번호(6자리)
     */
    private String movieId;

    /**
     * @ColumnName CATEGORY_ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment CT-YYYYMMDD-일련번호(6자리)
     */
    private String categoryId;

    public String getGenreId() {
        return this.genreId;
    }
    
    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }
    
    public String getMovieId() {
        return this.movieId;
    }
    
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    @Override
    public String toString() {
        return "GenreVO(genreId: " + genreId + ", movieId: " + movieId + ", categoryId: " + categoryId + ", )";
    }
}