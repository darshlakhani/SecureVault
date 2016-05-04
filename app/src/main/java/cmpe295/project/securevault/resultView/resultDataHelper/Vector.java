package cmpe295.project.securevault.resultView.resultDataHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vector {
	
	int count;
	String title;
	String summary;
	//List<String> vector_details;
	String vector_details;
	public Vector ()
	{
		//vector_details = new ArrayList<String>();
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/*public List<String> getVector_details() {
		return vector_details;
	}
	public void setVector_details(List<String> vector_details) {
		this.vector_details = vector_details;
	}
	
*/

	public String getVector_details() {
		return vector_details;
	}

	public void setVector_details(String vector_details) {
		this.vector_details = vector_details;
	}
	
	public List<String> getVectorDetailsList(String delimiter)
	{
		return Arrays.asList(vector_details.split(delimiter));
		
	}

	@Override
	public String toString() {
		return "Vector [count=" + count + ", title=" + title + ", summary=" + summary + ", vector_details="
				+ vector_details + "]";
	}
	
	
	

}
