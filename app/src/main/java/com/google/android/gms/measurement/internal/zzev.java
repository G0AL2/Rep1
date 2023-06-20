package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzev implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzey zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzev(zzey zzeyVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeyVar;
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        zzfn zzm = this.zzf.zzs.zzm();
        if (zzm.zzx()) {
            zzey zzeyVar = this.zzf;
            c10 = zzeyVar.zza;
            if (c10 == 0) {
                if (zzeyVar.zzs.zzf().zzy()) {
                    zzey zzeyVar2 = this.zzf;
                    zzeyVar2.zzs.zzax();
                    zzeyVar2.zza = 'C';
                } else {
                    zzey zzeyVar3 = this.zzf;
                    zzeyVar3.zzs.zzax();
                    zzeyVar3.zza = 'c';
                }
            }
            zzey zzeyVar4 = this.zzf;
            j10 = zzeyVar4.zzb;
            if (j10 < 0) {
                zzeyVar4.zzs.zzf().zzh();
                zzeyVar4.zzb = 61000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzey zzeyVar5 = this.zzf;
            c11 = zzeyVar5.zza;
            j11 = zzeyVar5.zzb;
            String str = "2" + charAt + c11 + j11 + ":" + zzey.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            if (str.length() > 1024) {
                str = this.zzb.substring(0, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            }
            zzfl zzflVar = zzm.zzb;
            if (zzflVar != null) {
                zzflVar.zzb(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
