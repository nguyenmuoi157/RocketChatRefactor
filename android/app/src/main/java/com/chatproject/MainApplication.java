package com.chatproject;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

//import java.awt.SplashScreen;
import java.util.Arrays;
import java.util.List;

import com.oblador.vectoricons.VectorIconsPackage;
import com.remobile.toast.RCTToastPackage;
import io.realm.react.RealmReactPackage;

import org.devio.rn.splashscreen.SplashScreen;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.rnim.rn.audio.ReactNativeAudioPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
//import com.wix.reactnativekeyboardinput.KeyboardInputModule;
import com.horcrux.svg.SvgPackage;
import com.balthazargronon.RCTZeroconf.ZeroconfReactPackage;
import com.wix.reactnativekeyboardinput.KeyboardInputPackage;
public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new RNGestureHandlerPackage()
          ,new RealmReactPackage()
         , new VectorIconsPackage()
         ,new RCTToastPackage()
         ,new SplashScreenReactPackage()
         ,new ReactNativeAudioPackage()
         ,new RNFetchBlobPackage() 
         ,new SvgPackage()
         ,new ZeroconfReactPackage()
         //,new KeyboardInputPackage(this)
        ,new KeyboardInputPackage(MainApplication.this)
         
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}