package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//Criando lista pois pode ter vários comentarios
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}

	//Lista nao coloca no construtor
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	//Nao posso ter esse set pois a lista ja sera criada e nao pode ser alterada.
	//public void setComments(List<Comment> comments) {
	//	this.comments = comments;
	//} Quando é uma colecao, nao precisa do set. Faça-se o add e remove.
	//No lugar eu crio
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments" + "\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
}
