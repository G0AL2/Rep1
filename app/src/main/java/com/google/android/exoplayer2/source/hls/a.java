package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import da.m0;
import da.p;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Aes128DataSource.java */
/* loaded from: classes2.dex */
class a implements da.l {

    /* renamed from: a  reason: collision with root package name */
    private final da.l f21434a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f21435b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f21436c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f21437d;

    public a(da.l lVar, byte[] bArr, byte[] bArr2) {
        this.f21434a = lVar;
        this.f21435b = bArr;
        this.f21436c = bArr2;
    }

    @Override // da.i
    public final int c(byte[] bArr, int i10, int i11) throws IOException {
        ea.a.e(this.f21437d);
        int read = this.f21437d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // da.l
    public void close() throws IOException {
        if (this.f21437d != null) {
            this.f21437d = null;
            this.f21434a.close();
        }
    }

    @Override // da.l
    public final Map<String, List<String>> e() {
        return this.f21434a.e();
    }

    @Override // da.l
    public final long g(p pVar) throws IOException {
        try {
            Cipher q10 = q();
            try {
                q10.init(2, new SecretKeySpec(this.f21435b, "AES"), new IvParameterSpec(this.f21436c));
                da.n nVar = new da.n(this.f21434a, pVar);
                this.f21437d = new CipherInputStream(nVar, q10);
                nVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // da.l
    public final void l(m0 m0Var) {
        ea.a.e(m0Var);
        this.f21434a.l(m0Var);
    }

    @Override // da.l
    public final Uri o() {
        return this.f21434a.o();
    }

    protected Cipher q() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
