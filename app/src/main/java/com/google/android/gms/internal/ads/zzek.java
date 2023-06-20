package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzek implements zzeq {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzev zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzek(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        if (this.zzb.contains(zzfsVar)) {
            return;
        }
        this.zzb.add(zzfsVar);
        this.zzc++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzev zzevVar = this.zzd;
        int i11 = zzeg.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzfs) this.zzb.get(i12)).zza(this, zzevVar, this.zza, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh() {
        zzev zzevVar = this.zzd;
        int i10 = zzeg.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzfs) this.zzb.get(i11)).zzb(this, zzevVar, this.zza);
        }
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzev zzevVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzfs) this.zzb.get(i10)).zzc(this, zzevVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzev zzevVar) {
        this.zzd = zzevVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzfs) this.zzb.get(i10)).zzd(this, zzevVar, this.zza);
        }
    }
}
