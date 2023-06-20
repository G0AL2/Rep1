package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfqr extends zzfqf {
    final /* synthetic */ zzfqt zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqr(zzfqt zzfqtVar, int i10) {
        this.zza = zzfqtVar;
        this.zzb = zzfqt.zzg(zzfqtVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzv;
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzfoq.zza(this.zzb, zzfqt.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfqt.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzfqt.zzj(this.zza, i10);
        zzfqt.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
