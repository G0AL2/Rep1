package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f17066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f17067b;

    public s(Context context, t tVar) {
        this.f17066a = context;
        this.f17067b = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            u.a(this.f17066a, this.f17067b);
            if (TextUtils.isEmpty(k.a())) {
                Context context = this.f17066a;
                t tVar = this.f17067b;
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    k kVar = (k) tVar;
                    synchronized (kVar) {
                        k.c cVar = kVar.f16994b;
                        cVar.f16996a = string;
                        cVar.f16997b = z10;
                        cVar.f16998c = true;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                }
            }
        } catch (ClassNotFoundException e10) {
            IAlog.b("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + e10.toString(), new Object[0]);
        }
    }
}
