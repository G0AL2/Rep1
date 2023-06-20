package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* compiled from: ProgressiveStringDecoder.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f15603a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f15604b = null;

    public k(Charset charset) {
        this.f15603a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i10) {
        byte[] bArr2 = this.f15604b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i10];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f15604b.length, i10);
            i10 += this.f15604b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        boolean z10 = true;
        CharBuffer charBuffer = null;
        boolean z11 = false;
        int i11 = 0;
        while (!z11 && i11 < 4) {
            try {
                charBuffer = this.f15603a.decode(wrap);
                z11 = true;
            } catch (CharacterCodingException unused) {
                i11++;
                wrap = ByteBuffer.wrap(bArr, 0, i10 - i11);
            }
        }
        if ((!z11 || i11 <= 0) ? false : false) {
            byte[] bArr4 = new byte[i11];
            this.f15604b = bArr4;
            System.arraycopy(bArr, i10 - i11, bArr4, 0, i11);
        } else {
            this.f15604b = null;
        }
        if (!z11) {
            z3.a.G("ReactNative", "failed to decode string from byte array");
            return "";
        }
        return new String(charBuffer.array(), 0, charBuffer.length());
    }
}
