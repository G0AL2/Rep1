package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgqk implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgql zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgqk(zzgql zzgqlVar) {
        this.zzb = zzgqlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return list.get(i10);
        }
        zzgql zzgqlVar = this.zzb;
        zzgqlVar.zza.add(zzgqlVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
