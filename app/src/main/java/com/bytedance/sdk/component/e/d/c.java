package com.bytedance.sdk.component.e.d;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: MultiProcessFileUtils.java */
/* loaded from: classes.dex */
public class c {
    private static String a(int i10) {
        return "tnc_config" + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.e.c.g.a()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.e.c.e r3 = r3.a(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.e.c.b r3 = r3.d()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.e.c.g.a()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.e.c.e r3 = r3.a(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.e.c.b r3 = r3.d()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = a(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.a(r2, r4, r0)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r0
        L2a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L32
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.d.c.a(android.content.Context, int, int):java.lang.String");
    }

    public static void a(Context context, int i10, String str, int i11) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i10 == 1) {
                linkedHashMap.put(a(i11), str);
            }
            b.b("MultiProcessFileUtils", "saveData = " + str);
            if (com.bytedance.sdk.component.e.c.g.a().a(i11).d() != null) {
                com.bytedance.sdk.component.e.c.g.a().a(i11).d().a(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c1657027613239dc(java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.d.c.c1657027613239dc(java.lang.String):java.lang.String");
    }
}
