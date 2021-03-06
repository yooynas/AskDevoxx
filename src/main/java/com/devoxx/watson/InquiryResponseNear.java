/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devoxx.watson;

import com.devoxx.watson.model.RetrieveAndRankDocument;
import com.devoxx.watson.model.ConversationContext;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Holds a response to a client inquiry.
 *
 * @author James Weaver
 */
@JsonRootName("inquiryResponse")
@JsonPropertyOrder({"context", "inquiryText", "responseText", "resources"})

@JsonIgnoreProperties(ignoreUnknown = true)
public class InquiryResponseNear implements Serializable {
  @JsonProperty("context")
  private ConversationContext context;

  @JsonProperty("inquiryText")
  private String inquiryText;

  @JsonProperty("responseText")
  private String responseText;

  @JsonProperty("resources")
  private List<RetrieveAndRankDocument> resources = new ArrayList<>();

  public InquiryResponseNear() {
  }

  public InquiryResponseNear(ConversationContext context, String inquiryText, String responseText, List<RetrieveAndRankDocument> resources) {
    this.context = context;
    this.inquiryText = inquiryText;
    this.responseText = responseText;
    this.resources = resources;
  }

  public ConversationContext getContext() {
    return context;
  }

  public void setContext(ConversationContext context) {
    this.context = context;
  }

  public String getInquiryText() {
    return inquiryText;
  }

  public void setInquiryText(String inquiryText) {
    this.inquiryText = inquiryText;
  }

  public String getResponseText() {
    return responseText;
  }

  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }

  public List<RetrieveAndRankDocument> getResources() {
    return resources;
  }

  public void setResources(List<RetrieveAndRankDocument> resources) {
    this.resources = resources;
  }

  @Override
  public String toString() {
    return "InquiryResponseNear{" +
        "context=" + context +
        ", inquiryText='" + inquiryText + '\'' +
        ", responseText='" + responseText + '\'' +
        ", resources=" + resources +
        '}';
  }
}
