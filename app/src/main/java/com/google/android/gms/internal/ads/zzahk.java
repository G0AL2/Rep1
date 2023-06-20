package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahk {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzahk(int i10, String str, List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
