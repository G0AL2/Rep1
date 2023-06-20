package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcty {
    private final String zza;
    private final zzbtj zzb;
    private final Executor zzc;
    private zzcud zzd;
    private final zzbom zze = new zzctv(this);
    private final zzbom zzf = new zzctx(this);

    public zzcty(String str, zzbtj zzbtjVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbtjVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzg(zzcty zzctyVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzctyVar.zza);
    }

    public final void zzc(zzcud zzcudVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcudVar;
    }

    public final void zzd(zzcli zzcliVar) {
        zzcliVar.zzaf("/updateActiveView", this.zze);
        zzcliVar.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcli zzcliVar) {
        zzcliVar.zzaw("/updateActiveView", this.zze);
        zzcliVar.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
