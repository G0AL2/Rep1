package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhm implements zzhj {
    private static zzhm zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhm() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhm(Context context) {
        this.zzb = context;
        zzhl zzhlVar = new zzhl(this, null);
        this.zzc = zzhlVar;
        context.getContentResolver().registerContentObserver(zzgz.zza, true, zzhlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhm zza(Context context) {
        zzhm zzhmVar;
        zzhm zzhmVar2;
        synchronized (zzhm.class) {
            if (zza == null) {
                if (c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    zzhmVar2 = new zzhm(context);
                } else {
                    zzhmVar2 = new zzhm();
                }
                zza = zzhmVar2;
            }
            zzhmVar = zza;
        }
        return zzhmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zze() {
        Context context;
        synchronized (zzhm.class) {
            zzhm zzhmVar = zza;
            if (zzhmVar != null && (context = zzhmVar.zzb) != null && zzhmVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    /* renamed from: zzc */
    public final String zzb(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhk
                @Override // com.google.android.gms.internal.measurement.zzhi
                public final Object zza() {
                    return zzhm.this.zzd(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzd(String str) {
        return zzgz.zza(this.zzb.getContentResolver(), str, null);
    }
}
