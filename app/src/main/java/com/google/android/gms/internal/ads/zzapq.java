package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapq extends zzaqn {
    public zzapq(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", zzaliVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzl(-1L);
        this.zze.zzk(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzl(iArr[0]);
            this.zze.zzk(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.zze.zzj(i10);
            }
        }
    }
}
