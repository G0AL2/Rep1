package y9;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ea.n0;
import ea.r;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TtmlRenderUtil.java */
/* loaded from: classes2.dex */
public final class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, d dVar, Map<String, g> map, int i12) {
        d e10;
        g f10;
        int i13;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i10, i11, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.q()) {
            v9.d.a(spannable, new ForegroundColorSpan(gVar.c()), i10, i11, 33);
        }
        if (gVar.p()) {
            v9.d.a(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            v9.d.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) ea.a.e(gVar.o());
            int i14 = bVar.f39294a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f39295b;
            }
            int i15 = bVar.f39296c;
            if (i15 == -2) {
                i15 = 1;
            }
            v9.d.a(spannable, new v9.e(i14, i13, i15), i10, i11, 33);
        }
        int j10 = gVar.j();
        if (j10 == 2) {
            d d10 = d(dVar, map);
            if (d10 != null && (e10 = e(d10, map)) != null) {
                if (e10.g() == 1 && e10.f(0).f39314b != null) {
                    String str = (String) n0.j(e10.f(0).f39314b);
                    g f11 = f(e10.f39318f, e10.l(), map);
                    int i16 = f11 != null ? f11.i() : -1;
                    if (i16 == -1 && (f10 = f(d10.f39318f, d10.l(), map)) != null) {
                        i16 = f10.i();
                    }
                    spannable.setSpan(new v9.c(str, i16), i10, i11, 33);
                } else {
                    r.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (j10 == 3 || j10 == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.n()) {
            v9.d.a(spannable, new v9.a(), i10, i11, 33);
        }
        int f12 = gVar.f();
        if (f12 == 1) {
            v9.d.a(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i10, i11, 33);
        } else if (f12 == 2) {
            v9.d.a(spannable, new RelativeSizeSpan(gVar.e()), i10, i11, 33);
        } else if (f12 != 3) {
        } else {
            v9.d.a(spannable, new RelativeSizeSpan(gVar.e() / 100.0f), i10, i11, 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static d d(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g f10 = f(dVar.f39318f, dVar.l(), map);
            if (f10 != null && f10.j() == 1) {
                return dVar;
            }
            dVar = dVar.f39322j;
        }
        return null;
    }

    private static d e(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g f10 = f(dVar2.f39318f, dVar2.l(), map);
            if (f10 != null && f10.j() == 3) {
                return dVar2;
            }
            for (int g10 = dVar2.g() - 1; g10 >= 0; g10--) {
                arrayDeque.push(dVar2.f(g10));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
