package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeut implements zzetg {
    final zzfvm zza;
    final Context zzb;
    final zzbdb zzc;

    public zzeut(zzbdb zzbdbVar, zzfvm zzfvmVar, Context context, byte[] bArr) {
        this.zzc = zzbdbVar;
        this.zza = zzfvmVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeuu(new JSONObject());
            }
        });
    }
}
