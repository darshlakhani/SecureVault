package cmpe295.project.securevault.resultView.resultDataHelper;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PreferenceViewResult {
	
	final static String VIOLATED_PREFERENCES = "violatedPreferenceList";
	final static String ADHERED_PREFERENCES = "adheredPreferenceList";
	
	
	int violatedCount;
	int adheredCount;
	List<String> violatedPreferences;
	List<String> adheredPreferences;
	
	
	public PreferenceViewResult () {}

	public PreferenceViewResult (String json)  {
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		JSONArray violatedJsonArray = null;
		try {
			violatedJsonArray = jsonObject.getJSONArray(VIOLATED_PREFERENCES);

		if(violatedJsonArray != null)
		{
			violatedPreferences = new ArrayList<>();
			for(int i = 0; i < violatedJsonArray.length(); i++)
			{
				String violatedPreference = violatedJsonArray.getString(i);
				violatedPreferences.add(violatedPreference);
			}
			
			violatedCount = violatedPreferences.size();
		}
		
		JSONArray adheredJsonArray = jsonObject.getJSONArray(ADHERED_PREFERENCES);
		if(adheredJsonArray != null)
		{
			adheredPreferences = new ArrayList<>();
			for(int i = 0; i < adheredJsonArray.length(); i++)
			{
				String adheredPreference = adheredJsonArray.getString(i);
				adheredPreferences.add(adheredPreference);
			}
			
			adheredCount = adheredPreferences.size();
		}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public float getViolatedPercent()
	{
		return (violatedCount * 100) /(violatedCount + adheredCount) ;
	}
	
	public float getAdheredPercent()
	{
		return (100 - getViolatedPercent());
	}
	
	
	
	
	public int getViolatedCount() {
		return violatedCount;
	}
	public void setViolatedCount(int violatedCount) {
		this.violatedCount = violatedCount;
	}
	public int getAdheredCount() {
		return adheredCount;
	}
	public void setAdheredCount(int adheredCount) {
		this.adheredCount = adheredCount;
	}
	public List<String> getViolatedPreferences() {
		return violatedPreferences;
	}
	public void setViolatedPreferences(List<String> violatedPreferences) {
		this.violatedPreferences = violatedPreferences;
	}
	public List<String> getAdheredPreferences() {
		return adheredPreferences;
	}
	public void setAdheredPreferences(List<String> adheredPreferences) {
		this.adheredPreferences = adheredPreferences;
	}
	
	
	


}
