package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public final class zzt extends zzu {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzu zzuVar, int i10, int i11) {
        this.zzc = zzuVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzr
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.play_billing.zzu
    public final zzu zzf(int i10, int i11) {
        zzm.zzc(i10, i11, this.zzb);
        zzu zzuVar = this.zzc;
        int i12 = this.zza;
        return zzuVar.subList(i10 + i12, i11 + i12);
    }
}
