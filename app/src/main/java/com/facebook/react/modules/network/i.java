package com.facebook.react.modules.network;

import java.io.IOException;
import java.io.OutputStream;
import mf.r;
import ye.c0;
import ye.x;

/* compiled from: ProgressRequestBody.java */
/* loaded from: classes.dex */
public class i extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f15594a;

    /* renamed from: b  reason: collision with root package name */
    private final h f15595b;

    /* renamed from: c  reason: collision with root package name */
    private long f15596c = 0;

    public i(c0 c0Var, h hVar) {
        this.f15594a = c0Var;
        this.f15595b = hVar;
    }

    private mf.c0 b(mf.g gVar) {
        return r.g(new a(gVar.e1()));
    }

    @Override // ye.c0
    public long contentLength() throws IOException {
        if (this.f15596c == 0) {
            this.f15596c = this.f15594a.contentLength();
        }
        return this.f15596c;
    }

    @Override // ye.c0
    public x contentType() {
        return this.f15594a.contentType();
    }

    @Override // ye.c0
    public void writeTo(mf.g gVar) throws IOException {
        mf.g c10 = r.c(b(gVar));
        contentLength();
        this.f15594a.writeTo(c10);
        c10.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressRequestBody.java */
    /* loaded from: classes.dex */
    public class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void b() throws IOException {
            long a10 = a();
            long contentLength = i.this.contentLength();
            i.this.f15595b.a(a10, contentLength, a10 == contentLength);
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            super.write(bArr, i10, i11);
            b();
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            super.write(i10);
            b();
        }
    }
}
