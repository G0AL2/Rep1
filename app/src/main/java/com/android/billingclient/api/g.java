package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
final class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6059a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o2.g f6060b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f6061c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar, String str, o2.g gVar) {
        this.f6061c = bVar;
        this.f6059a = str;
        this.f6060b = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        Purchase.a z10 = b.z(this.f6061c, this.f6059a);
        if (z10.b() != null) {
            this.f6060b.a(z10.a(), z10.b());
            return null;
        }
        this.f6060b.a(z10.a(), zzu.zzh());
        return null;
    }
}
