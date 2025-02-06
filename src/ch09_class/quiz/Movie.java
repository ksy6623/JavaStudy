package ch09_class.quiz;

public class Movie {
	
	private String title;  /* 영화 제목 */
	private String quites; /* 명대사 */
	private String actors; /* 배우 */
	private String word;   /* 초성 */

	// 1. 기본 생성자
	public Movie() {
	}
	public Movie(String title, String quites, String actors, String word) {
		super();
		this.title = title;
		this.quites = quites;
		this.actors = actors;
		this.word = word;
	}
	// 2. setter, getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuites() {
		return quites;
	}
	public void setQuites(String quites) {
		this.quites = quites;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}	
	// 3. toString
	@Override
	public String toString() {
		return "Movie [title=" + title + ", quites=" + quites + ", actors=" + actors + ", word=" + word + "]";
	}
	
}
