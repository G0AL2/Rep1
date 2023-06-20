package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtt {
    private static zzbtt zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbtt() {
    }

    public static zzbtt zza() {
        if (zza == null) {
            zza = new zzbtt();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbts
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    String str2 = str;
                    zzbhz.zzc(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaf)).booleanValue());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzam)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcnc) zzcfm.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbtr
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzcfk
                            public final Object zza(Object obj) {
                                return zzcnb.zzb(obj);
                            }
                        })).zze(ObjectWrapper.wrap(context2), new zzbtq(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | zzcfl | NullPointerException e10) {
                        zzcfi.zzl("#007 Could not call remote method.", e10);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
