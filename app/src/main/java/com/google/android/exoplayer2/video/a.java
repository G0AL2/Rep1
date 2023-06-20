package com.google.android.exoplayer2.video;

import ea.a0;
import ea.w;
import j8.j2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvcConfig.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f21805a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21806b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21807c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21808d;

    /* renamed from: e  reason: collision with root package name */
    public final float f21809e;

    /* renamed from: f  reason: collision with root package name */
    public final String f21810f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f21805a = list;
        this.f21806b = i10;
        this.f21807c = i11;
        this.f21808d = i12;
        this.f21809e = f10;
        this.f21810f = str;
    }

    private static byte[] a(a0 a0Var) {
        int J = a0Var.J();
        int e10 = a0Var.e();
        a0Var.Q(J);
        return ea.d.d(a0Var.d(), e10, J);
    }

    public static a b(a0 a0Var) throws j2 {
        String str;
        int i10;
        float f10;
        try {
            a0Var.Q(4);
            int D = (a0Var.D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = a0Var.D() & 31;
                for (int i11 = 0; i11 < D2; i11++) {
                    arrayList.add(a(a0Var));
                }
                int D3 = a0Var.D();
                for (int i12 = 0; i12 < D3; i12++) {
                    arrayList.add(a(a0Var));
                }
                int i13 = -1;
                if (D2 > 0) {
                    w.c l10 = w.l((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f29769e;
                    int i15 = l10.f29770f;
                    float f11 = l10.f29771g;
                    str = ea.d.a(l10.f29765a, l10.f29766b, l10.f29767c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, D, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw j2.a("Error parsing AVC config", e10);
        }
    }
}
