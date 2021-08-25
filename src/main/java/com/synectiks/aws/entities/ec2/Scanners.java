package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Scanners {
    private List<Scan> scans;
    private List<ScannersFinding> findings;

    @JsonProperty("scans")
    public List<Scan> getScans() { return scans; }
    @JsonProperty("scans")
    public void setScans(List<Scan> value) { this.scans = value; }

    @JsonProperty("findings")
    public List<ScannersFinding> getFindings() { return findings; }
    @JsonProperty("findings")
    public void setFindings(List<ScannersFinding> value) { this.findings = value; }
}
