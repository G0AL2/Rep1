package qe;

import fe.g0;
import fe.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassReference.kt */
/* loaded from: classes3.dex */
public final class e implements te.b<Object>, d {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends ee.c<?>>, Integer> f36099b;

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, String> f36100c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f36101d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f36102e;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f36103a;

    /* compiled from: ClassReference.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List j10;
        int p10;
        Map<Class<? extends ee.c<?>>, Integer> n10;
        int d10;
        String s02;
        String s03;
        new a(null);
        int i10 = 0;
        j10 = fe.p.j(pe.a.class, pe.l.class, pe.p.class, pe.q.class, pe.r.class, pe.s.class, pe.t.class, pe.u.class, pe.v.class, pe.w.class, pe.b.class, pe.c.class, pe.d.class, pe.e.class, pe.f.class, pe.g.class, pe.h.class, pe.i.class, pe.j.class, pe.k.class, pe.m.class, pe.n.class, pe.o.class);
        p10 = fe.q.p(j10, 10);
        ArrayList arrayList = new ArrayList(p10);
        for (Object obj : j10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                fe.p.o();
            }
            arrayList.add(ee.q.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        n10 = h0.n(arrayList);
        f36099b = n10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f36100c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f36101d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            k.e(str, "kotlinName");
            s03 = ve.q.s0(str, '.', null, 2, null);
            sb2.append(s03);
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            ee.m a10 = ee.q.a(sb3, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<? extends ee.c<?>>, Integer> entry : f36099b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f36102e = hashMap3;
        d10 = g0.d(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            s02 = ve.q.s0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, s02);
        }
    }

    public e(Class<?> cls) {
        k.f(cls, "jClass");
        this.f36103a = cls;
    }

    @Override // qe.d
    public Class<?> a() {
        return this.f36103a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.a(oe.a.a(this), oe.a.a((te.b) obj));
    }

    public int hashCode() {
        return oe.a.a(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
