package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ExternalFindings {
    private List<Finding> findings;

    @JsonProperty("findings")
    public List<Finding> getFindings() { return findings; }
    @JsonProperty("findings")
    public void setFindings(List<Finding> value) { this.findings = value; }
}
