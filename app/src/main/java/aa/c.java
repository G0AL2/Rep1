package aa;

import android.text.TextUtils;
import ea.a0;
import ea.n0;
import ea.r;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCssParser.java */
/* loaded from: classes2.dex */
final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f162c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f163d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f164a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f165b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f162c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.z((String) ea.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] R0 = n0.R0(str, "\\.");
        String str2 = R0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.y(str2.substring(0, indexOf2));
            dVar.x(str2.substring(indexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (R0.length > 1) {
            dVar.w((String[]) n0.I0(R0, 1, R0.length));
        }
    }

    private static boolean b(a0 a0Var) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        if (e10 + 2 > f10) {
            return false;
        }
        int i10 = e10 + 1;
        if (d10[e10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 < f10) {
                if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                    i11 = i12 + 1;
                    f10 = i11;
                } else {
                    i11 = i12;
                }
            } else {
                a0Var.Q(f10 - a0Var.e());
                return true;
            }
        }
    }

    private static boolean c(a0 a0Var) {
        char k10 = k(a0Var, a0Var.e());
        if (k10 == '\t' || k10 == '\n' || k10 == '\f' || k10 == '\r' || k10 == ' ') {
            a0Var.Q(1);
            return true;
        }
        return false;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f163d.matcher(ib.b.e(str));
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("Invalid font-size: '");
            sb2.append(str);
            sb2.append("'.");
            r.h("WebvttCssParser", sb2.toString());
            return;
        }
        String str2 = (String) ea.a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) ea.a.e(matcher.group(1))));
    }

    private static String f(a0 a0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10 && !z10) {
            char c10 = (char) a0Var.d()[e10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e10++;
                sb2.append(c10);
            }
        }
        a0Var.Q(e10 - a0Var.e());
        return sb2.toString();
    }

    static String g(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String f10 = f(a0Var, sb2);
        if ("".equals(f10)) {
            StringBuilder sb3 = new StringBuilder(1);
            sb3.append((char) a0Var.D());
            return sb3.toString();
        }
        return f10;
    }

    private static String h(a0 a0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb2);
            if (g10 == null) {
                return null;
            }
            if (!"}".equals(g10) && !";".equals(g10)) {
                sb3.append(g10);
            } else {
                a0Var.P(e10);
                z10 = true;
            }
        }
        return sb3.toString();
    }

    private static String i(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() >= 5 && "::cue".equals(a0Var.A(5))) {
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb2);
            if (g10 == null) {
                return null;
            }
            if ("{".equals(g10)) {
                a0Var.P(e10);
                return "";
            }
            String l10 = "(".equals(g10) ? l(a0Var) : null;
            if (")".equals(g(a0Var, sb2))) {
                return l10;
            }
            return null;
        }
        return null;
    }

    private static void j(a0 a0Var, d dVar, StringBuilder sb2) {
        n(a0Var);
        String f10 = f(a0Var, sb2);
        if (!"".equals(f10) && ":".equals(g(a0Var, sb2))) {
            n(a0Var);
            String h10 = h(a0Var, sb2);
            if (h10 == null || "".equals(h10)) {
                return;
            }
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb2);
            if (!";".equals(g10)) {
                if (!"}".equals(g10)) {
                    return;
                }
                a0Var.P(e10);
            }
            if ("color".equals(f10)) {
                dVar.q(ea.e.b(h10));
            } else if ("background-color".equals(f10)) {
                dVar.n(ea.e.b(h10));
            } else {
                boolean z10 = true;
                if ("ruby-position".equals(f10)) {
                    if ("over".equals(h10)) {
                        dVar.v(1);
                    } else if ("under".equals(h10)) {
                        dVar.v(2);
                    }
                } else if ("text-combine-upright".equals(f10)) {
                    if (!"all".equals(h10) && !h10.startsWith("digits")) {
                        z10 = false;
                    }
                    dVar.p(z10);
                } else if ("text-decoration".equals(f10)) {
                    if ("underline".equals(h10)) {
                        dVar.A(true);
                    }
                } else if ("font-family".equals(f10)) {
                    dVar.r(h10);
                } else if ("font-weight".equals(f10)) {
                    if ("bold".equals(h10)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(f10)) {
                    if ("italic".equals(h10)) {
                        dVar.u(true);
                    }
                } else if ("font-size".equals(f10)) {
                    e(h10, dVar);
                }
            }
        }
    }

    private static char k(a0 a0Var, int i10) {
        return (char) a0Var.d()[i10];
    }

    private static String l(a0 a0Var) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        boolean z10 = false;
        while (e10 < f10 && !z10) {
            int i10 = e10 + 1;
            z10 = ((char) a0Var.d()[e10]) == ')';
            e10 = i10;
        }
        return a0Var.A((e10 - 1) - a0Var.e()).trim();
    }

    static void m(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.p()));
    }

    static void n(a0 a0Var) {
        while (true) {
            for (boolean z10 = true; a0Var.a() > 0 && z10; z10 = false) {
                if (!c(a0Var) && !b(a0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(a0 a0Var) {
        this.f165b.setLength(0);
        int e10 = a0Var.e();
        m(a0Var);
        this.f164a.N(a0Var.d(), a0Var.e());
        this.f164a.P(e10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f164a, this.f165b);
            if (i10 == null || !"{".equals(g(this.f164a, this.f165b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int e11 = this.f164a.e();
                String g10 = g(this.f164a, this.f165b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f164a.P(e11);
                    j(this.f164a, dVar, this.f165b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
