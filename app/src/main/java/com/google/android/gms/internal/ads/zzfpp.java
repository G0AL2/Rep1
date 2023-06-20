package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfpp extends zzfsa {
    final /* synthetic */ zzfpr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpp(zzfpr zzfprVar) {
        this.zza = zzfprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfqk.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfpq(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzfqe.zzq(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    final Map zza() {
        return this.zza;
    }
}
