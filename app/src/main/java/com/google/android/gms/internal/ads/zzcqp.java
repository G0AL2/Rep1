package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqp implements zzfbe {
    private final zzcop zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqp(zzcop zzcopVar, zzcqo zzcqoVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final /* synthetic */ zzfbe zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final /* synthetic */ zzfbe zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final zzfbf zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        return new zzcqr(this.zza, this.zzb, this.zzc, null);
    }
}
