package com.bytedance.sdk.component.d.d;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: DuplicateRequestCheckVisitor.java */
/* loaded from: classes.dex */
public class g extends a {
    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g1657027613257dc(java.lang.String r2) {
        /*
        L0:
            r0 = 74
            r1 = 55
        L4:
            switch(r0) {
                case 72: goto L0;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L26;
                case 95: goto Lf;
                case 96: goto Lf;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto L26;
                case 56: goto L26;
                case 57: goto Lf;
                default: goto Le;
            }
        Le:
            goto L26
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
            r0 = 73
            r1 = 96
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.d.g.g1657027613257dc(java.lang.String):java.lang.String");
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        List<com.bytedance.sdk.component.d.c.c> list;
        String r10 = cVar.r();
        Map<String, List<com.bytedance.sdk.component.d.c.c>> f10 = cVar.p().f();
        synchronized (f10) {
            list = f10.get(r10);
            if (list == null) {
                list = new LinkedList<>();
            }
        }
        synchronized (list) {
            list.add(cVar);
            f10.put(r10, list);
            if (list.size() <= 1) {
                cVar.a(new d());
            }
        }
    }
}
