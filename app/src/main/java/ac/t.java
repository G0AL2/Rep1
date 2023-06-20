package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes3.dex */
final class t extends a0.e.d.AbstractC0022d {

    /* renamed from: a  reason: collision with root package name */
    private final String f522a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.AbstractC0022d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f523a;

        @Override // ac.a0.e.d.AbstractC0022d.a
        public a0.e.d.AbstractC0022d a() {
            String str = "";
            if (this.f523a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new t(this.f523a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.e.d.AbstractC0022d.a
        public a0.e.d.AbstractC0022d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f523a = str;
            return this;
        }
    }

    @Override // ac.a0.e.d.AbstractC0022d
    public String b() {
        return this.f522a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0022d) {
            return this.f522a.equals(((a0.e.d.AbstractC0022d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f522a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f522a + "}";
    }

    private t(String str) {
        this.f522a = str;
    }
}
