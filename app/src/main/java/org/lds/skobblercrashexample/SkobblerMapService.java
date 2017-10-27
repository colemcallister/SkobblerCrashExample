package org.lds.skobblercrashexample;

import android.app.Application;

import com.skobbler.ngx.SKMaps;
import com.skobbler.ngx.SKMapsInitSettings;
import com.skobbler.ngx.SKMapsInitializationListener;
import com.skobbler.ngx.navigation.SKAdvisorSettings;

public class SkobblerMapService {

    private final SKMaps skMaps;

    public SkobblerMapService() {
        skMaps = SKMaps.getInstance();
    }

    public void init(Application application, final MapsInitializedListener mapsInitializedListener) {
        if (skMaps.isSKMapsInitialized()) {
            mapsInitializedListener.onMapsInitialized(true);
            return;
        }

        SKMapsInitSettings initSettings = new SKMapsInitSettings();

        String resourcesPath = getMapResourcesPath(application);
        initSettings.setMapResourcesPath(resourcesPath);

        SKAdvisorSettings advisorSettings = new SKAdvisorSettings();
        advisorSettings.setAdvisorType(SKAdvisorSettings.SKAdvisorType.TEXT_TO_SPEECH);
        advisorSettings.setAdvisorConfigPath(resourcesPath + "Advisor");
        advisorSettings.setResourcePath(resourcesPath + "Advisor/Languages");
        initSettings.setAdvisorSettings(advisorSettings);

        skMaps.initializeSKMaps(application, new SKMapsInitializationListener() {
            @Override
            public void onLibraryInitialized(boolean b) {
                mapsInitializedListener.onMapsInitialized(b);
            }
        });
    }


    private String getMapResourcesPath(Application application) {
        return application.getFilesDir().getPath() + "/SKMaps/";
    }
}
