package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzc extends zzb {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            zzcfi.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        zzcfh.zzj(z10);
        zzcfi.zzj("Update ad debug logging enablement as " + z10);
    }
}
