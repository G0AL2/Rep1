package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcpd implements zzewj {
    private final zzcop zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpd(zzcop zzcopVar, zzcpc zzcpcVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewj
    public final /* synthetic */ zzewj zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewj
    public final /* synthetic */ zzewj zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewj
    public final zzewk zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        return new zzcpf(this.zza, this.zzb, this.zzc, null);
    }
}
