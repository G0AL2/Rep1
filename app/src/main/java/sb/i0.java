package sb;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzao;
import com.google.android.gms.internal.p002firebaseauthapi.zzas;
import com.google.android.gms.internal.p002firebaseauthapi.zzbb;
import com.google.android.gms.internal.p002firebaseauthapi.zzdy;
import com.google.android.gms.internal.p002firebaseauthapi.zzed;
import com.google.android.gms.internal.p002firebaseauthapi.zzew;
import com.google.android.gms.internal.p002firebaseauthapi.zzey;
import com.google.android.gms.internal.p002firebaseauthapi.zzs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: c  reason: collision with root package name */
    private static i0 f36928c;

    /* renamed from: a  reason: collision with root package name */
    private final String f36929a;

    /* renamed from: b  reason: collision with root package name */
    private final zzey f36930b;

    private i0(Context context, String str, boolean z10) {
        zzey zzeyVar;
        this.f36929a = str;
        try {
            zzdy.zza();
            zzew zzewVar = new zzew();
            zzewVar.zzf(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            zzewVar.zzd(zzed.zza);
            zzewVar.zze(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzeyVar = zzewVar.zzg();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            zzeyVar = null;
        }
        this.f36930b = zzeyVar;
    }

    public static i0 a(Context context, String str) {
        i0 i0Var = f36928c;
        if (i0Var == null || !zzs.zza(i0Var.f36929a, str)) {
            f36928c = new i0(context, str, true);
        }
        return f36928c;
    }

    public final String b(String str) {
        String str2;
        zzey zzeyVar = this.f36930b;
        if (zzeyVar != null) {
            try {
                synchronized (zzeyVar) {
                    str2 = new String(((zzas) this.f36930b.zza().zze(zzas.class)).zza(Base64.decode(str, 8), null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
                return null;
            }
        }
        Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
        return null;
    }

    public final String c() {
        if (this.f36930b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbb zza = zzao.zza(byteArrayOutputStream);
        try {
            synchronized (this.f36930b) {
                this.f36930b.zza().zzb().zzg(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
