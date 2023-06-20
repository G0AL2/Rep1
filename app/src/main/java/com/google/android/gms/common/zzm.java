package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzm {
    private static volatile zzaf zze;
    private static Context zzg;
    static final zzk zza = new zze(zzi.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzk zzb = new zzf(zzi.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzk zzc = new zzg(zzi.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzk zzd = new zzh(zzi.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    public static zzw zza(String str, zzi zziVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zziVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public static zzw zzb(String str, boolean z10, boolean z11, boolean z12) {
        zzw zzd2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzg();
                try {
                    zzq zze2 = zze.zze(new zzn(str, z10, false, ObjectWrapper.wrap(zzg), false));
                    if (zze2.zzb()) {
                        zzd2 = zzw.zzb();
                    } else {
                        String zza2 = zze2.zza();
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = zze2.zzc() == 4 ? zzw.zzd(zza2, new PackageManager.NameNotFoundException()) : zzw.zzc(zza2);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    zzd2 = zzw.zzd("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                String valueOf = String.valueOf(e11.getMessage());
                zzd2 = zzw.zzd(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
            }
            return zzd2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static /* synthetic */ String zzc(boolean z10, String str, zzi zziVar) throws Exception {
        String str2 = true != (!z10 && zzf(str, zziVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest zza2 = AndroidUtilsLight.zza("SHA-1");
        Preconditions.checkNotNull(zza2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(zza2.digest(zziVar.zzf())), Boolean.valueOf(z10), "12451000.false");
    }

    public static synchronized void zzd(Context context) {
        synchronized (zzm.class) {
            if (zzg != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                zzg = context.getApplicationContext();
            }
        }
    }

    public static boolean zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzg();
                return zze.zzg();
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static zzw zzf(final String str, final zzi zziVar, final boolean z10, boolean z11) {
        try {
            zzg();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzf(new zzs(str, zziVar, z10, z11), ObjectWrapper.wrap(zzg.getPackageManager())) ? zzw.zzb() : new zzv(new Callable() { // from class: com.google.android.gms.common.zzd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzm.zzc(z10, str, zziVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return zzw.zzd("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            String valueOf = String.valueOf(e11.getMessage());
            return zzw.zzd(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
        }
    }

    private static void zzg() throws DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = zzae.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
