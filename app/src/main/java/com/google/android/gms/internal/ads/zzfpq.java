package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfpq implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfpr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpq(zzfpr zzfprVar) {
        this.zzc = zzfprVar;
        this.zza = zzfprVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfou.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfqe.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
