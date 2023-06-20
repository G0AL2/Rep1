package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzajp;
import com.google.android.gms.internal.ads.zzajq;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzcfb;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzax extends zzajq {
    private final Context zzc;

    private zzax(Context context, zzajp zzajpVar) {
        super(zzajpVar);
        this.zzc = context;
    }

    public static zzaje zzb(Context context) {
        zzaje zzajeVar = new zzaje(new zzajx(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzakc(null, null)), 4);
        zzajeVar.zzd();
        return zzajeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaiu
    public final zzaix zza(zzajb zzajbVar) throws zzajk {
        if (zzajbVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdy), zzajbVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                if (zzcfb.zzr(this.zzc, 13400000)) {
                    zzaix zza = new zzbqf(this.zzc).zza(zzajbVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzajbVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzajbVar.zzk())));
                }
            }
        }
        return super.zza(zzajbVar);
    }
}
