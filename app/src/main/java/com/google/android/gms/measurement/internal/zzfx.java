package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfx implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfx(zzfz zzfzVar) {
        this.zza = zzfzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzew zzc;
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzc = this.zza.zzs.zzaz().zzc();
        } else if (i11 != 1) {
            if (i11 == 3) {
                zzc = this.zza.zzs.zzaz().zzj();
            } else if (i11 != 4) {
                zzc = this.zza.zzs.zzaz().zzi();
            } else if (z10) {
                zzc = this.zza.zzs.zzaz().zzm();
            } else if (!z11) {
                zzc = this.zza.zzs.zzaz().zzl();
            } else {
                zzc = this.zza.zzs.zzaz().zzk();
            }
        } else if (z10) {
            zzc = this.zza.zzs.zzaz().zzh();
        } else if (!z11) {
            zzc = this.zza.zzs.zzaz().zze();
        } else {
            zzc = this.zza.zzs.zzaz().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzc.zza(str);
        } else {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
