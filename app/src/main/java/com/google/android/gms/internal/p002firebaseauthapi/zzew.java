package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzew */
/* loaded from: classes2.dex */
public final class zzew {
    private zzba zze;
    private zzfb zzf = null;
    private zzbb zza = null;
    private String zzb = null;
    private zzan zzc = null;
    private zzax zzd = null;

    private final zzan zzh() throws GeneralSecurityException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 23) {
            zzfa zzfaVar = new zzfa();
            boolean zzc = zzfaVar.zzc(this.zzb);
            if (!zzc) {
                try {
                    String str4 = this.zzb;
                    if (!new zzfa().zzc(str4)) {
                        String zza = zzna.zza("android-keystore://", str4);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(new KeyGenParameterSpec.Builder(zza, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
                        keyGenerator.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str4));
                    }
                } catch (GeneralSecurityException | ProviderException e10) {
                    str2 = zzey.zzb;
                    Log.w(str2, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            }
            try {
                return zzfaVar.zza(this.zzb);
            } catch (GeneralSecurityException | ProviderException e11) {
                if (!zzc) {
                    str3 = zzey.zzb;
                    Log.w(str3, "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.zzb), e11);
            }
        }
        str = zzey.zzb;
        Log.w(str, "Android Keystore requires at least Android M");
        return null;
    }

    private final zzba zzi() throws GeneralSecurityException, IOException {
        String str;
        zzan zzanVar = this.zzc;
        if (zzanVar != null) {
            try {
                return zzba.zzf(zzaz.zzh(this.zzf, zzanVar));
            } catch (zzzt | GeneralSecurityException e10) {
                str = zzey.zzb;
                Log.w(str, "cannot decrypt keyset: ", e10);
            }
        }
        return zzba.zzf(zzap.zzb(this.zzf));
    }

    @Deprecated
    public final zzew zzd(zzke zzkeVar) {
        String zze = zzkeVar.zze();
        byte[] zzt = zzkeVar.zzd().zzt();
        int zzh = zzkeVar.zzh();
        int i10 = zzey.zza;
        int i11 = zzh - 2;
        int i12 = 4;
        if (i11 == 1) {
            i12 = 1;
        } else if (i11 == 2) {
            i12 = 2;
        } else if (i11 == 3) {
            i12 = 3;
        } else if (i11 != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.zzd = zzax.zze(zze, zzt, i12);
        return this;
    }

    public final zzew zze(String str) {
        if (str.startsWith("android-keystore://")) {
            this.zzb = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final zzew zzf(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.zzf = new zzfb(context, "GenericIdpKeyset", str2);
            this.zza = new zzfc(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized zzey zzg() throws GeneralSecurityException, IOException {
        String str;
        zzba zze;
        String str2;
        if (this.zzb != null) {
            this.zzc = zzh();
        }
        try {
            zze = zzi();
        } catch (FileNotFoundException e10) {
            str = zzey.zzb;
            if (Log.isLoggable(str, 4)) {
                str2 = zzey.zzb;
                Log.i(str2, String.format("keyset not found, will generate a new one. %s", e10.getMessage()));
            }
            if (this.zzd != null) {
                zze = zzba.zze();
                zze.zzc(this.zzd);
                zze.zzd(zze.zzb().zzd().zzb(0).zza());
                if (this.zzc != null) {
                    zze.zzb().zzf(this.zza, this.zzc);
                } else {
                    zzap.zza(zze.zzb(), this.zza);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.zze = zze;
        return new zzey(this, null);
    }
}
