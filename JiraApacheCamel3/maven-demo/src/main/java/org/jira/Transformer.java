package org.jira;

/**
 * @author Bashar
 * 
 * I was not able to make any process on the body here as i should parse the it and prepare it for saving on csv. file
 */
public class Transformer {
	public String transformContent(String body)
	{
		System.out.println("invoking the transformContent method"+body.toString());
		String upperCaseContent=body.toUpperCase(); // I was not able to make any process on it as i should parse the body here and prepare it for saving on csv. file  
		//System.out.println(object);
		return upperCaseContent;
	}

}