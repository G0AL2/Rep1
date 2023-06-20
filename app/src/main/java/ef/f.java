package ef;

import com.ironsource.mediationsdk.config.VersionInfo;

/* compiled from: HttpMethod.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f29821a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        qe.k.f(str, "method");
        return (qe.k.a(str, "GET") || qe.k.a(str, VersionInfo.GIT_BRANCH)) ? false : true;
    }

    public static final boolean e(String str) {
        qe.k.f(str, "method");
        return qe.k.a(str, "POST") || qe.k.a(str, "PUT") || qe.k.a(str, "PATCH") || qe.k.a(str, "PROPPATCH") || qe.k.a(str, "REPORT");
    }

    public final boolean a(String str) {
        qe.k.f(str, "method");
        return qe.k.a(str, "POST") || qe.k.a(str, "PATCH") || qe.k.a(str, "PUT") || qe.k.a(str, "DELETE") || qe.k.a(str, "MOVE");
    }

    public final boolean c(String str) {
        qe.k.f(str, "method");
        return !qe.k.a(str, "PROPFIND");
    }

    public final boolean d(String str) {
        qe.k.f(str, "method");
        return qe.k.a(str, "PROPFIND");
    }
}
