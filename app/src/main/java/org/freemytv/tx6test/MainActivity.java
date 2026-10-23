package org.freemytv.tx6test;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
 private WebView web;
 @Override public void onCreate(Bundle s){super.onCreate(s);getWindow().getDecorView().setSystemUiVisibility(5894|1024|512); web=new WebView(this);web.setBackgroundColor(0xfff6f7f9);web.setFocusable(true);web.setFocusableInTouchMode(true);WebSettings w=web.getSettings();w.setJavaScriptEnabled(true);w.setDomStorageEnabled(true);setContentView(web);web.loadUrl("file:///android_asset/index.html");web.requestFocus();}
 @Override public void onBackPressed(){if(web!=null)web.evaluateJavascript("goHome()",v->{if("false".equals(v))finish();});else finish();}
 @Override protected void onDestroy(){if(web!=null){web.destroy();web=null;}super.onDestroy();}
}