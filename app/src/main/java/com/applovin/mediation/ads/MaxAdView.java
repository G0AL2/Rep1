package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.impl.sdk.utils.q;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private MaxAdViewImpl f8991a;

    /* renamed from: b  reason: collision with root package name */
    private View f8992b;

    /* renamed from: c  reason: collision with root package name */
    private int f8993c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String a10 = b.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a11 = b.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(a11) ? MaxAdFormat.formatFromString(a11) : b.a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a10 == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(a10)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        a(a10, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, b.a(context), appLovinSdk, context);
    }

    private void a(MaxAdFormat maxAdFormat, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int applyDimension = maxAdFormat == MaxAdFormat.MREC ? (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getWidth(), displayMetrics) : displayMetrics.widthPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, applyDimension, (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getHeight(), displayMetrics));
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        if (isInEditMode()) {
            a(maxAdFormat, context);
            return;
        }
        View view = new View(context.getApplicationContext());
        this.f8992b = view;
        view.setBackgroundColor(0);
        addView(this.f8992b);
        this.f8992b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8993c = getVisibility();
        this.f8991a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f8992b, appLovinSdk.coreSdk, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f8991a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f8991a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f8991a.getAdUnitId();
    }

    public String getPlacement() {
        return this.f8991a.getPlacement();
    }

    public void loadAd() {
        this.f8991a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f8991a != null && q.a(this.f8993c, i10)) {
            this.f8991a.onWindowVisibilityChanged(i10);
        }
        this.f8993c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8991a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f8992b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f8991a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i10);
        }
        View view = this.f8992b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f8991a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f8991a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f8991a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8991a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f8991a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8991a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f8991a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f8991a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f8991a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
