package com.example.demo.pojo.vpc;

import com.fasterxml.jackson.annotation.*;

public class ExternalFindings {
    private Finding[] findings;

    @JsonProperty("findings")
    public Finding[] getFindings() { return findings; }
    @JsonProperty("findings")
    public void setFindings(Finding[] value) { this.findings = value; }
}
