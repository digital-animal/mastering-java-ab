package com.zahid.engsubject;

public class EngSubject {
    private int subjectID;
    private String subjectName;
    private int maxMarks;
    private int obtainedMarks;

	public EngSubject(int subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}

	public EngSubject(int subjectID, String subjectName, int maxMarks) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.maxMarks = maxMarks;
	}

	public EngSubject(int subjectID, String subjectName, int maxMarks, int obtainedMarks) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.maxMarks = maxMarks;
		this.obtainedMarks = obtainedMarks;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

    public boolean isQualified() {
        return obtainedMarks >= 0.4*maxMarks;
    }

	@Override
	public String toString() {
		return "EngSubject [maxMarks=" + maxMarks + ", obtainedMarks=" + obtainedMarks + ", subjectID=" + subjectID
				+ ", subjectName=" + subjectName + "]";
	}

}
