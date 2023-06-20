package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccs {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcdn zzd;

    private zzccs() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzccs(zzccr zzccrVar) {
    }

    public final zzccs zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzccs zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzccs zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzccs zzd(zzcdn zzcdnVar) {
        this.zzd = zzcdnVar;
        return this;
    }

    public final zzcdo zze() {
        zzgrc.zzc(this.zza, Context.class);
        zzgrc.zzc(this.zzb, Clock.class);
        zzgrc.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgrc.zzc(this.zzd, zzcdn.class);
        return new zzccu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
