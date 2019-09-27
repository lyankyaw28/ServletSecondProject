package hibernate_mapping.many_to_many_xml;

import java.util.List;

public class Question7 {
	private int id;
	private String qname;
	private List<Answer7> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer7> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer7> answers) {
		this.answers = answers;
	}

}
