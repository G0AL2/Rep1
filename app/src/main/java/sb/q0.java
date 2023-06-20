package sb;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class q0 extends com.google.firebase.auth.p {

    /* renamed from: a  reason: collision with root package name */
    private String f36954a;

    /* renamed from: b  reason: collision with root package name */
    private String f36955b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36956c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36957d = false;

    @Override // com.google.firebase.auth.p
    public final void a(boolean z10) {
        this.f36956c = z10;
    }

    @Override // com.google.firebase.auth.p
    public final void b(String str, String str2) {
        this.f36954a = str;
        this.f36955b = str2;
    }

    public final String c() {
        return this.f36954a;
    }

    public final String d() {
        return this.f36955b;
    }

    public final boolean e() {
        return this.f36957d;
    }

    public final boolean f() {
        return (this.f36954a == null || this.f36955b == null) ? false : true;
    }

    public final boolean g() {
        return this.f36956c;
    }
}
