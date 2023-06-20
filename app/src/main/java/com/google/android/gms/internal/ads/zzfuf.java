package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfuf extends zzfue {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfue
    public final int zza(zzfuh zzfuhVar) {
        return this.zzb.decrementAndGet(zzfuhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfue
    public final void zzb(zzfuh zzfuhVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzfuhVar, null, set2) && atomicReferenceFieldUpdater.get(zzfuhVar) == null) {
        }
    }
}
