package com.bytedance.sdk.component.e.c;

import android.content.Context;
import java.util.HashMap;

/* compiled from: TncInstanceManager.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f10385a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<Integer, e> f10386b;

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<Integer, a> f10387c;

    private g() {
        f10386b = new HashMap<>();
        f10387c = new HashMap<>();
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f10385a == null) {
                synchronized (g.class) {
                    if (f10385a == null) {
                        f10385a = new g();
                    }
                }
            }
            gVar = f10385a;
        }
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g1657027613239dc(java.lang.String r2) {
        /*
        L0:
            r0 = 73
            r1 = 96
        L4:
            switch(r0) {
                case 72: goto L26;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L0;
                case 95: goto L26;
                case 96: goto L26;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto Lf;
                case 56: goto L26;
                case 57: goto L26;
                default: goto Le;
            }
        Le:
            goto L0
        Lf:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L14:
            int r1 = r2.length
            if (r0 >= r1) goto L20
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L14
        L20:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L26:
            r0 = 74
            r1 = 55
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.g.g1657027613239dc(java.lang.String):java.lang.String");
    }

    public a a(int i10, Context context) {
        a aVar = f10387c.get(Integer.valueOf(i10));
        if (aVar == null) {
            a aVar2 = new a(context, i10);
            f10387c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }
        return aVar;
    }

    public e a(int i10) {
        e eVar = f10386b.get(Integer.valueOf(i10));
        if (eVar == null) {
            e eVar2 = new e(i10);
            f10386b.put(Integer.valueOf(i10), eVar2);
            return eVar2;
        }
        return eVar;
    }
}
