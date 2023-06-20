package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghs {
    public static final zzghs zza;
    public static final zzghs zzb;
    public static final zzghs zzc;
    public static final zzghs zzd;
    public static final zzghs zze;
    public static final zzghs zzf;
    public static final zzghs zzg;
    private static final Logger zzh = Logger.getLogger(zzghs.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzgia zzk;

    static {
        if (zzfzf.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            zzj = false;
        } else if (zzgil.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzghs(new zzght());
        zzb = new zzghs(new zzghx());
        zzc = new zzghs(new zzghz());
        zzd = new zzghs(new zzghy());
        zze = new zzghs(new zzghu());
        zzf = new zzghs(new zzghw());
        zzg = new zzghs(new zzghv());
    }

    public zzghs(zzgia zzgiaVar) {
        this.zzk = zzgiaVar;
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
