package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes3.dex */
final class q extends a0.e.d.a.b.AbstractC0018e {

    /* renamed from: a  reason: collision with root package name */
    private final String f494a;

    /* renamed from: b  reason: collision with root package name */
    private final int f495b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> f496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0018e.AbstractC0019a {

        /* renamed from: a  reason: collision with root package name */
        private String f497a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f498b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> f499c;

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0019a
        public a0.e.d.a.b.AbstractC0018e a() {
            String str = "";
            if (this.f497a == null) {
                str = " name";
            }
            if (this.f498b == null) {
                str = str + " importance";
            }
            if (this.f499c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new q(this.f497a, this.f498b.intValue(), this.f499c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0019a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0019a b(b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f499c = b0Var;
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0019a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0019a c(int i10) {
            this.f498b = Integer.valueOf(i10);
            return this;
        }

        @Override // ac.a0.e.d.a.b.AbstractC0018e.AbstractC0019a
        public a0.e.d.a.b.AbstractC0018e.AbstractC0019a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f497a = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e
    public b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> b() {
        return this.f496c;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e
    public int c() {
        return this.f495b;
    }

    @Override // ac.a0.e.d.a.b.AbstractC0018e
    public String d() {
        return this.f494a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0018e) {
            a0.e.d.a.b.AbstractC0018e abstractC0018e = (a0.e.d.a.b.AbstractC0018e) obj;
            return this.f494a.equals(abstractC0018e.d()) && this.f495b == abstractC0018e.c() && this.f496c.equals(abstractC0018e.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f494a.hashCode() ^ 1000003) * 1000003) ^ this.f495b) * 1000003) ^ this.f496c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f494a + ", importance=" + this.f495b + ", frames=" + this.f496c + "}";
    }

    private q(String str, int i10, b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> b0Var) {
        this.f494a = str;
        this.f495b = i10;
        this.f496c = b0Var;
    }
}
