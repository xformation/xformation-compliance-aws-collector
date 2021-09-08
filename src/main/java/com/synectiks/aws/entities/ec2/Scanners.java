package com.synectiks.aws.entities.ec2;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scanners {
	private List<Scan> scans;
	private List<ScannersFinding> findings;

	@JsonProperty("scans")
	public List<Scan> getScans() {
		return scans;
	}

	@JsonProperty("scans")
	public void setScans(List<Scan> value) {
		this.scans = value;
	}

	@JsonProperty("findings")
	public List<ScannersFinding> getFindings() {
		return findings;
	}

	@JsonProperty("findings")
	public void setFindings(List<ScannersFinding> value) {
		this.findings = value;
	}
}
