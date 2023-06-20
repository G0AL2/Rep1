package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqb implements zzdxp {
    private final zzcop zza;
    private Context zzb;
    private zzbph zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqb(zzcop zzcopVar, zzcqa zzcqaVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxp
    public final /* synthetic */ zzdxp zza(zzbph zzbphVar) {
        Objects.requireNonNull(zzbphVar);
        this.zzc = zzbphVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxp
    public final /* synthetic */ zzdxp zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxp
    public final zzdxq zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, zzbph.class);
        return new zzcqd(this.zza, this.zzb, this.zzc, null);
    }
}
