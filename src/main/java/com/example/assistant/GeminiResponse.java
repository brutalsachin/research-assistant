package com.example.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {
    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate
    {
        private Content content;

        public Object getCandidate() {
            return content.getParts().get(0).getText();
        }
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
 public static class Content{
        private List<Part> parts;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part{
        private String text;
    }
}