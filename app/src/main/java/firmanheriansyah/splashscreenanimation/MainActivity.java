package firmanheriansyah.splashscreenanimation;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class MainActivity extends AwesomeSplash {

    @Override
    public void initSplash(ConfigSplash configSplash) {
           /* you don't have to override every property */

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorPrimary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeIn); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)

        //Customize Path
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(1000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.colorAccent); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(1000);
        configSplash.setPathSplashFillColor(R.color.colorAccent); //path object filling color

        //Customize Title/
        configSplash.setTitleSplash("FIRMAN HERIANSYAH"); // Setting title splashscreen
        configSplash.setTitleTextColor(R.color.colorAccent); // Setting color text
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(2000); //float value
        configSplash.setAnimTitleTechnique(Techniques.FadeIn); // Setting animation

    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
        finish();
        //transit to another activity here
        //or do whatever you want
    }
}
