package ve;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: Regex.kt */
/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f38093a;

    /* compiled from: Regex.kt */
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
    }

    public f(Pattern pattern) {
        qe.k.f(pattern, "nativePattern");
        this.f38093a = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        qe.k.f(charSequence, "input");
        return this.f38093a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        qe.k.f(charSequence, "input");
        qe.k.f(str, "replacement");
        String replaceAll = this.f38093a.matcher(charSequence).replaceAll(str);
        qe.k.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f38093a.toString();
        qe.k.e(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            qe.k.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            qe.k.e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.f.<init>(java.lang.String):void");
    }
}
