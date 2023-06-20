package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.File;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f8595a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinNativeAdImpl f8596c;

    /* renamed from: d  reason: collision with root package name */
    private final InterfaceC0133a f8597d;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, m mVar, InterfaceC0133a interfaceC0133a) {
        super("TaskCacheNativeAd", mVar);
        this.f8595a = new com.applovin.impl.sdk.d.e();
        this.f8596c = appLovinNativeAdImpl;
        this.f8597d = interfaceC0133a;
    }

    private Uri a(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (v.a()) {
            a("Attempting to cache resource: " + uri);
        }
        String a10 = this.f8349b.aa() != null ? this.f8349b.aa().a(f(), uri.toString(), this.f8596c.getCachePrefix(), Collections.emptyList(), false, this.f8595a) : this.f8349b.ab().a(f(), uri.toString(), this.f8596c.getCachePrefix(), Collections.emptyList(), false, this.f8595a);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f8349b.aa() != null ? this.f8349b.aa().a(a10, f()) : this.f8349b.ab().a(a10, f());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    return fromFile;
                }
                if (v.a()) {
                    str = "Unable to extract Uri from image file";
                    d(str);
                }
            } else if (v.a()) {
                str = "Unable to retrieve File from cached image filename = " + a10;
                d(str);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (v.a()) {
            a("Begin caching ad #" + this.f8596c.getAdIdNumber() + "...");
        }
        Uri a10 = a(this.f8596c.getIconUri());
        if (a10 != null) {
            this.f8596c.setIconUri(a10);
        }
        Uri a11 = a(this.f8596c.getMainImageUri());
        if (a11 != null) {
            this.f8596c.setMainImageUri(a11);
        }
        Uri a12 = a(this.f8596c.getPrivacyIconUri());
        if (a12 != null) {
            this.f8596c.setPrivacyIconUri(a12);
        }
        if (v.a()) {
            a("Finished caching ad #" + this.f8596c.getAdIdNumber());
        }
        this.f8597d.a(this.f8596c);
    }
}
