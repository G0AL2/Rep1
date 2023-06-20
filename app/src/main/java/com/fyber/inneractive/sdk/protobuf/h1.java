package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f19877a;

    /* renamed from: b  reason: collision with root package name */
    public static final m1<?, ?> f19878b;

    /* renamed from: c  reason: collision with root package name */
    public static final m1<?, ?> f19879c;

    /* renamed from: d  reason: collision with root package name */
    public static final m1<?, ?> f19880d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f19877a = cls;
        f19878b = a(false);
        f19879c = a(true);
        f19880d = new o1();
    }

    public static void a(int i10, List<Boolean> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                Logger logger = l.f19945b;
                i12++;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.a(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.b(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public static void b(int i10, List<Double> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                Logger logger = l.f19945b;
                i12 += 8;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                l lVar = mVar.f19956a;
                double doubleValue = list.get(i11).doubleValue();
                lVar.getClass();
                lVar.c(Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            l lVar2 = mVar.f19956a;
            double doubleValue2 = list.get(i11).doubleValue();
            lVar2.getClass();
            lVar2.f(i10, Double.doubleToRawLongBits(doubleValue2));
            i11++;
        }
    }

    public static void c(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.a(list.get(i13).intValue());
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.f(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.h(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public static void d(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                Logger logger = l.f19945b;
                i12 += 4;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.e(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.g(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public static void e(int i10, List<Long> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                Logger logger = l.f19945b;
                i12 += 8;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.c(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.f(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public static void f(int i10, List<Float> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                Logger logger = l.f19945b;
                i12 += 4;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                l lVar = mVar.f19956a;
                float floatValue = list.get(i11).floatValue();
                lVar.getClass();
                lVar.e(Float.floatToRawIntBits(floatValue));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            l lVar2 = mVar.f19956a;
            float floatValue2 = list.get(i11).floatValue();
            lVar2.getClass();
            lVar2.g(i10, Float.floatToRawIntBits(floatValue2));
            i11++;
        }
    }

    public static void g(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.a(list.get(i13).intValue());
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.f(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.h(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public static void h(int i10, List<Long> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.a(list.get(i13).longValue());
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.d(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.g(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public static void i(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                Logger logger = l.f19945b;
                i12 += 4;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.e(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.g(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public static void j(int i10, List<Long> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                Logger logger = l.f19945b;
                i12 += 8;
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.c(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.f(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public static void k(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.c(l.d(list.get(i13).intValue()));
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.g(l.d(list.get(i11).intValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.j(i10, l.d(list.get(i11).intValue()));
            i11++;
        }
    }

    public static void l(int i10, List<Long> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.a(l.b(list.get(i13).longValue()));
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.d(l.b(list.get(i11).longValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.g(i10, l.b(list.get(i11).longValue()));
            i11++;
        }
    }

    public static void m(int i10, List<Integer> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.c(list.get(i13).intValue());
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.g(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.j(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public static void n(int i10, List<Long> list, u1 u1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (z10) {
            mVar.f19956a.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.a(list.get(i13).longValue());
            }
            mVar.f19956a.g(i12);
            while (i11 < list.size()) {
                mVar.f19956a.d(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.g(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public static int d(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(yVar.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int e(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(h0Var.d(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int g(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(l.b(h0Var.d(i11)));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(l.b(list.get(i11).longValue()));
                i11++;
            }
        }
        return i10;
    }

    public static void a(int i10, List<i> list, u1 u1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            mVar.f19956a.b(i10, list.get(i11));
        }
    }

    public static void b(int i10, List<String> list, u1 u1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        int i11 = 0;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i11 < list.size()) {
                Object a10 = f0Var.a(i11);
                if (a10 instanceof String) {
                    mVar.f19956a.b(i10, (String) a10);
                } else {
                    mVar.f19956a.b(i10, (i) a10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            mVar.f19956a.b(i10, list.get(i11));
            i11++;
        }
    }

    public static int f(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return l.b(i10) + l.c(e10) + e10;
        }
        return e10 + (list.size() * l.b(i10));
    }

    public static int i(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(h0Var.d(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int j(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = i(list);
        if (z10) {
            return l.b(i10) + l.c(i11) + i11;
        }
        return i11 + (size * l.b(i10));
    }

    public static int c(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            int i11 = size * 4;
            return l.b(i10) + l.c(i11) + i11;
        }
        return size * l.b(i10, 0);
    }

    public static int h(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g10 = g(list);
        if (z10) {
            return l.b(i10) + l.c(g10) + g10;
        }
        return g10 + (size * l.b(i10));
    }

    public static void a(int i10, List<?> list, u1 u1Var, f1 f1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            mVar.a(i10, list.get(i11), f1Var);
        }
    }

    public static int d(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            int i11 = size * 8;
            return l.b(i10) + l.c(i11) + i11;
        }
        return size * l.a(i10, 0L);
    }

    public static int c(List<?> list) {
        return list.size() * 8;
    }

    public static int e(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d10 = d(list);
        if (z10) {
            return l.b(i10) + l.c(d10) + d10;
        }
        return d10 + (size * l.b(i10));
    }

    public static int f(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.c(l.d(yVar.e(i11)));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.c(l.d(list.get(i11).intValue()));
                i11++;
            }
        }
        return i10;
    }

    public static int g(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f10 = f(list);
        if (z10) {
            return l.b(i10) + l.c(f10) + f10;
        }
        return f10 + (size * l.b(i10));
    }

    public static int i(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h10 = h(list);
        if (z10) {
            return l.b(i10) + l.c(h10) + h10;
        }
        return h10 + (size * l.b(i10));
    }

    public static int h(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.c(yVar.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.c(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int a(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(yVar.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.a(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void b(int i10, List<?> list, u1 u1Var, f1 f1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) u1Var;
        mVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            mVar.f19956a.b(i10, (q0) list.get(i11), f1Var);
        }
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return l.b(i10) + l.c(size) + size;
        }
        return size * l.a(i10, true);
    }

    public static int b(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a10 = a(list);
        if (z10) {
            return l.b(i10) + l.c(a10) + a10;
        }
        return a10 + (size * l.b(i10));
    }

    public static int a(int i10, Object obj, f1 f1Var) {
        if (obj instanceof d0) {
            return l.b(i10) + l.a((d0) obj);
        }
        int b10 = l.b(i10);
        int serializedSize = ((a) ((q0) obj)).getSerializedSize(f1Var);
        return b10 + l.c(serializedSize) + serializedSize;
    }

    public static int b(List<?> list) {
        return list.size() * 4;
    }

    public static int b(int i10, List<?> list) {
        int a10;
        int a11;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int b10 = l.b(i10) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i11 < size) {
                Object a12 = f0Var.a(i11);
                if (a12 instanceof i) {
                    a11 = l.a((i) a12);
                } else {
                    a11 = l.a((String) a12);
                }
                b10 += a11;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof i) {
                    a10 = l.a((i) obj);
                } else {
                    a10 = l.a((String) obj);
                }
                b10 += a10;
                i11++;
            }
        }
        return b10;
    }

    public static int a(int i10, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b10 = size * l.b(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            b10 += l.a(list.get(i11));
        }
        return b10;
    }

    public static int a(int i10, List<q0> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l.a(i10, list.get(i12), f1Var);
        }
        return i11;
    }

    public static m1<?, ?> a(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (m1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB a(int i10, List<Integer> list, z.d<?> dVar, UB ub2, m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int intValue = list.get(i12).intValue();
            if (dVar.a(intValue) != null) {
                if (i12 != i11) {
                    list.set(i11, Integer.valueOf(intValue));
                }
                i11++;
            } else {
                if (ub2 == null) {
                    ub2 = m1Var.a();
                }
                m1Var.b(ub2, i10, intValue);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static int b(int i10, List<?> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b10 = l.b(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof d0) {
                b10 += l.a((d0) obj);
            } else {
                int serializedSize = ((a) ((q0) obj)).getSerializedSize(f1Var);
                b10 += l.c(serializedSize) + serializedSize;
            }
        }
        return b10;
    }

    public static <UT, UB> UB a(int i10, List<Integer> list, z.e eVar, UB ub2, m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (ub2 == null) {
                        ub2 = m1Var.a();
                    }
                    m1Var.b(ub2, i10, intValue);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    if (ub2 == null) {
                        ub2 = m1Var.a();
                    }
                    m1Var.b(ub2, i10, intValue2);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static <UT, UB> UB a(int i10, int i11, UB ub2, m1<UT, UB> m1Var) {
        if (ub2 == null) {
            ub2 = m1Var.a();
        }
        m1Var.b(ub2, i10, i11);
        return ub2;
    }
}
