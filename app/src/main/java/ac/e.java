package ac;

import ac.a0;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes3.dex */
final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    private final b0<a0.d.b> f377a;

    /* renamed from: b  reason: collision with root package name */
    private final String f378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.d.a {

        /* renamed from: a  reason: collision with root package name */
        private b0<a0.d.b> f379a;

        /* renamed from: b  reason: collision with root package name */
        private String f380b;

        @Override // ac.a0.d.a
        public a0.d a() {
            String str = "";
            if (this.f379a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new e(this.f379a, this.f380b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.d.a
        public a0.d.a b(b0<a0.d.b> b0Var) {
            Objects.requireNonNull(b0Var, "Null files");
            this.f379a = b0Var;
            return this;
        }

        @Override // ac.a0.d.a
        public a0.d.a c(String str) {
            this.f380b = str;
            return this;
        }
    }

    @Override // ac.a0.d
    public b0<a0.d.b> b() {
        return this.f377a;
    }

    @Override // ac.a0.d
    public String c() {
        return this.f378b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d) {
            a0.d dVar = (a0.d) obj;
            if (this.f377a.equals(dVar.b())) {
                String str = this.f378b;
                if (str == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (str.equals(dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f377a.hashCode() ^ 1000003) * 1000003;
        String str = this.f378b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f377a + ", orgId=" + this.f378b + "}";
    }

    private e(b0<a0.d.b> b0Var, String str) {
        this.f377a = b0Var;
        this.f378b = str;
    }
}
