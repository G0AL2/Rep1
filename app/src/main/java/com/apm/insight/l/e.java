package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class e extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    private MessageDigest f6482a;

    /* renamed from: b  reason: collision with root package name */
    private Charset f6483b;

    /* renamed from: c  reason: collision with root package name */
    private a f6484c;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f6482a = null;
        this.f6483b = null;
        this.f6484c = null;
        this.f6482a = messageDigest;
        this.f6484c = aVar;
        if (messageDigest != null) {
            this.f6483b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f6482a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f6482a != null) {
            a aVar = this.f6484c;
            if (aVar == null || aVar.a(str)) {
                this.f6482a.update(this.f6483b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f6482a;
        if (messageDigest != null) {
            messageDigest.update(this.f6483b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
