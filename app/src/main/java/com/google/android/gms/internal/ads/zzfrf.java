package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfrf extends zzfqf implements Serializable {
    final Object zza;
    final Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrf(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
