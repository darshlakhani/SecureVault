package cmpe295.project.securevault.resultView.resultDataHelper;

import cmpe295.project.securevault.Constants;

public class TestJson {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		testThreatSummaryViewResult();
		
//		testPreferenceViewResult();
		
//		testVirusTotalViewResult();

	}

	private static void testVirusTotalViewResult() {
		// TODO Auto-generated method stub
		
		System.out.println("********************    Creating VirusTotal View Result    *****************************");
		VirusTotalViewResult vtView = new VirusTotalViewResult(Constants.finalJson);
		
		System.out.println("-------------------      Anti Virus Results  --------------------------");
		for(AntiVirusResult result : vtView.getResults())
		{
			System.out.println(result);
		}
		
		System.out.println("*******************  Test Complete Virus Total View *************************");
		
		
		
	}

	private static void testPreferenceViewResult() {
		// TODO Auto-generated method stub
		
		System.out.println("**************************     Creating Preference View Result   ************************** ");
		
		PreferenceViewResult pView = new PreferenceViewResult(Constants.finalJson);
		
		System.out.println("Violated Count : " + pView.getViolatedCount());
		System.out.println("Adhered Count : " + pView.getAdheredCount());
		System.out.println("Violated Percent : " + pView.getViolatedPercent());
		System.out.println("Adhered Percent : " + pView.getAdheredPercent());
		
		System.out.println("Violated Preferences ");
		for(String violated : pView.getViolatedPreferences())
		{
			System.out.print("    " + violated);
		}
		System.out.println();
		
		System.out.println("Adhered Preferences  ");
		for(String adhered : pView.getAdheredPreferences())
		{
			System.out.print("   " + adhered);
		}
		System.out.println();
		System.out.println("**************************      Test Complete Preference View Result    **************************");
		

		
	}

	private static void testThreatSummaryViewResult() {
		// TODO Auto-generated method stub
		
		System.out.println("************************** 	Creating ThreatSummaryViewResult	**************************");
		ThreatSummaryViewResult summary = new ThreatSummaryViewResult(Constants.finalJson);
		
		System.out.println("Critical Vector Count : " +summary.criticalVectorCount);
		System.out.println("Warning Vector Count : " + summary.warningVectorCount);
		System.out.println("Notice Vector Count : " + summary.noticeVectorCOunt);

		System.out.println("Critical Percent : " + summary.criticalPercent);
		System.out.println("Warning Percent : " + summary.warningPercent);
		System.out.println("Notice Percent : " + summary.noticePercent);
		
		
		System.out.println("************************   Critical Vectors *********************************: ");
		System.out.println(summary.getCriticalVectors());
		System.out.println(summary.getCritical());
		
		System.out.println("***********************    Warning Vectors  **********************************");
		System.out.println(summary.getWarningVectors());
		System.out.println(summary.getWarning());
		
		System.out.println("*************************    NOTICE  Vectors   *************************");
		System.out.println(summary.getNoticeVectors());
		System.out.println(summary.getNotice());
		
		
		
		System.out.println("**************************   Created ThreatSummaryViewResult	**************************");
		
		
	}

}
