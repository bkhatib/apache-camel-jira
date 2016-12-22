package org.jira;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.jira.JIRAType;

import com.sun.xml.txw2.Document;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LogProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		String projectKey = exchange.getIn().getHeader("ProjectKey", String.class);
        Long issueTypeId = exchange.getIn().getHeader("IssueTypeId", Long.class);
        String issueSummary = exchange.getIn().getHeader("IssueSummary", String.class);
		System.out.println("processing "+projectKey+issueTypeId+issueSummary);
	}


}
	
	
	
