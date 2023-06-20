package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfa  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfa implements zzbc {
    private static final String zza = "zzfa";
    private KeyStore zzb;

    public zzfa() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                this.zzb = keyStore;
                return;
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
        throw new IllegalStateException("need Android Keystore on Android M or newer");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbc
    public final synchronized zzan zza(String str) throws GeneralSecurityException {
        zzez zzezVar;
        zzezVar = new zzez(zzna.zza("android-keystore://", str), this.zzb);
        byte[] zza2 = zzmy.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzezVar.zza(zzezVar.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzezVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbc
    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzc(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(zza, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzb = keyStore;
                keyStore.load(null);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            } catch (InterruptedException unused2) {
            }
            return this.zzb.containsAlias(str2);
        }
        return this.zzb.containsAlias(zzna.zza("android-keystore://", str));
    }
}
