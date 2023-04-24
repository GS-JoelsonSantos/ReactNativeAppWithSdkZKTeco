package com.app;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewManager;

public class PackageZKTeco implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext){
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext){
        List<NativeModule> modules = new ArrayList<NativeModule>();
        modules.add(new ModuleZKTeco(reactContext));
        return modules;
    }
}
