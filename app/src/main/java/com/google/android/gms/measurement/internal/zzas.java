package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzas implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzat zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzat zzatVar) {
        Bundle bundle;
        this.zzb = zzatVar;
        bundle = zzatVar.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final String next() {
        return (String) this.zza.next();
    }
}
