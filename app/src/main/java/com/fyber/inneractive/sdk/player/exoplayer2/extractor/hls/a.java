package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18210a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f18211b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f18212c;

    /* renamed from: d  reason: collision with root package name */
    public CipherInputStream f18213d;

    public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, byte[] bArr, byte[] bArr2) {
        this.f18210a = gVar;
        this.f18211b = bArr;
        this.f18212c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f18211b, "AES"), new IvParameterSpec(this.f18212c));
                this.f18213d = new CipherInputStream(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i(this.f18210a, jVar), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.f18213d = null;
        this.f18210a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f18213d != null);
        int read = this.f18213d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.f18210a.a();
    }
}
