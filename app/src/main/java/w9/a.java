package w9;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import ea.a0;
import ea.n0;
import ea.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r9.b;
import r9.e;
import r9.f;
import w9.c;

/* compiled from: SsaDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f38488s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n  reason: collision with root package name */
    private final boolean f38489n;

    /* renamed from: o  reason: collision with root package name */
    private final b f38490o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, c> f38491p;

    /* renamed from: q  reason: collision with root package name */
    private float f38492q;

    /* renamed from: r  reason: collision with root package name */
    private float f38493r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f38492q = -3.4028235E38f;
        this.f38493r = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f38489n = true;
            String D = n0.D(list.get(0));
            ea.a.a(D.startsWith("Format:"));
            this.f38490o = (b) ea.a.e(b.a(D));
            G(new a0(list.get(1)));
            return;
        }
        this.f38489n = false;
        this.f38490o = null;
    }

    private static int B(long j10, List<Long> list, List<List<r9.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float C(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static r9.b D(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0490b o10 = new b.C0490b().o(spannableString);
        if (cVar != null) {
            if (cVar.f38501c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f38501c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f38502d;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f38503e;
            if (z10 && cVar.f38504f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f38504f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f38505g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f38506h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f38520a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f38500b : -1;
        }
        o10.p(M(i10)).l(L(i10)).i(K(i10));
        PointF pointF = bVar.f38521b;
        if (pointF != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
            o10.k(pointF.x / f10);
            o10.h(bVar.f38521b.y / f11, 0);
        } else {
            o10.k(C(o10.d()));
            o10.h(C(o10.c()), 0);
        }
        return o10.a();
    }

    private void E(String str, b bVar, List<List<r9.b>> list, List<Long> list2) {
        int i10;
        ea.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f38498e);
        if (split.length != bVar.f38498e) {
            r.h("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long J = J(split[bVar.f38494a]);
        if (J == -9223372036854775807L) {
            r.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long J2 = J(split[bVar.f38495b]);
        if (J2 == -9223372036854775807L) {
            r.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, c> map = this.f38491p;
        c cVar = (map == null || (i10 = bVar.f38496c) == -1) ? null : map.get(split[i10].trim());
        String str2 = split[bVar.f38497d];
        r9.b D = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f38492q, this.f38493r);
        int B = B(J2, list2, list);
        for (int B2 = B(J, list2, list); B2 < B; B2++) {
            list.get(B2).add(D);
        }
    }

    private void F(a0 a0Var, List<List<r9.b>> list, List<Long> list2) {
        b bVar = this.f38489n ? this.f38490o : null;
        while (true) {
            String p10 = a0Var.p();
            if (p10 == null) {
                return;
            }
            if (p10.startsWith("Format:")) {
                bVar = b.a(p10);
            } else if (p10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    r.h("SsaDecoder", p10.length() != 0 ? "Skipping dialogue line before complete format: ".concat(p10) : new String("Skipping dialogue line before complete format: "));
                } else {
                    E(p10, bVar, list, list2);
                }
            }
        }
    }

    private void G(a0 a0Var) {
        while (true) {
            String p10 = a0Var.p();
            if (p10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p10)) {
                H(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p10)) {
                this.f38491p = I(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(p10)) {
                r.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p10)) {
                return;
            }
        }
    }

    private void H(a0 a0Var) {
        while (true) {
            String p10 = a0Var.p();
            if (p10 == null) {
                return;
            }
            if (a0Var.a() != 0 && a0Var.h() == 91) {
                return;
            }
            String[] split = p10.split(":");
            if (split.length == 2) {
                String e10 = ib.b.e(split[0].trim());
                e10.hashCode();
                if (e10.equals("playresx")) {
                    this.f38492q = Float.parseFloat(split[1].trim());
                } else if (e10.equals("playresy")) {
                    try {
                        this.f38493r = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> I(a0 a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String p10 = a0Var.p();
            if (p10 == null || (a0Var.a() != 0 && a0Var.h() == 91)) {
                break;
            } else if (p10.startsWith("Format:")) {
                aVar = c.a.a(p10);
            } else if (p10.startsWith("Style:")) {
                if (aVar == null) {
                    r.h("SsaDecoder", p10.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(p10) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    c b10 = c.b(p10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f38499a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long J(String str) {
        Matcher matcher = f38488s.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) n0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) n0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int K(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                r.h("SsaDecoder", sb2.toString());
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                r.h("SsaDecoder", sb2.toString());
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment M(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                r.h("SsaDecoder", sb2.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // r9.e
    protected f z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        if (!this.f38489n) {
            G(a0Var);
        }
        F(a0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
