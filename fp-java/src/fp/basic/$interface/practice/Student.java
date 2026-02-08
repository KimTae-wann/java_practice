package fp.basic.$interface.practice;

import java.util.Objects;

public class Student {

	private String name;
	private int score;
	private String major;
	
	public Student(String name, int score, String major) {
		this.name = name;
		this.score = score;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getMajor() {
		return major;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student s)) return false;
		return this.score == s.score &&
				Objects.equals(this.name, s.name) &&
				Objects.equals(this.major, s.major);
		
	}
	
	@Override
	public int hashCode() {
		// HashCode 생성
		return Objects.hash(name, score, major);
	}
}
