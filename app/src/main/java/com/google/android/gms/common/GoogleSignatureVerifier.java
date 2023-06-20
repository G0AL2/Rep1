package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzm.zzd(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    static final zzi zza(PackageInfo packageInfo, zzi... zziVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzj zzjVar = new zzj(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < zziVarArr.length; i10++) {
            if (zziVarArr[i10].equals(zzjVar)) {
                return zziVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean zzb(PackageInfo packageInfo, boolean z10) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? zza(packageInfo, zzl.zza) : zza(packageInfo, zzl.zza[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzw zzc(String str, boolean z10, boolean z11) {
        zzw zzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzw.zzc("null pkg");
        }
        if (!str.equals(this.zzc)) {
            if (zzm.zze()) {
                zzc = zzm.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                    if (packageInfo == null) {
                        zzc = zzw.zzc("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            zzj zzjVar = new zzj(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzw zza2 = zzm.zza(str2, zzjVar, honorsDebugCertificates, false);
                            zzc = (!zza2.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzm.zza(str2, zzjVar, false, true).zza) ? zza2 : zzw.zzc("debuggable release cert app rejected");
                        } else {
                            zzc = zzw.zzc("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    return zzw.zzd(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e10);
                }
            }
            if (zzc.zza) {
                this.zzc = str;
            }
            return zzc;
        }
        return zzw.zzb();
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzw zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i10) {
        zzw zzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    zzc = zzc(packagesForUid[i11], false, false);
                    if (zzc.zza) {
                        break;
                    }
                    i11++;
                } else {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
            }
        } else {
            zzc = zzw.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
