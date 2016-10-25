package qq.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "news")
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;


	@Column(name = "added")
	@Temporal(TemporalType.TIMESTAMP)
	private Date added;

	@Column(name = "title", unique=true)
	private String title;

	@Column(name = "content")
	private String content;

	@PrePersist
	protected void onCreate(){
		
		if(added==null){
			
			added = new Date();
			
		}
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Date getAdded() {
		return added;
	}


	public void setAdded(Date added) {
		this.added = added;
	}
	
	public News(){
		
		
	}

	public News(String title, String content, Date added) {
		this.title = title;
		this.content = content;
		this.added =added;
	}

	public News(String title, String content) {

		this.title = title;
		this.content = content;

	}

	@Override
	public String toString() {
		return "News [id=" + id + ", added=" + added + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
