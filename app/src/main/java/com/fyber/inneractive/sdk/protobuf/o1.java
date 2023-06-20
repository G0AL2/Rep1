package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class o1 extends m1<n1, n1> {
    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void a(n1 n1Var, int i10, int i11) {
        n1Var.a(t1.a(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public boolean a(e1 e1Var) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void b(n1 n1Var, int i10, long j10) {
        n1Var.a(t1.a(i10, 0), Long.valueOf(j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public int c(n1 n1Var) {
        return n1Var.b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public int d(n1 n1Var) {
        n1 n1Var2 = n1Var;
        int i10 = n1Var2.f19966d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < n1Var2.f19963a; i12++) {
            int i13 = n1Var2.f19964b[i12];
            int i14 = t1.f20010a;
            i11 += (l.b(1) * 2) + l.f(2, i13 >>> 3) + l.a(3, (i) n1Var2.f19965c[i12]);
        }
        n1Var2.f19966d = i11;
        return i11;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void e(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f19967e = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public n1 f(n1 n1Var) {
        n1 n1Var2 = n1Var;
        n1Var2.f19967e = false;
        return n1Var2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void a(n1 n1Var, int i10, long j10) {
        n1Var.a(t1.a(i10, 1), Long.valueOf(j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void b(Object obj, n1 n1Var) {
        ((GeneratedMessageLite) obj).unknownFields = n1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void c(Object obj, n1 n1Var) {
        ((GeneratedMessageLite) obj).unknownFields = n1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void a(n1 n1Var, int i10, n1 n1Var2) {
        n1Var.a(t1.a(i10, 3), n1Var2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void b(n1 n1Var, u1 u1Var) throws IOException {
        n1Var.a(u1Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void a(n1 n1Var, int i10, i iVar) {
        n1Var.a(t1.a(i10, 2), iVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public n1 b(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public n1 a(n1 n1Var, n1 n1Var2) {
        n1 n1Var3 = n1Var;
        n1 n1Var4 = n1Var2;
        return n1Var4.equals(n1.f19962f) ? n1Var3 : n1.a(n1Var3, n1Var4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public void a(n1 n1Var, u1 u1Var) throws IOException {
        n1 n1Var2 = n1Var;
        n1Var2.getClass();
        u1Var.getClass();
        for (int i10 = 0; i10 < n1Var2.f19963a; i10++) {
            int i11 = n1Var2.f19964b[i10];
            int i12 = t1.f20010a;
            ((m) u1Var).a(i11 >>> 3, n1Var2.f19965c[i10]);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public n1 a() {
        return n1.c();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m1
    public n1 a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var == n1.f19962f) {
            n1 c10 = n1.c();
            generatedMessageLite.unknownFields = c10;
            return c10;
        }
        return n1Var;
    }
}
