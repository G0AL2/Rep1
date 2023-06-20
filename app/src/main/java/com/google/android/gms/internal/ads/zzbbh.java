package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbh {
    private final Object zza = new Object();
    private zzbbf zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzbbf zzbbfVar = this.zzb;
            if (zzbbfVar != null) {
                return zzbbfVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzbbf zzbbfVar = this.zzb;
            if (zzbbfVar != null) {
                return zzbbfVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzbbg zzbbgVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbbf();
            }
            this.zzb.zzf(zzbbgVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzcfi.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzbbf();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzbbg zzbbgVar) {
        synchronized (this.zza) {
            zzbbf zzbbfVar = this.zzb;
            if (zzbbfVar == null) {
                return;
            }
            zzbbfVar.zzh(zzbbgVar);
        }
    }
}
