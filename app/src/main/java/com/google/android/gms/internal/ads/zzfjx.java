package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjx {
    private final zzfjf zza;
    private final ArrayList zzb;

    public zzfjx(zzfjf zzfjfVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfjfVar;
        arrayList.add(str);
    }

    public final zzfjf zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
