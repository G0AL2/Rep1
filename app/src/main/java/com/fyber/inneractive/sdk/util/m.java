package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a f20308a;

    public m(com.fyber.inneractive.sdk.cache.a aVar) {
        this.f20308a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (l.f20301a == null || (aVar = this.f20308a) == null) {
                return;
            }
            l.f20301a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
