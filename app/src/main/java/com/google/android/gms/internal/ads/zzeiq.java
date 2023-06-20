package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeiq {
    private final Clock zza;
    private final zzeir zzb;
    private final zzfii zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfP)).booleanValue();
    private final zzefi zzf;

    public zzeiq(Clock clock, zzeir zzeirVar, zzefi zzefiVar, zzfii zzfiiVar) {
        this.zza = clock;
        this.zzb = zzeirVar;
        this.zzf = zzefiVar;
        this.zzc = zzfiiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzeiq zzeiqVar, String str, int i10, long j10, String str2) {
        String str3 = str + "." + i10 + "." + j10;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        zzeiqVar.zzd.add(str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfvl zze(zzfbx zzfbxVar, zzfbl zzfblVar, zzfvl zzfvlVar, zzfie zzfieVar) {
        zzfbo zzfboVar = zzfbxVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfblVar.zzx;
        if (str != null) {
            zzfvc.zzr(zzfvlVar, new zzeip(this, elapsedRealtime, str, zzfblVar, zzfboVar, zzfieVar, zzfbxVar), zzcfv.zzf);
        }
        return zzfvlVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
