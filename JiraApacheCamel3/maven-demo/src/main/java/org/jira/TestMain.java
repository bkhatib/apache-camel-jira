package org.jira;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * TestMain
 * I was facing issue in DataType Conversion, but I'm pretty sure that the issue is on the way of creating the jira endpoint.
 *
 */
public class TestMain 
{
    public static void main( String[] args ) throws Exception
    {
       RouteBuilderConfig routeBuilder= new RouteBuilderConfig();
       CamelContext ctx =new DefaultCamelContext();
      // ((CamelContext) ctx.getManagedCamelContext()).getTypeConverter().convertTo(JIRAType.class, "remaining");
       try {
    	   
		ctx.addRoutes(routeBuilder);
		ctx.start();
		Thread.sleep(2*60*1000);
		ctx.stop();
	} catch (Exception e) {
		e.printStackTrace();
	}
       
    }
}

