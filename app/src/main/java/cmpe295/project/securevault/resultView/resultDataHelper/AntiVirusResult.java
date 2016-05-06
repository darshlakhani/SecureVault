package cmpe295.project.securevault.resultView.resultDataHelper;

public class AntiVirusResult {
	
	String name;
	boolean detected;
	String virusName;


	public String getVirusName() {
		return virusName;
	}
	public void setVirusName(String virusName) {
		this.virusName = virusName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDetected() {
		return detected;
	}
	public void setDetected(boolean detected) {
		this.detected = detected;
	}
	@Override
	public String toString() {
		return "AntiVirusResult [name=" + name + ", detected=" + detected + "]";
	}
	
	
	
	


}
