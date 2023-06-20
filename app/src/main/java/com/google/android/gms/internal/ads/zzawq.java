package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawq implements Runnable {
    final /* synthetic */ zzawt zza;
    final /* synthetic */ zzawv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawq(zzawv zzawvVar, zzawt zzawtVar) {
        this.zzb = zzawvVar;
        this.zza = zzawtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zza.zza();
        sparseArray = this.zzb.zzn;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray2 = this.zzb.zzn;
            ((zzaxk) sparseArray2.valueAt(i10)).zzi();
        }
    }
}
