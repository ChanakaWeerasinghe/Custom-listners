package chanakatest.com.myapplication;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("docs")
	private List<DocsItem> docs;

	@SerializedName("numFound")
	private int numFound;

	@SerializedName("start")
	private int start;

	@SerializedName("maxScore")
	private double maxScore;

	public void setDocs(List<DocsItem> docs){
		this.docs = docs;
	}

	public List<DocsItem> getDocs(){
		return docs;
	}

	public void setNumFound(int numFound){
		this.numFound = numFound;
	}

	public int getNumFound(){
		return numFound;
	}

	public void setStart(int start){
		this.start = start;
	}

	public int getStart(){
		return start;
	}

	public void setMaxScore(double maxScore){
		this.maxScore = maxScore;
	}

	public double getMaxScore(){
		return maxScore;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"docs = '" + docs + '\'' + 
			",numFound = '" + numFound + '\'' + 
			",start = '" + start + '\'' + 
			",maxScore = '" + maxScore + '\'' + 
			"}";
		}
}