package com.amazon.device.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class DTBInterstitialActivity extends Activity implements DTBMRAIDCloseButtonListener {
    private static final String LOG_TAG = "DTBInterstitialActivity";
    static DTBInterstitialActivity theRecent;
    LinearLayout closeIndicatorRegion;
    DTBAdInterstitial interstitial;

    public static /* synthetic */ void a(DTBInterstitialActivity dTBInterstitialActivity) {
        dTBInterstitialActivity.lambda$useCustomButtonUpdated$0();
    }

    public static DTBInterstitialActivity getRecentInterstitialActivity() {
        return theRecent;
    }

    public /* synthetic */ void lambda$useCustomButtonUpdated$0() {
        this.closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
    }

    protected boolean getUseCustomClose() {
        return this.interstitial.getAdView().getController().useCustomClose;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            this.interstitial.getAdView().evaluateJavascript("window.mraid.close();", null);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute onBackPressed method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute onBackPressed method", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            theRecent = this;
            requestWindowFeature(1);
            getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            setContentView(R.layout.mdtb_interstitial_ad);
            if (getIntent().hasExtra("DTBAdInterstitialID")) {
                this.interstitial = DTBAdInterstitial.dtbAdInterstitialCache.get(getIntent().getStringExtra("DTBAdInterstitialID"));
            } else {
                this.interstitial = DTBAdInterstitial.getRecent();
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.inter_container);
            final DTBAdView adView = this.interstitial.getAdView();
            adView.setScrollEnabled(false);
            ViewParent parent = adView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(adView);
            }
            int i10 = R.id.mraid_close_indicator;
            this.closeIndicatorRegion = (LinearLayout) findViewById(i10);
            relativeLayout.addView(adView, -1, -1);
            adView.getController().setCustomButtonListener(this);
            this.closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
            LinearLayout linearLayout = (LinearLayout) findViewById(i10);
            linearLayout.bringToFront();
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(adView.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
            layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
            imageView.setImageDrawable(e.a.b(this, R.drawable.mraid_close));
            linearLayout.addView(imageView, layoutParams);
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.device.ads.DTBInterstitialActivity.1
                {
                    DTBInterstitialActivity.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        adView.evaluateJavascript("window.mraid.close();", null);
                        return true;
                    }
                    return false;
                }
            });
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to create DTBInterstitial Activity");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to create DTBInterstitial Activity", e10);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        theRecent = null;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.f0
            @Override // java.lang.Runnable
            public final void run() {
                DTBInterstitialActivity.a(DTBInterstitialActivity.this);
            }
        });
    }
}
