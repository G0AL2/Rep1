package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.c0;
import com.fyber.inneractive.sdk.protobuf.t1;
import com.fyber.inneractive.sdk.protobuf.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u0<T> implements f1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f20053a;

    /* renamed from: b  reason: collision with root package name */
    public final m1<?, ?> f20054b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20055c;

    /* renamed from: d  reason: collision with root package name */
    public final r<?> f20056d;

    public u0(m1<?, ?> m1Var, r<?> rVar, q0 q0Var) {
        this.f20054b = m1Var;
        this.f20055c = rVar.a(q0Var);
        this.f20056d = rVar;
        this.f20053a = q0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public T a() {
        return (T) ((GeneratedMessageLite.a) this.f20053a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public boolean b(T t10, T t11) {
        if (this.f20054b.b(t10).equals(this.f20054b.b(t11))) {
            if (this.f20055c) {
                return this.f20056d.a(t10).equals(this.f20056d.a(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void c(T t10) {
        this.f20054b.e(t10);
        this.f20056d.c(t10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public int d(T t10) {
        int hashCode = this.f20054b.b(t10).hashCode();
        return this.f20055c ? (hashCode * 53) + this.f20056d.a(t10).f20050a.hashCode() : hashCode;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void a(T t10, T t11) {
        m1<?, ?> m1Var = this.f20054b;
        Class<?> cls = h1.f19877a;
        m1Var.c(t10, m1Var.a(m1Var.b(t10), m1Var.b(t11)));
        if (this.f20055c) {
            r<?> rVar = this.f20056d;
            u<?> a10 = rVar.a(t11);
            if (a10.f20050a.isEmpty()) {
                return;
            }
            rVar.b(t10).a(a10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public int b(T t10) {
        m1<?, ?> m1Var = this.f20054b;
        int d10 = m1Var.d(m1Var.b(t10)) + 0;
        return this.f20055c ? d10 + this.f20056d.a(t10).c() : d10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void a(T t10, u1 u1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f10 = this.f20056d.a(t10).f();
        while (f10.hasNext()) {
            Map.Entry<?, Object> next = f10.next();
            u.a aVar = (u.a) next.getKey();
            if (aVar.d() == t1.c.MESSAGE && !aVar.b() && !aVar.e()) {
                if (next instanceof c0.a) {
                    ((m) u1Var).a(aVar.a(), ((c0.a) next).f19844a.getValue().a());
                } else {
                    ((m) u1Var).a(aVar.a(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m1<?, ?> m1Var = this.f20054b;
        m1Var.a((m1<?, ?>) m1Var.b(t10), u1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[EDGE_INSN: B:57:0x00b9->B:34:0x00b9 ?: BREAK  , SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.e.a r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r0
            com.fyber.inneractive.sdk.protobuf.n1 r1 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.n1.f19962f
            if (r1 != r2) goto Lf
            com.fyber.inneractive.sdk.protobuf.n1 r1 = com.fyber.inneractive.sdk.protobuf.n1.c()
            r0.unknownFields = r1
        Lf:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.fyber.inneractive.sdk.protobuf.u r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc5
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r13, r15)
            int r13 = r15.f19857a
            int r3 = com.fyber.inneractive.sdk.protobuf.t1.f20010a
            r5 = 2
            if (r13 == r3) goto L61
            r3 = r13 & 7
            if (r3 != r5) goto L5c
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f20056d
            com.fyber.inneractive.sdk.protobuf.q r3 = r15.f19860d
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r10.f20053a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.a(r3, r5, r6)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r8 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.d) r8
            if (r8 == 0) goto L51
            com.fyber.inneractive.sdk.protobuf.b1 r13 = com.fyber.inneractive.sdk.protobuf.b1.f19840c
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f19813c
            java.lang.Class r2 = r2.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r13 = r13.a(r2)
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r13, r12, r4, r14, r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r8.f19814d
            java.lang.Object r3 = r15.f19859c
            r11.c(r2, r3)
            goto L5a
        L51:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r2, r3, r4, r5, r6, r7)
        L5a:
            r2 = r8
            goto L17
        L5c:
            int r13 = com.fyber.inneractive.sdk.protobuf.e.a(r13, r12, r4, r14, r15)
            goto L17
        L61:
            r13 = 0
            r3 = r0
        L63:
            if (r4 >= r14) goto Lb9
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r4, r15)
            int r6 = r15.f19857a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L9a
            r9 = 3
            if (r7 == r9) goto L75
            goto Laf
        L75:
            if (r2 == 0) goto L8f
            com.fyber.inneractive.sdk.protobuf.b1 r6 = com.fyber.inneractive.sdk.protobuf.b1.f19840c
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r2.f19813c
            java.lang.Class r7 = r7.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r6.a(r7)
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r6, r12, r4, r14, r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r6 = r2.f19814d
            java.lang.Object r7 = r15.f19859c
            r11.c(r6, r7)
            goto L63
        L8f:
            if (r8 != r5) goto Laf
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r12, r4, r15)
            java.lang.Object r3 = r15.f19859c
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.i) r3
            goto L63
        L9a:
            if (r8 != 0) goto Laf
            int r4 = com.fyber.inneractive.sdk.protobuf.e.d(r12, r4, r15)
            int r13 = r15.f19857a
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f20056d
            com.fyber.inneractive.sdk.protobuf.q r6 = r15.f19860d
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r10.f20053a
            java.lang.Object r2 = r2.a(r6, r7, r13)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r2 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.d) r2
            goto L63
        Laf:
            int r7 = com.fyber.inneractive.sdk.protobuf.t1.f20011b
            if (r6 != r7) goto Lb4
            goto Lb9
        Lb4:
            int r4 = com.fyber.inneractive.sdk.protobuf.e.a(r6, r12, r4, r14, r15)
            goto L63
        Lb9:
            if (r3 == 0) goto Lc2
            int r13 = com.fyber.inneractive.sdk.protobuf.t1.a(r13, r5)
            r1.a(r13, r3)
        Lc2:
            r13 = r4
            goto L17
        Lc5:
            if (r13 != r14) goto Lc8
            return
        Lc8:
            com.fyber.inneractive.sdk.protobuf.a0 r11 = com.fyber.inneractive.sdk.protobuf.a0.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.u0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void a(T t10, e1 e1Var, q qVar) throws IOException {
        m1 m1Var = this.f20054b;
        r rVar = this.f20056d;
        Object a10 = m1Var.a(t10);
        u<ET> b10 = rVar.b(t10);
        do {
            try {
                if (e1Var.s() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                m1Var.b((Object) t10, (T) a10);
            }
        } while (a(e1Var, qVar, rVar, b10, m1Var, a10));
    }

    public final <UT, UB, ET extends u.a<ET>> boolean a(e1 e1Var, q qVar, r<ET> rVar, u<ET> uVar, m1<UT, UB> m1Var, UB ub2) throws IOException {
        int e10 = e1Var.e();
        if (e10 != t1.f20010a) {
            if ((e10 & 7) == 2) {
                Object a10 = rVar.a(qVar, this.f20053a, e10 >>> 3);
                if (a10 != null) {
                    rVar.a(e1Var, a10, qVar, uVar);
                    return true;
                }
                return m1Var.a((m1<UT, UB>) ub2, e1Var);
            }
            return e1Var.i();
        }
        int i10 = 0;
        Object obj = null;
        i iVar = null;
        while (e1Var.s() != Integer.MAX_VALUE) {
            int e11 = e1Var.e();
            if (e11 == t1.f20012c) {
                i10 = e1Var.c();
                obj = rVar.a(qVar, this.f20053a, i10);
            } else if (e11 == t1.f20013d) {
                if (obj != null) {
                    rVar.a(e1Var, obj, qVar, uVar);
                } else {
                    iVar = e1Var.a();
                }
            } else if (!e1Var.i()) {
                break;
            }
        }
        if (e1Var.e() == t1.f20011b) {
            if (iVar != null) {
                if (obj != null) {
                    rVar.a(iVar, obj, qVar, uVar);
                } else {
                    m1Var.a((m1<UT, UB>) ub2, i10, iVar);
                }
            }
            return true;
        }
        throw a0.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public final boolean a(T t10) {
        return this.f20056d.a(t10).e();
    }
}
