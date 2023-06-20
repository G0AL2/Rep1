package com.facebook.imagepipeline.nativecode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import y3.k;

@y3.d
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements d6.c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14858a;

    /* renamed from: b  reason: collision with root package name */
    private int f14859b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14860c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f14858a = z10;
        this.f14859b = i10;
        this.f14860c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException {
        d.a();
        boolean z10 = false;
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(d6.e.j(i10)));
        k.c((i11 == 8 && i10 == 0) ? true : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException {
        d.a();
        boolean z10 = false;
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(d6.e.i(i10)));
        k.c((i11 == 8 && i10 == 1) ? true : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    @y3.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException;

    @y3.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException;

    @Override // d6.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // d6.c
    public d6.b b(w5.e eVar, OutputStream outputStream, q5.f fVar, q5.e eVar2, com.facebook.imageformat.c cVar, Integer num) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (fVar == null) {
            fVar = q5.f.a();
        }
        int b10 = d6.a.b(fVar, eVar2, eVar, this.f14859b);
        try {
            int f10 = d6.e.f(fVar, eVar2, eVar, this.f14858a);
            int a10 = d6.e.a(b10);
            if (this.f14860c) {
                f10 = a10;
            }
            InputStream C = eVar.C();
            if (d6.e.f29086a.contains(Integer.valueOf(eVar.w()))) {
                f((InputStream) k.h(C, "Cannot transcode from null input stream!"), outputStream, d6.e.d(fVar, eVar), f10, num.intValue());
            } else {
                e((InputStream) k.h(C, "Cannot transcode from null input stream!"), outputStream, d6.e.e(fVar, eVar), f10, num.intValue());
            }
            y3.b.b(C);
            return new d6.b(b10 != 1 ? 0 : 1);
        } catch (Throwable th) {
            y3.b.b(null);
            throw th;
        }
    }

    @Override // d6.c
    public boolean c(w5.e eVar, q5.f fVar, q5.e eVar2) {
        if (fVar == null) {
            fVar = q5.f.a();
        }
        return d6.e.f(fVar, eVar2, eVar, this.f14858a) < 8;
    }

    @Override // d6.c
    public boolean d(com.facebook.imageformat.c cVar) {
        return cVar == com.facebook.imageformat.b.f14800a;
    }
}
