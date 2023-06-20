package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.j0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class m0 implements l0 {
    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public Map<?, ?> a(Object obj) {
        return (k0) obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public Object b(Object obj) {
        k0 k0Var = k0.f19943b;
        return k0Var.isEmpty() ? new k0() : new k0(k0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public Map<?, ?> c(Object obj) {
        return (k0) obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public boolean d(Object obj) {
        return !((k0) obj).f19944a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public Object e(Object obj) {
        ((k0) obj).f19944a = false;
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public j0.a<?, ?> f(Object obj) {
        ((j0) obj).getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public Object a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f19944a) {
                k0Var = k0Var.isEmpty() ? new k0() : new k0(k0Var);
            }
            k0Var.a();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.l0
    public int a(int i10, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        if (k0Var.isEmpty()) {
            return 0;
        }
        Iterator it = k0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            j0Var.getClass();
            l.b(i10);
            throw null;
        }
        return 0;
    }
}
