package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzdkd {
    private final zzdlg zza;
    private final zzcli zzb;

    public zzdkd(zzdlg zzdlgVar, zzcli zzcliVar) {
        this.zza = zzdlgVar;
        this.zzb = zzcliVar;
    }

    public static final zzdiz zzh(zzfhe zzfheVar) {
        return new zzdiz(zzfheVar, zzcfv.zzf);
    }

    public static final zzdiz zzi(zzdll zzdllVar) {
        return new zzdiz(zzdllVar, zzcfv.zzf);
    }

    public final View zza() {
        zzcli zzcliVar = this.zzb;
        if (zzcliVar == null) {
            return null;
        }
        return zzcliVar.zzI();
    }

    public final View zzb() {
        zzcli zzcliVar = this.zzb;
        if (zzcliVar != null) {
            return zzcliVar.zzI();
        }
        return null;
    }

    public final zzcli zzc() {
        return this.zzb;
    }

    public final zzdiz zzd(Executor executor) {
        final zzcli zzcliVar = this.zzb;
        return new zzdiz(new zzdgf() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzdgf
            public final void zza() {
                zzcli zzcliVar2 = zzcli.this;
                if (zzcliVar2.zzN() != null) {
                    zzcliVar2.zzN().zzb();
                }
            }
        }, executor);
    }

    public final zzdlg zze() {
        return this.zza;
    }

    public Set zzf(zzdat zzdatVar) {
        return Collections.singleton(new zzdiz(zzdatVar, zzcfv.zzf));
    }

    public Set zzg(zzdat zzdatVar) {
        return Collections.singleton(new zzdiz(zzdatVar, zzcfv.zzf));
    }
}
