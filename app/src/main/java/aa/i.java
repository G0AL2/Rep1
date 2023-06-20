package aa;

import ea.a0;
import ea.n0;
import j8.j2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f213a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String p10;
        while (true) {
            String p11 = a0Var.p();
            if (p11 == null) {
                return null;
            }
            if (f213a.matcher(p11).matches()) {
                do {
                    p10 = a0Var.p();
                    if (p10 != null) {
                    }
                } while (!p10.isEmpty());
            } else {
                Matcher matcher = f.f186a.matcher(p11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String p10 = a0Var.p();
        return p10 != null && p10.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] S0 = n0.S0(str, "\\.");
        long j10 = 0;
        for (String str2 : n0.R0(S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (S0.length == 2) {
            j11 += Long.parseLong(S0[1]);
        }
        return j11 * 1000;
    }

    public static void e(a0 a0Var) throws j2 {
        int e10 = a0Var.e();
        if (b(a0Var)) {
            return;
        }
        a0Var.P(e10);
        String valueOf = String.valueOf(a0Var.p());
        throw j2.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
    }
}
