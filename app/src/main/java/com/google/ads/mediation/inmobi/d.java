package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InMobiInitializer.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f20627c;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f20629b = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private int f20628a = 0;

    /* compiled from: InMobiInitializer.java */
    /* loaded from: classes2.dex */
    class a implements SdkInitializationListener {
        a() {
        }

        @Override // com.inmobi.sdk.SdkInitializationListener
        public void onInitializationComplete(Error error) {
            if (error == null) {
                Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
                d.this.f20628a = 2;
                Iterator it = d.this.f20629b.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b();
                }
            } else {
                d.this.f20628a = 0;
                AdError adError = new AdError(101, error.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
                Iterator it2 = d.this.f20629b.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).a(adError);
                }
            }
            d.this.f20629b.clear();
        }
    }

    /* compiled from: InMobiInitializer.java */
    /* loaded from: classes2.dex */
    interface b {
        void a(AdError adError);

        void b();
    }

    private d() {
    }

    public static d c() {
        if (f20627c == null) {
            f20627c = new d();
        }
        return f20627c;
    }

    public void d(Context context, String str, b bVar) {
        if (this.f20628a == 2) {
            bVar.b();
            return;
        }
        this.f20629b.add(bVar);
        if (this.f20628a == 1) {
            return;
        }
        this.f20628a = 1;
        InMobiSdk.init(context, str, c.a(), new a());
    }
}
