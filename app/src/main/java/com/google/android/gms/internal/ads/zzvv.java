package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzvo[] zzd = new zzvo[100];

    public zzvv(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * Constants.MIN_PROGRESS_STEP;
    }

    public final synchronized zzvo zzb() {
        zzvo zzvoVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzvo[] zzvoVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzvoVar = zzvoVarArr[i11];
            Objects.requireNonNull(zzvoVar);
            zzvoVarArr[i11] = null;
        } else {
            zzvoVar = new zzvo(new byte[Constants.MIN_PROGRESS_STEP], 0);
            int i12 = this.zzb;
            zzvo[] zzvoVarArr2 = this.zzd;
            int length = zzvoVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzvo[]) Arrays.copyOf(zzvoVarArr2, length + length);
                return zzvoVar;
            }
        }
        return zzvoVar;
    }

    public final synchronized void zzc(zzvo zzvoVar) {
        zzvo[] zzvoVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzvoVarArr[i10] = zzvoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzvp zzvpVar) {
        while (zzvpVar != null) {
            zzvo[] zzvoVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzvoVarArr[i10] = zzvpVar.zzc();
            this.zzb--;
            zzvpVar = zzvpVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzeg.zze(this.zza, Constants.MIN_PROGRESS_STEP) - this.zzb);
        int i10 = this.zzc;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.zzd, max, i10, (Object) null);
        this.zzc = max;
    }
}
