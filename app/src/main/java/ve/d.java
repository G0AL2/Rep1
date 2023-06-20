package ve;

import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f38079a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f38080b;

    /* renamed from: c  reason: collision with root package name */
    private static Charset f38081c;

    /* renamed from: d  reason: collision with root package name */
    private static Charset f38082d;

    static {
        Charset forName = Charset.forName("UTF-8");
        qe.k.e(forName, "forName(\"UTF-8\")");
        f38080b = forName;
        qe.k.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        qe.k.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        qe.k.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        qe.k.e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        qe.k.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f38082d;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            qe.k.e(forName, "forName(\"UTF-32BE\")");
            f38082d = forName;
            return forName;
        }
        return charset;
    }

    public final Charset b() {
        Charset charset = f38081c;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            qe.k.e(forName, "forName(\"UTF-32LE\")");
            f38081c = forName;
            return forName;
        }
        return charset;
    }
}
