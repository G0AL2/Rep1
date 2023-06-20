package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfq {
    final zzgi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfq(zzli zzliVar) {
        this.zza = zzliVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzav());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzaz().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.zza.zzaz().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
