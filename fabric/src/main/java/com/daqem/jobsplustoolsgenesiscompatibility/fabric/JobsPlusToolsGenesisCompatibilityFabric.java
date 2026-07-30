package com.daqem.jobsplustoolsgenesiscompatibility.fabric;

import com.daqem.jobsplustoolsgenesiscompatibility.JobsPlusToolsGenesisCompatibility;
import net.fabricmc.api.ModInitializer;

public class JobsPlusToolsGenesisCompatibilityFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        JobsPlusToolsGenesisCompatibility.init();
    }

}
