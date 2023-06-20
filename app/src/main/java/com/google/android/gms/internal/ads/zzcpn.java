package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcpn implements zzexx {
    private final zzcop zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpn(zzcop zzcopVar, zzcpm zzcpmVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexx
    public final /* synthetic */ zzexx zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexx
    public final /* synthetic */ zzexx zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexx
    public final /* synthetic */ zzexx zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexx
    public final zzexy zzd() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        zzgrc.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcpp(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
