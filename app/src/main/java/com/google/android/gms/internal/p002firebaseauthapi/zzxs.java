package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxr;
import com.google.android.gms.internal.p002firebaseauthapi.zzxs;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxs  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzxs<MessageType extends zzxs<MessageType, BuilderType>, BuilderType extends zzxr<MessageType, BuilderType>> implements zzaaq {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final zzyi zzo() {
        try {
            int zzs = zzs();
            zzyi zzyiVar = zzyi.zzb;
            byte[] bArr = new byte[zzs];
            zzyt zzG = zzyt.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return new zzyf(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzp(int i10) {
        throw null;
    }

    public final void zzq(OutputStream outputStream) throws IOException {
        zzyt zzH = zzyt.zzH(outputStream, zzyt.zzB(zzs()));
        zzF(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final byte[] zzr() {
        try {
            byte[] bArr = new byte[zzs()];
            zzyt zzG = zzyt.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
