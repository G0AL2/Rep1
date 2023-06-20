package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes3.dex */
final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f375a;

        /* renamed from: b  reason: collision with root package name */
        private String f376b;

        @Override // ac.a0.c.a
        public a0.c a() {
            String str = "";
            if (this.f375a == null) {
                str = " key";
            }
            if (this.f376b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new d(this.f375a, this.f376b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.c.a
        public a0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f375a = str;
            return this;
        }

        @Override // ac.a0.c.a
        public a0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f376b = str;
            return this;
        }
    }

    @Override // ac.a0.c
    public String b() {
        return this.f373a;
    }

    @Override // ac.a0.c
    public String c() {
        return this.f374b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.c) {
            a0.c cVar = (a0.c) obj;
            return this.f373a.equals(cVar.b()) && this.f374b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f373a.hashCode() ^ 1000003) * 1000003) ^ this.f374b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f373a + ", value=" + this.f374b + "}";
    }

    private d(String str, String str2) {
        this.f373a = str;
        this.f374b = str2;
    }
}
