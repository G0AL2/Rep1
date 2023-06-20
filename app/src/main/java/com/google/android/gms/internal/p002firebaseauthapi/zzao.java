package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzao  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzao implements zzbb {
    private final OutputStream zza;

    private zzao(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzbb zza(OutputStream outputStream) {
        return new zzao(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbb
    public final void zzb(zzix zzixVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbb
    public final void zzc(zzkm zzkmVar) throws IOException {
        try {
            zzkmVar.zzq(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
