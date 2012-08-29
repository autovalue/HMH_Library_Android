package hmh.android.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class BrowserView extends WebView {

    public BrowserView(Context context) {
	super(context);
	initView();
    }

    public BrowserView(Context context, AttributeSet attrs) {
	super(context, attrs);
	initView();
    }

    public BrowserView(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	initView();
    }

    private void initView() {
	this.setWebChromeClient(new WebChromeClient());
    }

    public void noNetwork(boolean b) {
	this.setNetworkAvailable(false);
	this.getSettings().setBlockNetworkImage(true);
	if (Build.VERSION.SDK_INT >= 8) {
	    this.getSettings().setBlockNetworkLoads(true);
	}

    }

    public void loadPage(String url) {
	this.loadUrl(url);
    }

}
