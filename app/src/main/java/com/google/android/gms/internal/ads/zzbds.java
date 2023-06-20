package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbds {
    @VisibleForTesting
    zzarb zza;
    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzbds() {
        this.zzc = zzcex.zzb;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zza(zzbds zzbdsVar) {
        return zzbdsVar.zzc;
    }

    /* renamed from: zzc */
    public final void zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            try {
                this.zza = (zzarb) zzcfm.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbdo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzara.zzb(obj);
                    }
                });
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcfl | NullPointerException unused) {
                zzcfi.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbds(final Context context) {
        ExecutorService executorService = zzcex.zzb;
        this.zzc = executorService;
        zzbhz.zzc(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdn
                @Override // java.lang.Runnable
                public final void run() {
                    zzbds.this.zzb(context);
                }
            });
        } else {
            zzb(context);
        }
    }
}
