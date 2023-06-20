package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrn extends zzfrc {
    Object[] zzd;
    private int zze;

    public zzfrn() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, com.google.android.gms.internal.ads.zzfrd
    public final /* bridge */ /* synthetic */ zzfrd zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfrn zze(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfro.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int i10 = length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfrb.zza(hashCode);
                while (true) {
                    int i11 = zza & i10;
                    Object[] objArr = this.zzd;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        objArr[i11] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i11 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfrn zzf(Iterable iterable) {
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zze(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfro zzg() {
        zzfro zzp;
        boolean zzq;
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.zzd == null || zzfro.zzh(i10) != this.zzd.length) {
                    zzp = zzfro.zzp(this.zzb, this.zza);
                    this.zzb = zzp.size();
                } else {
                    int i11 = this.zzb;
                    Object[] objArr = this.zza;
                    zzq = zzfro.zzq(i11, objArr.length);
                    if (zzq) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    int i12 = this.zze;
                    Object[] objArr2 = this.zzd;
                    zzp = new zzfsy(objArr, i12, objArr2, objArr2.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzp;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzftf(obj);
        }
        return zzfsy.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrn(int i10) {
        super(i10);
        this.zzd = new Object[zzfro.zzh(i10)];
    }
}
