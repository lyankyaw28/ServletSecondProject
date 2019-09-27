package hibernate_mapping.many_to_many_xml;

import java.util.List;

public class Answer7 {
	private int id;
	private String answername;
	private String postedBy;
	private List<Question7> questions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public List<Question7> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question7> questions) {
		this.questions = questions;
	}

}
