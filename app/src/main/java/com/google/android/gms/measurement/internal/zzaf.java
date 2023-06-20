package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzaf extends zzhb {
    private Boolean zza;
    private zzae zzb;
    private Boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzb = new zzae() { // from class: com.google.android.gms.measurement.internal.zzad
            @Override // com.google.android.gms.measurement.internal.zzae
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzel.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzs.zzaz().zzd().zzb("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.zzs.zzaz().zzd().zzb("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.zzs.zzaz().zzd().zzb("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.zzs.zzaz().zzd().zzb("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzel.zzc.zza(null)).longValue();
    }

    public final double zza(String str, zzek zzekVar) {
        if (str == null) {
            return ((Double) zzekVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzekVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzekVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzekVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzekVar.zza(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(String str) {
        return zzf(str, zzel.zzG, 500, 2000);
    }

    public final int zzc() {
        zzlp zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() < 201500) {
            return (zzj == null || zzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzel.zzH, 25, 100);
    }

    public final int zze(String str, zzek zzekVar) {
        if (str == null) {
            return ((Integer) zzekVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzekVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzekVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzekVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzekVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzek zzekVar, int i10, int i11) {
        return Math.max(Math.min(zze(str, zzekVar), i11), i10);
    }

    public final long zzh() {
        this.zzs.zzax();
        return 61000L;
    }

    public final long zzi(String str, zzek zzekVar) {
        if (str == null) {
            return ((Long) zzekVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzekVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzekVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzekVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzekVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    final Bundle zzj() {
        try {
            if (this.zzs.zzav().getPackageManager() == null) {
                this.zzs.zzaz().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzav()).getApplicationInfo(this.zzs.zzav().getPackageName(), 128);
            if (applicationInfo == null) {
                this.zzs.zzaz().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzaz().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            this.zzs.zzaz().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzn() {
        this.zzs.zzax();
        return "FA";
    }

    public final String zzo(String str, zzek zzekVar) {
        if (str == null) {
            return (String) zzekVar.zza(null);
        }
        return (String) zzekVar.zza(this.zzb.zza(str, zzekVar.zzb()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzd()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzav()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaf.zzp(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzq(zzae zzaeVar) {
        this.zzb = zzaeVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzs(String str, zzek zzekVar) {
        if (str == null) {
            return ((Boolean) zzekVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzekVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Boolean) zzekVar.zza(null)).booleanValue();
        }
        return ((Boolean) zzekVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzax();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzav().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(myProcessName)) {
                            z10 = true;
                        }
                        this.zzc = Boolean.valueOf(z10);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzs.zzaz().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
