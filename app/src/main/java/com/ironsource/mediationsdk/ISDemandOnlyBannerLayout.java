package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* loaded from: classes3.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    View f26286a;

    /* renamed from: b  reason: collision with root package name */
    ISBannerSize f26287b;

    /* renamed from: c  reason: collision with root package name */
    String f26288c;

    /* renamed from: d  reason: collision with root package name */
    Activity f26289d;

    /* renamed from: e  reason: collision with root package name */
    boolean f26290e;

    /* renamed from: f  reason: collision with root package name */
    boolean f26291f;

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f26290e = false;
        this.f26291f = false;
        this.f26289d = activity;
        this.f26287b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final IronSourceError ironSourceError) {
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ISDemandOnlyBannerLayout.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ISDemandOnlyBannerLayout.this.f26291f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError);
                } else {
                    try {
                        if (ISDemandOnlyBannerLayout.this.f26286a != null) {
                            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
                            iSDemandOnlyBannerLayout.removeView(iSDemandOnlyBannerLayout.f26286a);
                            ISDemandOnlyBannerLayout.this.f26286a = null;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                C1736j.a().a(ironSourceError);
            }
        });
    }

    public Activity getActivity() {
        return this.f26289d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return C1736j.a().f27110a;
    }

    public View getBannerView() {
        return this.f26286a;
    }

    public String getPlacementName() {
        return this.f26288c;
    }

    public ISBannerSize getSize() {
        return this.f26287b;
    }

    public boolean isDestroyed() {
        return this.f26290e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C1736j.a().f27110a = null;
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        C1736j.a().f27110a = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.f26288c = str;
    }
}
