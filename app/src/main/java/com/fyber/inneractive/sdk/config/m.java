package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f17000a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f17001b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f17002c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            IAConfigManager iAConfigManager = mVar.f17002c;
            com.fyber.inneractive.sdk.measurement.d dVar = new com.fyber.inneractive.sdk.measurement.d();
            iAConfigManager.I = dVar;
            Context context = mVar.f17001b;
            if (dVar.f17326a) {
                return;
            }
            dVar.f17326a = true;
            com.fyber.inneractive.sdk.util.n.f20310b.post(new com.fyber.inneractive.sdk.measurement.b(dVar, context));
        }
    }

    public m(IAConfigManager iAConfigManager, IAConfigManager iAConfigManager2, Context context) {
        this.f17002c = iAConfigManager;
        this.f17000a = iAConfigManager2;
        this.f17001b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i10 = Omid.f24015a;
            com.fyber.inneractive.sdk.util.n.f20310b.post(new a());
        } catch (Throwable unused) {
        }
    }
}
