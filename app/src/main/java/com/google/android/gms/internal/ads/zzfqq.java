package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfqq extends AbstractSet {
    final /* synthetic */ zzfqt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqq(zzfqt zzfqtVar) {
        this.zza = zzfqtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfqt zzfqtVar = this.zza;
        Map zzl = zzfqtVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfql(zzfqtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzx;
        Object obj2;
        Map zzl = this.zza.zzl();
        if (zzl == null) {
            zzx = this.zza.zzx(obj);
            obj2 = zzfqt.zzd;
            return zzx != obj2;
        }
        return zzl.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
