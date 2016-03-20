/*!COPYRIGHT HEADER! 
 *
 */

package com.darwino.demo.vaddin.hw.app;

import com.darwino.commons.json.JsonException;
import com.darwino.jsonstore.sql.impl.sqlite.SqliteDatabaseCustomizer;
import com.darwino.mobile.platform.DarwinoMobileApplication;
import com.darwino.mobile.platform.DarwinoMobileManifest;
import com.darwino.mobile.platform.DarwinoMobileSettings;

/**
 * Mobile Application Manifest.
 * 
 * @author Philippe Riand
 */
public class AppMobileManifest extends DarwinoMobileManifest {
	
	public AppMobileManifest(String pathInfo) {
		super(pathInfo);
	}
	

	@Override
	public boolean hasCapability(String name) {
		// Allow the local service cache
		if(DarwinoMobileApplication.CAPABILITY_LOCALSERVICESCACHE.equals(name)) {
			return true;
		}
		return super.hasCapability(name);
	}

	@Override
	public void initDefaultSettings(DarwinoMobileSettings settings) {
		super.initDefaultSettings(settings);
		// Set the default settings here
	}

	@Override
	public SqliteDatabaseCustomizer findDatabaseCustomizer(String dbName) throws JsonException {
		// Return your database customizer here
		return new AppDatabaseCustomizer();
	}
}
