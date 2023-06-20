package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwg {
    private final InputStream zza;

    private zzfwg(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzfwg zzb(byte[] bArr) {
        return new zzfwg(new ByteArrayInputStream(bArr));
    }

    public final zzgfw zza() throws IOException {
        try {
            return zzgfw.zzf(this.zza, zzgkc.zza());
        } finally {
            this.zza.close();
        }
    }
}
