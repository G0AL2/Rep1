package qc;

import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes3.dex */
public final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f36059a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f36060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f36059a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f36060b = list;
    }

    @Override // qc.m
    public List<String> b() {
        return this.f36060b;
    }

    @Override // qc.m
    public String c() {
        return this.f36059a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f36059a.equals(mVar.c()) && this.f36060b.equals(mVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f36059a.hashCode() ^ 1000003) * 1000003) ^ this.f36060b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f36059a + ", usedDates=" + this.f36060b + "}";
    }
}
