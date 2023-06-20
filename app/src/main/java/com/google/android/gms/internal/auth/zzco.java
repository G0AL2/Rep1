package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzco {
    private final Map<String, Map<String, String>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            Map<String, String> map = this.zza.get(uri.toString());
            if (map == null) {
                return null;
            }
            String valueOf = String.valueOf(str3);
            return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
        }
        return null;
    }
}
