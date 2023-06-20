package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import ob.e;
import sb.g;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztk  reason: invalid package */
/* loaded from: classes2.dex */
public final class zztk extends AsyncTask {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final e zzg;

    public zztk(String str, String str2, Intent intent, e eVar, zztm zztmVar) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (e) Preconditions.checkNotNull(eVar);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String checkNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zztmVar.zzc(checkNotEmpty)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", checkNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference(zztmVar);
        this.zze = zztmVar.zzb(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(zztj zztjVar) {
        String str;
        Uri.Builder builder;
        zztm zztmVar = (zztm) this.zzd.get();
        String str2 = null;
        if (zztjVar != null) {
            str2 = zztjVar.zzc();
            str = zztjVar.zzd();
        } else {
            str = null;
        }
        if (zztmVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str2) && (builder = this.zze) != null) {
            builder.authority(str2);
            zztmVar.zzf(this.zze.build(), this.zzb);
        } else {
            zztmVar.zze(this.zzb, g.a(str));
        }
    }

    private static byte[] zzb(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[Catch: zzrm -> 0x00fa, NullPointerException -> 0x0111, IOException -> 0x0128, TryCatch #1 {IOException -> 0x0128, blocks: (B:6:0x0014, B:19:0x009d, B:20:0x00bc, B:21:0x00d9, B:23:0x00df, B:25:0x00ed, B:27:0x00f5, B:18:0x008b), top: B:38:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0088 -> B:19:0x009d). Please submit an issue!!! */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zztk.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(Object obj) {
        zztj zztjVar = (zztj) obj;
        onPostExecute(null);
    }
}
