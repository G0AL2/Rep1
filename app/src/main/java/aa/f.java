package aa;

import aa.f;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import ea.a0;
import ea.n0;
import ea.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r9.b;

/* compiled from: WebvttCueParser.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public static final Pattern f186a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f187b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f188c;

    /* renamed from: d */
    private static final Map<String, Integer> f189d;

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator<b> f190c = new Comparator() { // from class: aa.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.b.a((f.b) obj, (f.b) obj2);
            }
        };

        /* renamed from: a */
        private final c f191a;

        /* renamed from: b */
        private final int f192b;

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return e(bVar, bVar2);
        }

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f191a.f194b, bVar2.f191a.f194b);
        }

        private b(c cVar, int i10) {
            this.f191a = cVar;
            this.f192b = i10;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final String f193a;

        /* renamed from: b */
        public final int f194b;

        /* renamed from: c */
        public final String f195c;

        /* renamed from: d */
        public final Set<String> f196d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f194b = i10;
            this.f193a = str;
            this.f195c = str2;
            this.f196d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            ea.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] R0 = n0.R0(trim, "\\.");
            String str3 = R0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < R0.length; i11++) {
                hashSet.add(R0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final int f197a;

        /* renamed from: b */
        public final aa.d f198b;

        public d(int i10, aa.d dVar) {
            this.f197a = i10;
            this.f198b = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f197a, dVar.f197a);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f201c;

        /* renamed from: a */
        public long f199a = 0;

        /* renamed from: b */
        public long f200b = 0;

        /* renamed from: d */
        public int f202d = 2;

        /* renamed from: e */
        public float f203e = -3.4028235E38f;

        /* renamed from: f */
        public int f204f = 1;

        /* renamed from: g */
        public int f205g = 0;

        /* renamed from: h */
        public float f206h = -3.4028235E38f;

        /* renamed from: i */
        public int f207i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j */
        public float f208j = 1.0f;

        /* renamed from: k */
        public int f209k = RecyclerView.UNDEFINED_DURATION;

        private static float b(float f10, int i10) {
            int i11 = (f10 > (-3.4028235E38f) ? 1 : (f10 == (-3.4028235E38f) ? 0 : -1));
            if (i11 == 0 || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return i11 != 0 ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                StringBuilder sb2 = new StringBuilder(34);
                                sb2.append("Unknown textAlignment: ");
                                sb2.append(i10);
                                r.h("WebvttCueParser", sb2.toString());
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
                } else if (i10 == 2) {
                    return f10;
                } else {
                    throw new IllegalStateException(String.valueOf(i10));
                }
            }
            return 1.0f - f10;
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return i10 != 5 ? 1 : 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        public aa.e a() {
            return new aa.e(g().a(), this.f199a, this.f200b);
        }

        public b.C0490b g() {
            float f10 = this.f206h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f202d);
            }
            int i10 = this.f207i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f202d);
            }
            b.C0490b r10 = new b.C0490b().p(c(this.f202d)).h(b(this.f203e, this.f204f), this.f204f).i(this.f205g).k(f10).l(i10).n(Math.min(this.f208j, d(i10, f10))).r(this.f209k);
            CharSequence charSequence = this.f201c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f188c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f189d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f188c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f189d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 33);
                sb2.append("ignoring unsupported entity: '&");
                sb2.append(str);
                sb2.append(";'");
                r.h("WebvttCueParser", sb2.toString());
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<aa.d> list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f190c);
        int i11 = cVar.f194b;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f191a.f193a)) {
                b bVar = (b) arrayList.get(i13);
                int g10 = g(i(list2, str, bVar.f191a), i10, 1);
                int i14 = bVar.f191a.f194b - i12;
                int i15 = bVar.f192b - i12;
                CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                spannableStringBuilder.delete(i14, i15);
                spannableStringBuilder.setSpan(new v9.c(subSequence.toString(), g10), i11, i14, 33);
                i12 += subSequence.length();
                i11 = i14;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<aa.d> list2) {
        int i10 = cVar.f194b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f193a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(l6.c.f33710i)) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f196d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> h10 = h(list2, str, cVar);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            e(spannableStringBuilder, h10.get(i11).f198b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, aa.d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            v9.d.a(spannableStringBuilder, new StyleSpan(dVar.i()), i10, i11, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.k()) {
            v9.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i10, i11, 33);
        }
        if (dVar.j()) {
            v9.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.d() != null) {
            v9.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
        }
        int f10 = dVar.f();
        if (f10 == 1) {
            v9.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i10, i11, 33);
        } else if (f10 == 2) {
            v9.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i10, i11, 33);
        } else if (f10 == 3) {
            v9.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i10, i11, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new v9.a(), i10, i11, 33);
        }
    }

    private static int f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<aa.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aa.d dVar = list.get(i10);
            int h10 = dVar.h(str, cVar.f193a, cVar.f196d, cVar.f195c);
            if (h10 > 0) {
                arrayList.add(new d(h10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<aa.d> list, String str, c cVar) {
        List<d> h10 = h(list, str, cVar);
        for (int i10 = 0; i10 < h10.size(); i10++) {
            aa.d dVar = h10.get(i10).f198b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        ea.a.a(!trim.isEmpty());
        return n0.S0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(l6.c.f33710i)) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static r9.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f201c = charSequence;
        return eVar.g().a();
    }

    public static aa.e m(a0 a0Var, List<aa.d> list) {
        String p10 = a0Var.p();
        if (p10 == null) {
            return null;
        }
        Pattern pattern = f186a;
        Matcher matcher = pattern.matcher(p10);
        if (matcher.matches()) {
            return n(null, matcher, a0Var, list);
        }
        String p11 = a0Var.p();
        if (p11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(p11);
        if (matcher2.matches()) {
            return n(p10.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    private static aa.e n(String str, Matcher matcher, a0 a0Var, List<aa.d> list) {
        e eVar = new e();
        try {
            eVar.f199a = i.d((String) ea.a.e(matcher.group(1)));
            eVar.f200b = i.d((String) ea.a.e(matcher.group(2)));
            p((String) ea.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String p10 = a0Var.p();
            while (!TextUtils.isEmpty(p10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(p10.trim());
                p10 = a0Var.p();
            }
            eVar.f201c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            r.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    public static b.C0490b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f187b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) ea.a.e(matcher.group(1));
            String str3 = (String) ea.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f202d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f208j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f209k = w(str3);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(str3);
                    r.h("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                r.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static SpannedString q(String str, String str2, List<aa.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = f(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String j10 = j(substring);
                        if (k(j10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f193a.equals(j10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                r.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f205g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f203e = i.c(str);
            eVar.f204f = 0;
            return;
        }
        eVar.f203e = Integer.parseInt(str);
        eVar.f204f = 1;
    }

    private static int t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                r.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f207i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f206h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                r.h("WebvttCueParser", str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        r.h("WebvttCueParser", str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return RecyclerView.UNDEFINED_DURATION;
    }
}
