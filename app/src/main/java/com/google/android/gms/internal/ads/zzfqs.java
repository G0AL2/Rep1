package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfqs extends AbstractCollection {
    final /* synthetic */ zzfqt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqs(zzfqt zzfqtVar) {
        this.zza = zzfqtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfqt zzfqtVar = this.zza;
        Map zzl = zzfqtVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfqn(zzfqtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
