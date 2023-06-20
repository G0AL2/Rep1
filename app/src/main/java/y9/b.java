package y9;

import android.text.TextUtils;
import java.util.regex.Pattern;
import jb.u;

/* compiled from: TextEmphasis.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f39289d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final u<String> f39290e = u.t("auto", "none");

    /* renamed from: f  reason: collision with root package name */
    private static final u<String> f39291f = u.u("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final u<String> f39292g = u.t("filled", "open");

    /* renamed from: h  reason: collision with root package name */
    private static final u<String> f39293h = u.u("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f39294a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39296c;

    private b(int i10, int i11, int i12) {
        this.f39294a = i10;
        this.f39295b = i11;
        this.f39296c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = ib.b.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(u.o(TextUtils.split(e10, f39289d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static y9.b b(jb.u<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.b.b(jb.u):y9.b");
    }
}
