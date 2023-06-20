package com.google.android.ads.mediationtestsuite.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.TestResult;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: AdManager.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected NetworkConfig f20902a;

    /* renamed from: b  reason: collision with root package name */
    protected com.google.android.ads.mediationtestsuite.a f20903b;

    /* renamed from: c  reason: collision with root package name */
    protected AdRequest f20904c;

    /* renamed from: e  reason: collision with root package name */
    protected Boolean f20906e = Boolean.FALSE;

    /* renamed from: d  reason: collision with root package name */
    protected AdListener f20905d = new C0281a();

    /* compiled from: AdManager.java */
    /* renamed from: com.google.android.ads.mediationtestsuite.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0281a extends AdListener {
        C0281a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (a.this.f20906e.booleanValue()) {
                return;
            }
            a.this.f20902a.H(TestResult.getFailureResult(loadAdError.getCode()));
            a aVar = a.this;
            aVar.f20903b.a(aVar, loadAdError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            if (a.this.f20906e.booleanValue()) {
                return;
            }
            if (a.this.b()) {
                a.this.f20902a.H(TestResult.SUCCESS);
                a aVar = a.this;
                aVar.f20903b.b(aVar);
                return;
            }
            LoadAdError loadAdError = new LoadAdError(3, e.k().getString(com.google.android.ads.mediationtestsuite.g.f20891x), "undefined", null, null);
            a.this.f20902a.H(TestResult.getFailureResult(3));
            a aVar2 = a.this;
            aVar2.f20903b.a(aVar2, loadAdError);
        }
    }

    public a(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
        this.f20902a = networkConfig;
        this.f20903b = aVar;
        this.f20904c = b.b(networkConfig.u(), this.f20902a);
    }

    public void a() {
        this.f20906e = Boolean.TRUE;
    }

    protected boolean b() {
        String c10 = c();
        return c10 != null && TextUtils.equals(c10, this.f20902a.i().f());
    }

    protected abstract String c();

    public NetworkConfig d() {
        return this.f20902a;
    }

    public abstract void e(Context context);

    public abstract void f(Activity activity);
}
