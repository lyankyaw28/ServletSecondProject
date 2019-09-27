package hibernate_mapping.one_to_many_annotation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity  
@Table(name="question_6")  
public class Question6 {
	@Id   
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;    
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")  
	@OrderColumn(name="type")  
	private List<Answer6> answers6;

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

	public List<Answer6> getAnswers() {
		return answers6;
	}

	public void setAnswers(List<Answer6> answers6) {
		this.answers6 = answers6;
	}
	
	
}
