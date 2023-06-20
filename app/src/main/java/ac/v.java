package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes3.dex */
final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f532a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f533a;

        @Override // ac.a0.e.f.a
        public a0.e.f a() {
            String str = "";
            if (this.f533a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new v(this.f533a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.f.a
        public a0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f533a = str;
            return this;
        }
    }

    @Override // ac.a0.e.f
    public String b() {
        return this.f532a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f532a.equals(((a0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f532a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f532a + "}";
    }

    private v(String str) {
        this.f532a = str;
    }
}
