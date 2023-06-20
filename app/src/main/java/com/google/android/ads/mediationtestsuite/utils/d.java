package com.google.android.ads.mediationtestsuite.utils;

import android.app.Activity;
import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import org.jspecify.nullness.Nullable;

/* compiled from: BannerAdManager.java */
/* loaded from: classes2.dex */
public class d extends a {

    /* renamed from: f  reason: collision with root package name */
    private AdView f20917f;

    public d(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
        super(networkConfig, aVar);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    @Nullable
    protected String c() {
        if (this.f20917f.getResponseInfo() == null) {
            return null;
        }
        return this.f20917f.getResponseInfo().getMediationAdapterClassName();
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void e(Context context) {
        if (this.f20917f == null) {
            this.f20917f = new AdView(context);
        }
        this.f20917f.setAdUnitId(this.f20902a.h());
        this.f20917f.setAdSize(AdSize.BANNER);
        this.f20917f.setAdListener(this.f20905d);
        this.f20917f.loadAd(this.f20904c);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void f(Activity activity) {
    }

    public AdView g() {
        return this.f20917f;
    }
}
