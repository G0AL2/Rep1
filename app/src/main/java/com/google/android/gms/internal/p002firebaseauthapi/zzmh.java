package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmh {
    public static final zzmh zza;
    public static final zzmh zzb;
    public static final zzmh zzc;
    public static final zzmh zzd;
    public static final zzmh zze;
    public static final zzmh zzf;
    public static final zzmh zzg;
    private static final Logger zzh = Logger.getLogger(zzmh.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzmp zzk;

    static {
        if (zzdm.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            zzj = false;
        } else if (zzmz.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzmh(new zzmi());
        zzb = new zzmh(new zzmm());
        zzc = new zzmh(new zzmo());
        zzd = new zzmh(new zzmn());
        zze = new zzmh(new zzmj());
        zzf = new zzmh(new zzml());
        zzg = new zzmh(new zzmk());
    }

    public zzmh(zzmp zzmpVar) {
        this.zzk = zzmpVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzi) {
            try {
                return this.zzk.zza(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
