package yb;

import java.io.File;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes3.dex */
final class b extends o {

    /* renamed from: a  reason: collision with root package name */
    private final ac.a0 f39368a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39369b;

    /* renamed from: c  reason: collision with root package name */
    private final File f39370c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ac.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f39368a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f39369b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f39370c = file;
    }

    @Override // yb.o
    public ac.a0 b() {
        return this.f39368a;
    }

    @Override // yb.o
    public File c() {
        return this.f39370c;
    }

    @Override // yb.o
    public String d() {
        return this.f39369b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f39368a.equals(oVar.b()) && this.f39369b.equals(oVar.d()) && this.f39370c.equals(oVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f39368a.hashCode() ^ 1000003) * 1000003) ^ this.f39369b.hashCode()) * 1000003) ^ this.f39370c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f39368a + ", sessionId=" + this.f39369b + ", reportFile=" + this.f39370c + "}";
    }
}
