package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfpt implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfpu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpt(zzfpu zzfpuVar, Iterator it) {
        this.zzc = zzfpuVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfou.zzi(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfqe.zzg(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}
