package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcql implements zzezq {
    private final zzcop zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcql(zzcop zzcopVar, zzcqk zzcqkVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezq
    public final /* synthetic */ zzezq zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezq
    public final /* synthetic */ zzezq zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezq
    public final /* synthetic */ zzezq zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezq
    public final zzezr zzd() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        zzgrc.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
