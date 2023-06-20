package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeue implements zzetg {
    private final Context zza;
    private final String zzb;
    private final zzfvm zzc;

    public zzeue(zzbzx zzbzxVar, Context context, String str, zzfvm zzfvmVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeud
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeuf(new JSONObject());
            }
        });
    }
}
