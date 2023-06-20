package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcw {
    private static zzfcw zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcj zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    zzfcw(Context context, com.google.android.gms.ads.internal.client.zzcj zzcjVar) {
        this.zzb = context;
        this.zzc = zzcjVar;
    }

    @VisibleForTesting
    static com.google.android.gms.ads.internal.client.zzcj zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzcfi.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfcw zzd(Context context) {
        synchronized (zzfcw.class) {
            zzfcw zzfcwVar = zza;
            if (zzfcwVar != null) {
                return zzfcwVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbjr.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = null;
            if (longValue > 0 && longValue <= 221908400) {
                zzcjVar = zza(applicationContext);
            }
            zzfcw zzfcwVar2 = new zzfcw(applicationContext, zzcjVar);
            zza = zzfcwVar2;
            return zzfcwVar2;
        }
    }

    public final zzbua zzb() {
        return (zzbua) this.zzd.get();
    }

    public final zzcfo zzc(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzcfo zzcfoVar = new zzcfo(221908000, i11, true, zzA);
        if (((Boolean) zzbjr.zzc.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
            com.google.android.gms.ads.internal.client.zzeh zzehVar = null;
            if (zzcjVar != null) {
                try {
                    zzehVar = zzcjVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            return zzehVar == null ? zzcfoVar : new zzcfo(221908000, zzehVar.zza(), true, zzA);
        }
        return zzcfoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzbua r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjr.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L23
            com.google.android.gms.ads.internal.client.zzcj r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbua r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            com.google.android.gms.internal.ads.zzfcv.zza(r2, r1, r4)
            return
        L23:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfcv.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcw.zze(com.google.android.gms.internal.ads.zzbua):void");
    }
}
