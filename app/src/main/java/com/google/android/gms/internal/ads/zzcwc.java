package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcwc {
    private final zzcxv zza;
    private final View zzb;
    private final zzfbm zzc;
    private final zzcli zzd;

    public zzcwc(View view, zzcli zzcliVar, zzcxv zzcxvVar, zzfbm zzfbmVar) {
        this.zzb = view;
        this.zzd = zzcliVar;
        this.zza = zzcxvVar;
        this.zzc = zzfbmVar;
    }

    public static final zzdiz zzf(final Context context, final zzcfo zzcfoVar, final zzfbl zzfblVar, final zzfcd zzfcdVar) {
        return new zzdiz(new zzddh() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // com.google.android.gms.internal.ads.zzddh
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcfoVar.zza, zzfblVar.zzD.toString(), zzfcdVar.zzf);
            }
        }, zzcfv.zzf);
    }

    public static final Set zzg(zzcxm zzcxmVar) {
        return Collections.singleton(new zzdiz(zzcxmVar, zzcfv.zzf));
    }

    public static final zzdiz zzh(zzcxk zzcxkVar) {
        return new zzdiz(zzcxkVar, zzcfv.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcli zzb() {
        return this.zzd;
    }

    public final zzcxv zzc() {
        return this.zza;
    }

    public zzddf zzd(Set set) {
        return new zzddf(set);
    }

    public final zzfbm zze() {
        return this.zzc;
    }
}
