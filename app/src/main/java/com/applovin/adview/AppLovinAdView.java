package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.b;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a  reason: collision with root package name */
    private b f6686a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(null, null, null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        a(appLovinAdSize, str, null, context, null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    private void a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    private void a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            a(attributeSet, context);
            return;
        }
        b bVar = new b();
        this.f6686a = bVar;
        bVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.f();
        }
    }

    public b getController() {
        return this.f6686a;
    }

    public AppLovinAdSize getSize() {
        b bVar = this.f6686a;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public String getZoneId() {
        b bVar = this.f6686a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public void loadNextAd() {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a();
        } else {
            v.g("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.j();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a(appLovinAd);
        }
    }

    public void resume() {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        b bVar = this.f6686a;
        if (bVar != null) {
            bVar.a(appLovinAdViewEventListener);
        }
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }
}
