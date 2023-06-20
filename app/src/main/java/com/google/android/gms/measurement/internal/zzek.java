package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzek {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzeh zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzek(String str, Object obj, Object obj2, zzeh zzehVar, zzej zzejVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzehVar;
    }

    public final Object zza(Object obj) {
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzei.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzaa.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzek zzekVar : zzel.zzb()) {
                    if (!zzaa.zza()) {
                        Object obj2 = null;
                        try {
                            zzeh zzehVar = zzekVar.zzc;
                            if (zzehVar != null) {
                                obj2 = zzehVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzekVar.zzh = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzeh zzehVar2 = this.zzc;
            if (zzehVar2 == null) {
                return this.zzd;
            }
            try {
                return zzehVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
