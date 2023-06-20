package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: TiffUtil.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f15181a = e.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TiffUtil.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f15182a;

        /* renamed from: b  reason: collision with root package name */
        int f15183b;

        /* renamed from: c  reason: collision with root package name */
        int f15184c;

        private b() {
        }
    }

    e() {
    }

    public static int a(int i10) {
        if (i10 != 3) {
            if (i10 != 6) {
                return i10 != 8 ? 0 : 270;
            }
            return 90;
        }
        return 180;
    }

    private static int b(InputStream inputStream, int i10, boolean z10) throws IOException {
        if (i10 >= 10 && d.a(inputStream, 2, z10) == 3 && d.a(inputStream, 4, z10) == 1) {
            return d.a(inputStream, 2, z10);
        }
        return 0;
    }

    private static int c(InputStream inputStream, int i10, boolean z10, int i11) throws IOException {
        if (i10 < 14) {
            return 0;
        }
        int a10 = d.a(inputStream, 2, z10);
        int i12 = i10 - 2;
        while (true) {
            int i13 = a10 - 1;
            if (a10 <= 0 || i12 < 12) {
                break;
            }
            int i14 = i12 - 2;
            if (d.a(inputStream, 2, z10) == i11) {
                return i14;
            }
            inputStream.skip(10L);
            i12 = i14 - 10;
            a10 = i13;
        }
        return 0;
    }

    public static int d(InputStream inputStream, int i10) throws IOException {
        b bVar = new b();
        int e10 = e(inputStream, i10, bVar);
        int i11 = bVar.f15184c - 8;
        if (e10 == 0 || i11 > e10) {
            return 0;
        }
        inputStream.skip(i11);
        return b(inputStream, c(inputStream, e10 - i11, bVar.f15182a, 274), bVar.f15182a);
    }

    private static int e(InputStream inputStream, int i10, b bVar) throws IOException {
        if (i10 <= 8) {
            return 0;
        }
        int a10 = d.a(inputStream, 4, false);
        bVar.f15183b = a10;
        int i11 = i10 - 4;
        if (a10 != 1229531648 && a10 != 1296891946) {
            z3.a.f(f15181a, "Invalid TIFF header");
            return 0;
        }
        boolean z10 = a10 == 1229531648;
        bVar.f15182a = z10;
        int a11 = d.a(inputStream, 4, z10);
        bVar.f15184c = a11;
        int i12 = i11 - 4;
        if (a11 < 8 || a11 - 8 > i12) {
            z3.a.f(f15181a, "Invalid offset");
            return 0;
        }
        return i12;
    }
}
