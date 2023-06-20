package x9;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ea.a0;
import ea.r;
import ea.s;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r9.b;
import r9.e;
import r9.f;

/* compiled from: SubripDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f38764p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f38765q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n  reason: collision with root package name */
    private final StringBuilder f38766n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<String> f38767o;

    public a() {
        super("SubripDecoder");
        this.f38766n = new StringBuilder();
        this.f38767o = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private r9.b B(Spanned spanned, String str) {
        char c10;
        char c11;
        b.C0490b o10 = new b.C0490b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            o10.l(0);
        } else if (c10 != 3 && c10 != 4 && c10 != 5) {
            o10.l(1);
        } else {
            o10.l(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            o10.i(2);
        } else if (c11 != 3 && c11 != 4 && c11 != 5) {
            o10.i(1);
        } else {
            o10.i(0);
        }
        return o10.k(C(o10.d())).h(C(o10.c()), 0).a();
    }

    static float C(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long D(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) ea.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) ea.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f38765q.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // r9.e
    protected f z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        s sVar = new s();
        a0 a0Var = new a0(bArr, i10);
        while (true) {
            String p10 = a0Var.p();
            int i11 = 0;
            if (p10 == null) {
                break;
            } else if (p10.length() != 0) {
                try {
                    Integer.parseInt(p10);
                    String p11 = a0Var.p();
                    if (p11 == null) {
                        r.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f38764p.matcher(p11);
                    if (matcher.matches()) {
                        sVar.a(D(matcher, 1));
                        sVar.a(D(matcher, 6));
                        this.f38766n.setLength(0);
                        this.f38767o.clear();
                        for (String p12 = a0Var.p(); !TextUtils.isEmpty(p12); p12 = a0Var.p()) {
                            if (this.f38766n.length() > 0) {
                                this.f38766n.append("<br>");
                            }
                            this.f38766n.append(E(p12, this.f38767o));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f38766n.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f38767o.size()) {
                                break;
                            }
                            String str2 = this.f38767o.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(r9.b.f36481r);
                    } else {
                        r.h("SubripDecoder", p11.length() != 0 ? "Skipping invalid timing: ".concat(p11) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    r.h("SubripDecoder", p10.length() != 0 ? "Skipping invalid index: ".concat(p10) : new String("Skipping invalid index: "));
                }
            }
        }
        return new b((r9.b[]) arrayList.toArray(new r9.b[0]), sVar.d());
    }
}
