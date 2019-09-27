package hibernate_mapping.one_to_many_xml;

import java.util.List;

public class Question5 {
	private int id;  
	private String qname;  
	private List<Answer5> answers;
	
	public Question5() {}
	
	
	public Question5(int id, String qname, List<Answer5> answers) {
		super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}


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
	public List<Answer5> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer5> answers) {
		this.answers = answers;
	} 
	
}
