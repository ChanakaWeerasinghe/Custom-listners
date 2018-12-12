package chanakatest.com.myapplication;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DocsItem{

	@SerializedName("score")
	private double score;

	@SerializedName("journal")
	private String journal;

	@SerializedName("article_type")
	private String articleType;

	@SerializedName("title_display")
	private String titleDisplay;

	@SerializedName("author_display")
	private List<String> authorDisplay;

	@SerializedName("publication_date")
	private String publicationDate;

	@SerializedName("eissn")
	private String eissn;

	@SerializedName("id")
	private String id;

	@SerializedName("abstract")
	private List<String> jsonMemberAbstract;

	public void setScore(double score){
		this.score = score;
	}

	public double getScore(){
		return score;
	}

	public void setJournal(String journal){
		this.journal = journal;
	}

	public String getJournal(){
		return journal;
	}

	public void setArticleType(String articleType){
		this.articleType = articleType;
	}

	public String getArticleType(){
		return articleType;
	}

	public void setTitleDisplay(String titleDisplay){
		this.titleDisplay = titleDisplay;
	}

	public String getTitleDisplay(){
		return titleDisplay;
	}

	public void setAuthorDisplay(List<String> authorDisplay){
		this.authorDisplay = authorDisplay;
	}

	public List<String> getAuthorDisplay(){
		return authorDisplay;
	}

	public void setPublicationDate(String publicationDate){
		this.publicationDate = publicationDate;
	}

	public String getPublicationDate(){
		return publicationDate;
	}

	public void setEissn(String eissn){
		this.eissn = eissn;
	}

	public String getEissn(){
		return eissn;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setJsonMemberAbstract(List<String> jsonMemberAbstract){
		this.jsonMemberAbstract = jsonMemberAbstract;
	}

	public List<String> getJsonMemberAbstract(){
		return jsonMemberAbstract;
	}

	@Override
 	public String toString(){
		return 
			"DocsItem{" + 
			"score = '" + score + '\'' + 
			",journal = '" + journal + '\'' + 
			",article_type = '" + articleType + '\'' + 
			",title_display = '" + titleDisplay + '\'' + 
			",author_display = '" + authorDisplay + '\'' + 
			",publication_date = '" + publicationDate + '\'' + 
			",eissn = '" + eissn + '\'' + 
			",id = '" + id + '\'' + 
			",abstract = '" + jsonMemberAbstract + '\'' + 
			"}";
		}
}