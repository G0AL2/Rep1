package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
class zzfrc extends zzfrd {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrc(int i10) {
        this.zza = new Object[i10];
    }

    private final void zze(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            this.zza = Arrays.copyOf(objArr, zzfrd.zzd(length, i10));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfrc zza(Object obj) {
        Objects.requireNonNull(obj);
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public /* bridge */ /* synthetic */ zzfrd zzb(Object obj) {
        throw null;
    }

    public final zzfrd zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zze(this.zzb + collection.size());
            if (collection instanceof zzfre) {
                this.zzb = ((zzfre) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }
}
