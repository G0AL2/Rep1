package com.facebook.imageformat;

import com.facebook.imageformat.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import y3.k;
import y3.p;

/* compiled from: ImageFormatChecker.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static d f14814d;

    /* renamed from: a  reason: collision with root package name */
    private int f14815a;

    /* renamed from: b  reason: collision with root package name */
    private List<c.a> f14816b;

    /* renamed from: c  reason: collision with root package name */
    private final a f14817c = new a();

    private d() {
        f();
    }

    public static c b(InputStream inputStream) throws IOException {
        return d().a(inputStream);
    }

    public static c c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e10) {
            throw p.a(e10);
        }
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (f14814d == null) {
                f14814d = new d();
            }
            dVar = f14814d;
        }
        return dVar;
    }

    private static int e(int i10, InputStream inputStream, byte[] bArr) throws IOException {
        k.g(inputStream);
        k.g(bArr);
        k.b(Boolean.valueOf(bArr.length >= i10));
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i10);
                return y3.a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }
        return y3.a.b(inputStream, bArr, 0, i10);
    }

    private void f() {
        this.f14815a = this.f14817c.b();
        List<c.a> list = this.f14816b;
        if (list != null) {
            for (c.a aVar : list) {
                this.f14815a = Math.max(this.f14815a, aVar.b());
            }
        }
    }

    public c a(InputStream inputStream) throws IOException {
        k.g(inputStream);
        int i10 = this.f14815a;
        byte[] bArr = new byte[i10];
        int e10 = e(i10, inputStream, bArr);
        c a10 = this.f14817c.a(bArr, e10);
        if (a10 == null || a10 == c.f14812b) {
            List<c.a> list = this.f14816b;
            if (list != null) {
                for (c.a aVar : list) {
                    c a11 = aVar.a(bArr, e10);
                    if (a11 != null && a11 != c.f14812b) {
                        return a11;
                    }
                }
            }
            return c.f14812b;
        }
        return a10;
    }
}
