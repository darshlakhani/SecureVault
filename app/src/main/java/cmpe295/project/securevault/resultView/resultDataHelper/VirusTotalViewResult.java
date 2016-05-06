package cmpe295.project.securevault.resultView.resultDataHelper;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class VirusTotalViewResult {
	
	final static String SCAN_COMPARE_RESULTS = "scanCompareResults";
	final static String Threat_DETECTED = "detected";
	final static String THREAT_NAME = "result";
	
	//McAfee , BitDefender, Baidu, Symantec, Avast, Kaspersky, Comodo, Microsoft, AVG,
	final static String MCAFEE = "McAfee";
	final static String BITDEFENDER = "BitDefender";
	final static String BAIDU = "Baidu";
	final static String SYMANTEC = "Symantec";
	final static String AVAST = "Avast";
	final static String KASPERSKY = "Kaspersky";
	final static String COMODO = "Comodo";
	final static String MICROSOFT = "Microsoft";
	final static String AVG = "AVG";
	static List<String> antiViruses;
	
	static{
		
		antiViruses = new ArrayList<>();
		antiViruses.add(MCAFEE);
		antiViruses.add(BITDEFENDER);
		antiViruses.add(BAIDU);
		antiViruses.add(SYMANTEC);
		antiViruses.add(AVAST);
		antiViruses.add(KASPERSKY);
		antiViruses.add(COMODO);
		antiViruses.add(MICROSOFT);
		antiViruses.add(AVG);
	}
	
	
	List<AntiVirusResult> results;

	public VirusTotalViewResult () {}
	
	public VirusTotalViewResult(String json)
	{
		JSONObject jsonObject = null;
		JSONObject scannedResultJson = null;
		try {
			jsonObject = new JSONObject(json);

		results = new ArrayList<AntiVirusResult>();
		
		scannedResultJson = jsonObject.getJSONObject(SCAN_COMPARE_RESULTS);

		} catch (JSONException e) {
			e.printStackTrace();
		}
		for(String antiVirus : antiViruses)
		{
			JSONObject antiVirusResultJson;
			AntiVirusResult antiVirusResult = new AntiVirusResult();
			antiVirusResult.setName(antiVirus);
			try{
				
				antiVirusResultJson = scannedResultJson.getJSONObject(antiVirus);
				Boolean detected = antiVirusResultJson.getBoolean(Threat_DETECTED);
				antiVirusResult.setDetected((detected));
				String threatName = antiVirusResultJson.getString(THREAT_NAME);
				antiVirusResult.setVirusName(threatName);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally{
				results.add(antiVirusResult);
			}
		}
	}
	
	
	
	public List<AntiVirusResult> getResults() {
		return results;
	}

	public void setResults(List<AntiVirusResult> results) {
		this.results = results;
	}
	
	

}
