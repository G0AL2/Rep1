package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zzll;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zza extends zzd {
    private final zzgi zza;
    private final zzin zzb;

    public zza(zzgi zzgiVar) {
        super(null);
        Preconditions.checkNotNull(zzgiVar);
        this.zza = zzgiVar;
        this.zzb = zzgiVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final Object zzg(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return this.zzb.zzi();
                    }
                    return this.zzb.zzl();
                }
                return this.zzb.zzj();
            }
            return this.zzb.zzm();
        }
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzll> zzt = this.zzb.zzt(z10);
        a aVar = new a(zzt.size());
        for (zzll zzllVar : zzt) {
            Object zza = zzllVar.zza();
            if (zza != null) {
                aVar.put(zzllVar.zzb, zza);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzp(String str) {
        this.zza.zzd().zzd(str, this.zza.zzaw().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzr(String str) {
        this.zza.zzd().zze(str, this.zza.zzaw().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzE(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zzF(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzu(zzhj zzhjVar) {
        this.zzb.zzK(zzhjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzv(Bundle bundle) {
        this.zzb.zzQ(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzw(zzhi zzhiVar) {
        this.zzb.zzV(zzhiVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    public final void zzx(zzhj zzhjVar) {
        this.zzb.zzab(zzhjVar);
    }
}
