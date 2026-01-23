package com.ktdsuniversity.edu.management.article;

import com.ktdsuniversity.edu.management.member.Member;	// ctrl + shift + o

public class Article {
	
	private String name;
	private Member author;
	private String content;
	
	public Article(String name, Member author, String content) {
		this.name = name;
		this.author = author;
		this.content = content;
	}
	
	public void viewArticleDesciption () {
		System.out.println("name : " + name + 
							"\ncontent : " + content +
							"\nauthorID : " + author.getId() + 
							"\nauthorName : " + author.getName());
	}

	
	public static void main(String[] args) {
		Article article = new Article("테스트", new Member("superuser", "관리자"), "내용");
		article.viewArticleDesciption();
	}
}
