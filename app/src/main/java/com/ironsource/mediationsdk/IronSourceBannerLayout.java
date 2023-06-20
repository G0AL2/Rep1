package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes3.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f26299a;

    /* renamed from: b  reason: collision with root package name */
    private ISBannerSize f26300b;

    /* renamed from: c  reason: collision with root package name */
    private String f26301c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f26302d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26303e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26304f;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f26303e = false;
        this.f26304f = false;
        this.f26302d = activity;
        this.f26300b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final IronSourceBannerLayout a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f26302d, this.f26300b);
        ironSourceBannerLayout.setBannerListener(C1737k.a().f27119a);
        ironSourceBannerLayout.setLevelPlayBannerListener(C1737k.a().f27120b);
        ironSourceBannerLayout.setPlacementName(this.f26301c);
        return ironSourceBannerLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final View view, final FrameLayout.LayoutParams layoutParams) {
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.IronSourceBannerLayout.2
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                IronSourceBannerLayout.this.f26299a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(AdInfo adInfo, boolean z10) {
        C1737k.a().a(adInfo, z10);
        this.f26304f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final IronSourceError ironSourceError, final boolean z10) {
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.IronSourceBannerLayout.1
            @Override // java.lang.Runnable
            public final void run() {
                C1737k a10;
                IronSourceError ironSourceError2;
                boolean z11;
                if (IronSourceBannerLayout.this.f26304f) {
                    a10 = C1737k.a();
                    ironSourceError2 = ironSourceError;
                    z11 = true;
                } else {
                    try {
                        if (IronSourceBannerLayout.this.f26299a != null) {
                            IronSourceBannerLayout ironSourceBannerLayout = IronSourceBannerLayout.this;
                            ironSourceBannerLayout.removeView(ironSourceBannerLayout.f26299a);
                            IronSourceBannerLayout.this.f26299a = null;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    a10 = C1737k.a();
                    ironSourceError2 = ironSourceError;
                    z11 = z10;
                }
                a10.a(ironSourceError2, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f26303e = true;
        this.f26302d = null;
        this.f26300b = null;
        this.f26301c = null;
        this.f26299a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.f26302d;
    }

    public BannerListener getBannerListener() {
        return C1737k.a().f27119a;
    }

    public View getBannerView() {
        return this.f26299a;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C1737k.a().f27120b;
    }

    public String getPlacementName() {
        return this.f26301c;
    }

    public ISBannerSize getSize() {
        return this.f26300b;
    }

    public boolean isDestroyed() {
        return this.f26303e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C1737k.a().f27119a = null;
        C1737k.a().f27120b = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C1737k.a().f27119a = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info("");
        C1737k.a().f27120b = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.f26301c = str;
    }
}
