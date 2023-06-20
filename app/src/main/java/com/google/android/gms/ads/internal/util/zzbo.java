package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbo {
    private static zzaje zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzaje zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbhz.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdx)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzaki.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfvl zza(String str) {
        zzcga zzcgaVar = new zzcga();
        zzb.zza(new zzbn(str, null, zzcgaVar));
        return zzcgaVar;
    }

    public final zzfvl zzb(int i10, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzcfh zzcfhVar = new zzcfh(null);
        zzbi zzbiVar = new zzbi(this, i10, str, zzblVar, zzbhVar, bArr, map, zzcfhVar);
        if (zzcfh.zzl()) {
            try {
                zzcfhVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzaij e10) {
                zzcfi.zzj(e10.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
