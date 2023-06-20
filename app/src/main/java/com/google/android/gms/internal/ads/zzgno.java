package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgno implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgnp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgno(zzgnp zzgnpVar) {
        zzgli zzgliVar;
        this.zzb = zzgnpVar;
        zzgliVar = zzgnpVar.zza;
        this.zza = zzgliVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
