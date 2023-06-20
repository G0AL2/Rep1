package com.amazon.device.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class DTBAdActivity extends Activity {
    static final String ADTYPE_ATTR = "ad_state";
    static final String EXPANDED = "expanded";
    static final String INDEX_ATTR = "cntrl_index";
    static final String TWO_PART_EXPAND = "two_part_expand";
    static final String URL_ATTR = "url";
    private final String LOG_TAG = DTBAdActivity.class.getSimpleName();
    DTBAdView adView;
    int index;
    RelativeLayout pageLayout;
    String type;

    private void createExpanded() {
        this.adView = new DTBAdView(this, new DTBAdExpandedListener() { // from class: com.amazon.device.ads.DTBAdActivity.1
            @Override // com.amazon.device.ads.DTBAdExpandedListener
            public void onAdLoaded(DTBAdView dTBAdView) {
            }

            @Override // com.amazon.device.ads.DTBAdExpandedListener
            public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            }
        }, this.index);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra(TWO_PART_EXPAND, false);
        this.pageLayout.addView(this.adView, -1, -1);
        this.adView.fetchAdWithLocation(stringExtra);
        this.adView.setScrollEnabled(true);
        DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = (DTBAdMRAIDExpandedController) this.adView.getController();
        dTBAdMRAIDExpandedController.setTwoPartExpand(booleanExtra);
        dTBAdMRAIDExpandedController.addCloseIndicator();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            this.adView.getController().closeExpandedPartTwo();
        } catch (RuntimeException e10) {
            DtbLog.error(this.LOG_TAG, "Fail to execute finish method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute finish method", e10);
        }
    }

    void handleOrientation() {
        Serializable serializableExtra = getIntent().getSerializableExtra(AdUnitActivity.EXTRA_ORIENTATION);
        if (serializableExtra != null) {
            Map map = (Map) serializableExtra;
            boolean booleanValue = ((Boolean) map.get("allowOrientationChange")).booleanValue();
            String str = (String) map.get("forceOrientation");
            if (str != null) {
                if (DtbDeviceDataRetriever.ORIENTATION_PORTRAIT.equals(str)) {
                    setRequestedOrientation(1);
                } else if (DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE.equals(str)) {
                    setRequestedOrientation(0);
                } else if (booleanValue) {
                } else {
                    if (DisplayUtils.determineSimpleOrientation() == 2) {
                        setRequestedOrientation(6);
                    } else {
                        setRequestedOrientation(7);
                    }
                }
            }
        }
    }

    protected boolean isExpanded() {
        return EXPANDED.equals(this.type);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.pageLayout = relativeLayout;
        setContentView(relativeLayout);
        this.type = getIntent().getStringExtra(ADTYPE_ATTR);
        this.index = getIntent().getIntExtra(INDEX_ATTR, 0);
        if (this.type.equals(EXPANDED)) {
            createExpanded();
        }
        handleOrientation();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void straightFinish() {
        super.finish();
    }
}
