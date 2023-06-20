package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes.dex */
public class InneractiveInternalBrowserActivity extends Activity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* renamed from: j  reason: collision with root package name */
    public static InternalBrowserListener f16680j;

    /* renamed from: a  reason: collision with root package name */
    public j f16681a;

    /* renamed from: b  reason: collision with root package name */
    public String f16682b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f16683c;

    /* renamed from: d  reason: collision with root package name */
    public WebView f16684d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f16685e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton f16686f;

    /* renamed from: g  reason: collision with root package name */
    public ImageButton f16687g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f16688h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16689i = false;

    /* loaded from: classes.dex */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f16680j = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f16680j;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f16683c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f16684d;
        if (webView != null) {
            webView.destroy();
            this.f16684d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().stopSync();
        }
        this.f16689i = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().startSync();
        }
    }

    public final View a() {
        this.f16683c = new LinearLayout(this);
        this.f16683c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f16683c.setOrientation(1);
        this.f16683c.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f16683c.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, l.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(l.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f16685e = a(l.d(R.drawable.ia_ib_left_arrow));
        this.f16686f = a(l.d(R.drawable.ia_ib_right_arrow));
        this.f16687g = a(l.d(R.drawable.ia_ib_refresh));
        this.f16688h = a(l.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f16685e);
        linearLayout.addView(this.f16686f);
        linearLayout.addView(this.f16687g);
        linearLayout.addView(this.f16688h);
        WebView webView = new WebView(this);
        this.f16684d = webView;
        webView.setId(R.id.inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f16684d.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f16684d);
        return this.f16683c;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        Resources resources = getResources();
        int i10 = R.integer.ia_ib_button_size_dp;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l.b(resources.getInteger(i10)), l.b(getResources().getInteger(i10)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
