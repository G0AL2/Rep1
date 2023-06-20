package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.f;
import com.fyber.inneractive.sdk.protobuf.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s extends r<GeneratedMessageLite.c> {
    @Override // com.fyber.inneractive.sdk.protobuf.r
    public boolean a(q0 q0Var) {
        return q0Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public u<GeneratedMessageLite.c> b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void c(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public u<GeneratedMessageLite.c> a(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0  */
    @Override // com.fyber.inneractive.sdk.protobuf.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <UT, UB> UB a(com.fyber.inneractive.sdk.protobuf.e1 r5, java.lang.Object r6, com.fyber.inneractive.sdk.protobuf.q r7, com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.c> r8, UB r9, com.fyber.inneractive.sdk.protobuf.m1<UT, UB> r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s.a(com.fyber.inneractive.sdk.protobuf.e1, java.lang.Object, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.u, java.lang.Object, com.fyber.inneractive.sdk.protobuf.m1):java.lang.Object");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public Object a(q qVar, q0 q0Var, int i10) {
        return qVar.f19974a.get(new q.a(q0Var, i10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.c) entry.getKey()).f19807b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(u1 u1Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) entry.getKey();
        if (cVar.f19809d) {
            switch (cVar.f19808c.ordinal()) {
                case 0:
                    h1.b(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 1:
                    h1.f(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 2:
                    h1.h(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 3:
                    h1.n(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 4:
                    h1.g(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 5:
                    h1.e(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 6:
                    h1.d(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 7:
                    h1.a(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 8:
                    h1.b(cVar.f19807b, (List) entry.getValue(), u1Var);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    h1.a(cVar.f19807b, (List) entry.getValue(), u1Var, b1.f19840c.a(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    h1.b(cVar.f19807b, (List) entry.getValue(), u1Var, b1.f19840c.a(list2.get(0).getClass()));
                    return;
                case 11:
                    h1.a(cVar.f19807b, (List) entry.getValue(), u1Var);
                    return;
                case 12:
                    h1.m(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 13:
                    h1.g(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 14:
                    h1.i(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 15:
                    h1.j(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 16:
                    h1.k(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                case 17:
                    h1.l(cVar.f19807b, (List) entry.getValue(), u1Var, cVar.f19810e);
                    return;
                default:
                    return;
            }
        }
        switch (cVar.f19808c.ordinal()) {
            case 0:
                ((m) u1Var).a(cVar.f19807b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                ((m) u1Var).a(cVar.f19807b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                ((m) u1Var).f19956a.g(cVar.f19807b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                ((m) u1Var).f19956a.g(cVar.f19807b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((m) u1Var).f19956a.h(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                ((m) u1Var).f19956a.f(cVar.f19807b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                ((m) u1Var).f19956a.g(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                ((m) u1Var).f19956a.b(cVar.f19807b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((m) u1Var).f19956a.b(cVar.f19807b, (String) entry.getValue());
                return;
            case 9:
                ((m) u1Var).a(cVar.f19807b, entry.getValue(), b1.f19840c.a(entry.getValue().getClass()));
                return;
            case 10:
                ((m) u1Var).b(cVar.f19807b, entry.getValue(), b1.f19840c.a(entry.getValue().getClass()));
                return;
            case 11:
                ((m) u1Var).f19956a.b(cVar.f19807b, (i) entry.getValue());
                return;
            case 12:
                ((m) u1Var).f19956a.j(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((m) u1Var).f19956a.h(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                ((m) u1Var).f19956a.g(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((m) u1Var).f19956a.f(cVar.f19807b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                ((m) u1Var).a(cVar.f19807b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                ((m) u1Var).a(cVar.f19807b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(e1 e1Var, Object obj, q qVar, u<GeneratedMessageLite.c> uVar) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) obj;
        uVar.c(dVar.f19814d, e1Var.b(dVar.f19813c.getClass(), qVar));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(i iVar, Object obj, q qVar, u<GeneratedMessageLite.c> uVar) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) obj;
        GeneratedMessageLite b10 = ((GeneratedMessageLite.a) dVar.f19813c.newBuilderForType()).b();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.h());
        if (wrap.hasArray()) {
            f.b bVar = new f.b(wrap, true);
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            b1Var.a(b10.getClass()).a(b10, bVar, qVar);
            uVar.c(dVar.f19814d, b10);
            if (bVar.s() != Integer.MAX_VALUE) {
                throw a0.a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
