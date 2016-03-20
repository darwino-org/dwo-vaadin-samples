/*!COPYRIGHT HEADER! 
 *
 */

package com.darwino.demo.vaddin.hw.app;

import java.util.List;

import com.darwino.commons.platform.impl.PluginImpl;
import com.darwino.mobile.platform.commands.CommandsExtension;



/**
 * IOS Plugin for registering the services.
 * 
 */
public class AppPlugin extends PluginImpl {
	
	public AppPlugin() {
		super("IOS Application");
	}

	@Override
	public void findExtensions(Class<?> serviceClass, List<Object> extensions) {
		if(serviceClass==CommandsExtension.class) {
			extensions.add(new AppHybridActions());
		}
	}
}
