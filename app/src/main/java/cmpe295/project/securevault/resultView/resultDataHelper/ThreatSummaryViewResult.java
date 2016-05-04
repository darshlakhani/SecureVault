package cmpe295.project.securevault.resultView.resultDataHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ThreatSummaryViewResult {
	
	final static String NOTICE_VECTORS = "notice_vectors";
	final static String WARNING_VECTORS = "warning_vectors";
	final static String CRITICAL_VECTORS = "critical_vectors";
	
	final static String DETAILS = "details";
	final static String VECTOR_DETAIL_COUNT = "count";
	final static String VECTOR_DETAIL_TITLE = "title";
	final static String VECTOR_DETAIL_SUMMARY = "summary";
	final static String VECTOR_DETAILS = "vector_details";
	
	
	
	int criticalVectorCount;	// all count
	int warningVectorCount;
	int noticeVectorCOunt;
	float criticalPercent; // all
	float warningPercent;
	float noticePercent;
	
	List<String> criticalVectors, warningVectors, noticeVectors;
	List<Vector> critical, warning, notice;
	
	public ThreatSummaryViewResult() {}
	
	public ThreatSummaryViewResult (String json)
	{


		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(json);



		// setting critical vectors names
		JSONArray criticalJsonArray = jsonObject.getJSONArray((CRITICAL_VECTORS));
		if(criticalJsonArray != null)
		{
			
			//System.out.println("**************************	Creating criticalJsonArray **************************");
			criticalVectors = new ArrayList<>();
			
			for(int i = 0; i < criticalJsonArray.length(); i++)
			{
				String criticalVector = criticalJsonArray.getString(i);
				//System.out.println("Adding " + criticalVector + " to criticalJsonArray");
				criticalVectors.add(criticalVector);
				
			}
			
			// setting critical vector count
			criticalVectorCount = criticalVectors.size();
			
			//System.out.println("**************************	Created criticalJsonArray	**************************");
		}
		
		
		// setting warning vectors names
		JSONArray warningJsonArray = jsonObject.getJSONArray((WARNING_VECTORS));
		if(warningJsonArray != null)
		{
			//System.out.println("**************************	Creating warningJsonArray **************************");
			
			warningVectors = new ArrayList<>();
			
			for(int i = 0; i < warningJsonArray.length(); i++)
			{
				String warningVector = (String) warningJsonArray.get(i);
				//System.out.println("Adding " + warningVector + "to warningJsonArray" );
				warningVectors.add(warningVector);
			}
			
			// setting warning vector count
			warningVectorCount = warningVectors.size();
			
			//System.out.println("**************************	Created warningJsonArray **************************");
			
		}
		
		// setting notice vectors names
		JSONArray noticeJsonArray = jsonObject.getJSONArray(NOTICE_VECTORS);
		if(noticeJsonArray != null)
		{
			//System.out.println("**************************	Creating noticeJsonArray **************************");
			
			noticeVectors = new ArrayList<>();
			
			for(int i = 0; i < noticeJsonArray.length(); i++)
			{
				String noticeVector = (String) noticeJsonArray.get(i);
				System.out.println("Adding " + noticeVector + " to noticeJsonArray");
				noticeVectors.add(noticeVector);
				
			}
			
			// setting notice vector count
			noticeVectorCOunt = noticeVectors.size();
			
			//System.out.println("**************************	Created noticeJsonArray **************************");
			
		}
		
		// setting percentages
		float total = criticalVectorCount
						+ warningVectorCount
							+ noticeVectorCOunt;
		
		
		criticalPercent = (criticalVectorCount * 100) / total;
		warningPercent = (warningVectorCount * 100)/ total;
		noticePercent = 100 - (criticalPercent + warningPercent);
		
		
		// Getting Details JSON OBject set details of vectors
		JSONObject detailsJson = jsonObject.getJSONObject(DETAILS);
		
		// setting critical vector details
		critical = new ArrayList<Vector>();
		for (String criticalVector : criticalVectors) {
			
			//System.out.println("**************************	Fetching Critical Vector Details for : " + criticalVector + " **************************");
			JSONObject criticalVectorJson = detailsJson.getJSONObject(criticalVector);
			Vector newCriticalVector = new Vector();
			
			
			try {
			
			
				//System.out.println("Critical Vector Count : " + criticalVectorJson.getInt(VECTOR_DETAIL_COUNT));
				newCriticalVector.setCount(criticalVectorJson.getInt(VECTOR_DETAIL_COUNT));
				
				//System.out.println("Critical Vector Summary : " + criticalVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				newCriticalVector.setSummary(criticalVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				
				//System.out.println("Critical Vector Title : " + criticalVectorJson.getString(VECTOR_DETAIL_TITLE));
				newCriticalVector.setTitle(criticalVectorJson.getString(VECTOR_DETAIL_TITLE));
				
				
				//System.out.println("Critival Vector Details : " + criticalVectorJson.getString(VECTOR_DETAILS));
				newCriticalVector.setVector_details(criticalVectorJson.getString(VECTOR_DETAILS));
				
				/*JSONArray criticalVectorDetailJSONArray = criticalVectorJson.getJSONArray(VECTOR_DETAILS);
				
				if(criticalVectorDetailJSONArray != null)
				{
					System.out.println("Critical Vector Details : ");
					for(int i = 0; i < criticalVectorDetailJSONArray.length(); i++)
					{
						String criticalVectorDetail = criticalVectorDetailJSONArray.getString(i);
						System.out.println(criticalVectorDetail);
						newCriticalVector.getVector_details().add(criticalVectorDetail);
					}
				}*/
			
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			finally{
				critical.add(newCriticalVector);
			}
			
		}
		
		
		// Setting warning Vector details
		warning = new ArrayList<Vector>();
		for (String warningVector : warningVectors) {
			
			//System.out.println("**************************	Fetching warning Vector Details for : " + warningVector + " **************************");
			
			JSONObject warningVectorJson = detailsJson.getJSONObject(warningVector);
			Vector newWarningVectorJsonVector = new Vector();
			
			try {
			
				//System.out.println("warning Vector Count : " + warningVectorJson.getInt(VECTOR_DETAIL_COUNT));
				newWarningVectorJsonVector.setCount(warningVectorJson.getInt(VECTOR_DETAIL_COUNT));
				
				//System.out.println("warning Vector Summary : " + warningVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				newWarningVectorJsonVector.setSummary(warningVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				
				//System.out.println("warning Vector Title : " + warningVectorJson.getString(VECTOR_DETAIL_TITLE));
				newWarningVectorJsonVector.setTitle(warningVectorJson.getString(VECTOR_DETAIL_TITLE));
				
				
				//System.out.println("warning Vector Details : " + warningVectorJson.getString(VECTOR_DETAILS));
				newWarningVectorJsonVector.setVector_details(warningVectorJson.getString(VECTOR_DETAILS));
			
			}
			
			catch(Exception e)
			{
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			finally{
				warning.add(newWarningVectorJsonVector);
			}
			
		}
		

		// Setting notice Vector details
		notice = new ArrayList<Vector>();
		for (String noticeVector : noticeVectors) {
			
			//System.out.println("**************************	Fetching Notice Vector Details for : " + noticeVector + " **************************");
			
			JSONObject noticeVectorJson = detailsJson.getJSONObject(noticeVector);
			Vector newNoticeVectorJsonVector = new Vector();
			
			try {
			
				//System.out.println("Notice Vector Count : " + noticeVectorJson.getInt(VECTOR_DETAIL_COUNT));
				newNoticeVectorJsonVector.setCount(noticeVectorJson.getInt(VECTOR_DETAIL_COUNT));
				
				//System.out.println("Notice Vector Summary : " + noticeVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				newNoticeVectorJsonVector.setSummary(noticeVectorJson.getString(VECTOR_DETAIL_SUMMARY));
				
				//System.out.println("Notice Vector Title : " + noticeVectorJson.getString(VECTOR_DETAIL_TITLE));
				newNoticeVectorJsonVector.setTitle(noticeVectorJson.getString(VECTOR_DETAIL_TITLE));
				
				
				//System.out.println("Notice Vector Details : " + noticeVectorJson.getString(VECTOR_DETAILS));
				newNoticeVectorJsonVector.setVector_details(noticeVectorJson.getString(VECTOR_DETAILS));
			
			}
			
			catch(Exception e)
			{
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			finally
			{
				notice.add(newNoticeVectorJsonVector);
			}
			
		}



		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		
	}


	public List<String> getCriticalVectors() {
		return criticalVectors;
	}

	public void setCriticalVectors(List<String> criticalVectors) {
		this.criticalVectors = criticalVectors;
	}

	public List<String> getWarningVectors() {
		return warningVectors;
	}

	public void setWarningVectors(List<String> warningVectors) {
		this.warningVectors = warningVectors;
	}

	public List<String> getNoticeVectors() {
		return noticeVectors;
	}

	public void setNoticeVectors(List<String> noticeVectors) {
		this.noticeVectors = noticeVectors;
	}

	public int getCriticalVectorCount() {
		return criticalVectorCount;
	}


	public void setCriticalVectorCount(int criticalVectorCount) {
		this.criticalVectorCount = criticalVectorCount;
	}


	public int getWarningVectorCount() {
		return warningVectorCount;
	}


	public void setWarningVectorCount(int warningVectorCount) {
		this.warningVectorCount = warningVectorCount;
	}


	public int getNoticeVectorCOunt() {
		return noticeVectorCOunt;
	}


	public void setNoticeVectorCOunt(int noticeVectorCOunt) {
		this.noticeVectorCOunt = noticeVectorCOunt;
	}


	public float getCriticalPercent() {
		return criticalPercent;
	}


	public void setCriticalPercent(float criticalPercent) {
		this.criticalPercent = criticalPercent;
	}


	public float getWarningPercent() {
		return warningPercent;
	}


	public void setWarningPercent(float warningPercent) {
		this.warningPercent = warningPercent;
	}


	public float getNoticePercent() {
		return noticePercent;
	}


	public void setNoticePercent(float noticePercent) {
		this.noticePercent = noticePercent;
	}


	public List<Vector> getCritical() {
		return critical;
	}


	public void setCritical(List<Vector> critical) {
		this.critical = critical;
	}


	public List<Vector> getWarning() {
		return warning;
	}


	public void setWarning(List<Vector> warning) {
		this.warning = warning;
	}


	public List<Vector> getNotice() {
		return notice;
	}


	public void setNotice(List<Vector> notice) {
		this.notice = notice;
	}
	
	
	

}
