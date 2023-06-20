package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f19871a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final g0 f19872b = new c();

    public abstract void a(Object obj, long j10);

    public abstract <L> void a(Object obj, Object obj2, long j10);

    public abstract <L> List<L> b(Object obj, long j10);

    /* loaded from: classes2.dex */
    public static final class c extends g0 {
        public c() {
            super();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public void a(Object obj, long j10) {
            ((z.j) r1.g(obj, j10)).b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public <L> List<L> b(Object obj, long j10) {
            z.j jVar = (z.j) r1.g(obj, j10);
            if (jVar.d()) {
                return jVar;
            }
            int size = jVar.size();
            z.j b10 = jVar.b(size == 0 ? 10 : size * 2);
            r1.a(obj, j10, b10);
            return b10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public <E> void a(Object obj, Object obj2, long j10) {
            z.j<E> jVar = (z.j) r1.g(obj, j10);
            z.j<E> jVar2 = (z.j) r1.g(obj2, j10);
            int size = jVar.size();
            int size2 = jVar2.size();
            z.j<E> jVar3 = jVar;
            jVar3 = jVar;
            if (size > 0 && size2 > 0) {
                boolean d10 = jVar.d();
                z.j<E> jVar4 = jVar;
                if (!d10) {
                    jVar4 = jVar.b(size2 + size);
                }
                jVar4.addAll(jVar2);
                jVar3 = jVar4;
            }
            if (size > 0) {
                jVar2 = jVar3;
            }
            r1.a(obj, j10, jVar2);
        }
    }

    public g0() {
    }

    /* loaded from: classes2.dex */
    public static final class b extends g0 {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f19873c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public void a(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) r1.g(obj, j10);
            if (list instanceof f0) {
                unmodifiableList = ((f0) list).a();
            } else if (f19873c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof z0) && (list instanceof z.j)) {
                    z.j jVar = (z.j) list;
                    if (jVar.d()) {
                        jVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            r1.a(obj, j10, unmodifiableList);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public <L> List<L> b(Object obj, long j10) {
            return a(obj, j10, 10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g0
        public <E> void a(Object obj, Object obj2, long j10) {
            List list = (List) r1.g(obj2, j10);
            List a10 = a(obj, j10, list.size());
            int size = a10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                a10.addAll(list);
            }
            if (size > 0) {
                list = a10;
            }
            r1.a(obj, j10, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> a(Object obj, long j10, int i10) {
            e0 e0Var;
            List<L> arrayList;
            List<L> list = (List) r1.g(obj, j10);
            if (list.isEmpty()) {
                if (list instanceof f0) {
                    arrayList = new e0(i10);
                } else if ((list instanceof z0) && (list instanceof z.j)) {
                    arrayList = ((z.j) list).b(i10);
                } else {
                    arrayList = new ArrayList<>(i10);
                }
                r1.a(obj, j10, arrayList);
                return arrayList;
            }
            if (f19873c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i10);
                arrayList2.addAll(list);
                r1.a(obj, j10, arrayList2);
                e0Var = arrayList2;
            } else if (list instanceof p1) {
                e0 e0Var2 = new e0(list.size() + i10);
                e0Var2.addAll(e0Var2.f19861b.size(), (p1) list);
                r1.a(obj, j10, e0Var2);
                e0Var = e0Var2;
            } else if ((list instanceof z0) && (list instanceof z.j)) {
                z.j jVar = (z.j) list;
                if (jVar.d()) {
                    return list;
                }
                z.j b10 = jVar.b(list.size() + i10);
                r1.a(obj, j10, b10);
                return b10;
            } else {
                return list;
            }
            return e0Var;
        }
    }
}
