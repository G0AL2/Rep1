package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
class zzaa<E> extends zzab<E> {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(int i10) {
    }

    private final void zzb(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        if (i11 < 0) {
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i11);
        this.zzc = false;
    }

    public final zzaa<E> zza(E e10) {
        Objects.requireNonNull(e10);
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = e10;
        return this;
    }
}
