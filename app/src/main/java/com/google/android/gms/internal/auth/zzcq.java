package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzcq {
    private static final a<String, Uri> zza = new a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzcq.class) {
            a<String, Uri> aVar = zza;
            uri = aVar.get("com.google.android.gms.auth_account");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
