package org.brandondave.worldengine.server;



import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

import org.brandondave.worldengine.server.config.ExampleServiceConfiguration;

import io.dropwizard.setup.Environment;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;

import org.slf4j.LoggerFactory;


/**
 * Entry point for server.
 */
public class App extends Application<ExampleServiceConfiguration>
{
	public static void main(String[] args) throws Exception
    {
        new App().run(args);
    }
	
    @Override
    public void initialize(Bootstrap<ExampleServiceConfiguration> bootstrap)
    {
       //nothing yet
    }
    
    @Override
    public String getName() {
        return "shelob";
    }
	
    @Override
    public void run(ExampleServiceConfiguration conf, Environment env) throws Exception
    {
    	// set logback settings according to logback configuration XML
    	// assume SLF4J is bound to logback in the current environment
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        
        try {
          JoranConfigurator configurator = new JoranConfigurator();
          configurator.setContext(context);
          // Call context.reset() to clear any previous configuration, e.g. default 
          // configuration. For multi-step configuration, omit calling context.reset().
          // context.reset(); 
          configurator.doConfigure( conf.getMessages().getLogbackXmlLocation() );
          configurator.registerSafeConfiguration();
        } catch (JoranException je) {
          // StatusPrinter will handle this
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(context);
        
        Config.CONFIG.setup(conf);
    	
        //add managed items here
        //env.lifecycle().manage(MongoDbController.MONGO);
        
        //add resource classes here
        //env.jersey().register(new BridgeInvoke());
        //env.jersey().register(new ErrorCode());
        //env.jersey().register(new Method());
        //env.jersey().register(new Product());
        //env.jersey().register(new Scripts());
        //env.jersey().register(new SupportCharts());
        //env.jersey().register(new Vendor());
    }        

}
