package hibernate_mapping.many_to_many_annotation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "question_8")
public class Question8 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qname;

	@ManyToMany(targetEntity = Answer8.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "question_answer_8", 
		joinColumns = { @JoinColumn(name = "q_id") },
		inverseJoinColumns = {@JoinColumn(name = "ans_id") })
	private List<Answer8> answers;

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

	public List<Answer8> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer8> answers) {
		this.answers = answers;
	}

}
