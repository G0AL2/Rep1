package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    public static volatile q f19972b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f19973c = new q(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.d<?, ?>> f19974a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f19975a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19976b;

        public a(Object obj, int i10) {
            this.f19975a = obj;
            this.f19976b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f19975a == aVar.f19975a && this.f19976b == aVar.f19976b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19975a) * 65535) + this.f19976b;
        }
    }

    public q() {
        this.f19974a = new HashMap();
    }

    public static q a() {
        q qVar = f19972b;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f19972b;
                if (qVar == null) {
                    Class<?> cls = p.f19968a;
                    q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = f19973c;
                    }
                    f19972b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public q(boolean z10) {
        this.f19974a = Collections.emptyMap();
    }
}
