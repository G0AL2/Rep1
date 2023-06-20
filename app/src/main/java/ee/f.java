package ee;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes3.dex */
public final class f implements Comparable<f> {

    /* renamed from: e  reason: collision with root package name */
    public static final f f29800e;

    /* renamed from: a  reason: collision with root package name */
    private final int f29801a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29802b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29803c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29804d;

    /* compiled from: KotlinVersion.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        f29800e = g.a();
    }

    public f(int i10, int i11, int i12) {
        this.f29801a = i10;
        this.f29802b = i11;
        this.f29803c = i12;
        this.f29804d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new se.c(0, 255).j(i10) && new se.c(0, 255).j(i11) && new se.c(0, 255).j(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        qe.k.f(fVar, InneractiveMediationNameConsts.OTHER);
        return this.f29804d - fVar.f29804d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f29804d == fVar.f29804d;
    }

    public int hashCode() {
        return this.f29804d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29801a);
        sb2.append('.');
        sb2.append(this.f29802b);
        sb2.append('.');
        sb2.append(this.f29803c);
        return sb2.toString();
    }
}
