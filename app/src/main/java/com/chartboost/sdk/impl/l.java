package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private static l f14141b = new l(new Handler(Looper.getMainLooper()));

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14142a;

    public l(Handler handler) {
        this.f14142a = handler;
    }

    public static l b() {
        return f14141b;
    }

    public boolean a(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    public boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }

    public Task<AppSetIdInfo> b(Context context) {
        return AppSet.getClient(context).getAppSetIdInfo();
    }

    public AdvertisingIdClient.Info a(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException, IllegalStateException {
        return AdvertisingIdClient.getAdvertisingIdInfo(context);
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
}
