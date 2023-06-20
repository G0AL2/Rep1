package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzceh implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcga zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzceh(zzcei zzceiVar, Context context, zzcga zzcgaVar) {
        this.zza = context;
        this.zzb = zzcgaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zze(e10);
            zzcfi.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
