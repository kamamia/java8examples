import java.util.HashMap;
import java.util.Map;

public enum Status {
	PASSED(1, "Passed", "The test has passed."),
	FAILED(-1, "Failed",
			"The test was executed but failed."), 
			DID_NOT_RUN(0, "Did not run",
			"The test did not start."),
	
	ADDED_BY_G(10, "ADDED_BY_G");
	
	private int code;
	private String label;
	private String description;

	private static Map<Integer, Status> codeToStatusMapping;

	Status(int code, String label, String description) {
		this.setCode(code);
		this.setLabel(label);
		this.setDescription(description);
	}

	Status(int code, String label) {
		this.setCode(code);
		this.setLabel(label);
		this.setDescription("myDESC");
	}

	public static Status getStatus(int i) {
		if (codeToStatusMapping == null) {
			initMapping();
		}
		return codeToStatusMapping.get(i);
	}

	private static void initMapping() {
		codeToStatusMapping = new HashMap<Integer, Status>();
		for (Status s : values()) {
			codeToStatusMapping.put(s.code, s);
		}
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static Map<Integer, Status> getCodeToStatusMapping() {
		return codeToStatusMapping;
	}

	public static void setCodeToStatusMapping(
			Map<Integer, Status> codeToStatusMapping) {
		Status.codeToStatusMapping = codeToStatusMapping;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Status");
		sb.append("{code=").append(code);
		sb.append(", label='").append(label).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(Status.ADDED_BY_G);
		System.out.println(Status.PASSED);
		System.out.println(Status.getStatus(-1));
	}

}

