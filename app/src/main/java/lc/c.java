package lc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34035a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f34036b;

    /* compiled from: FieldDescriptor.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f34037a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f34038b = null;

        b(String str) {
            this.f34037a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f34037a;
            if (this.f34038b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f34038b));
            }
            return new c(str, unmodifiableMap);
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f34038b == null) {
                this.f34038b = new HashMap();
            }
            this.f34038b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f34035a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f34036b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f34035a.equals(cVar.f34035a) && this.f34036b.equals(cVar.f34036b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34035a.hashCode() * 31) + this.f34036b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f34035a + ", properties=" + this.f34036b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f34035a = str;
        this.f34036b = map;
    }
}
