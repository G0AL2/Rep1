package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxz implements zzcya {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxz(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final zzefd zza(int i10, String str) {
        return (zzefd) this.zza.get(str);
    }
}
