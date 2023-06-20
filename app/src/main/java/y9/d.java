package y9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import r9.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TtmlNode.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f39313a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39314b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39315c;

    /* renamed from: d  reason: collision with root package name */
    public final long f39316d;

    /* renamed from: e  reason: collision with root package name */
    public final long f39317e;

    /* renamed from: f  reason: collision with root package name */
    public final g f39318f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f39319g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39320h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39321i;

    /* renamed from: j  reason: collision with root package name */
    public final d f39322j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f39323k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f39324l;

    /* renamed from: m  reason: collision with root package name */
    private List<d> f39325m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f39313a = str;
        this.f39314b = str2;
        this.f39321i = str4;
        this.f39318f = gVar;
        this.f39319g = strArr;
        this.f39315c = str2 != null;
        this.f39316d = j10;
        this.f39317e = j11;
        this.f39320h = (String) ea.a.e(str3);
        this.f39322j = dVar;
        this.f39323k = new HashMap<>();
        this.f39324l = new HashMap<>();
    }

    private void b(Map<String, g> map, b.C0490b c0490b, int i10, int i11, int i12) {
        g f10 = f.f(this.f39318f, this.f39319g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0490b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0490b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f39322j, map, i12);
            if ("p".equals(this.f39313a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    c0490b.m((f10.k() * (-90.0f)) / 100.0f);
                }
                if (f10.m() != null) {
                    c0490b.p(f10.m());
                }
                if (f10.h() != null) {
                    c0490b.j(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        a[] aVarArr;
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f39313a);
        boolean equals2 = "div".equals(this.f39313a);
        if (z10 || equals || (equals2 && this.f39321i != null)) {
            long j10 = this.f39316d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f39317e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f39325m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f39325m.size(); i10++) {
            this.f39325m.get(i10).i(treeSet, z10 || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0490b> map) {
        if (!map.containsKey(str)) {
            b.C0490b c0490b = new b.C0490b();
            c0490b.o(new SpannableStringBuilder());
            map.put(str, c0490b);
        }
        return (SpannableStringBuilder) ea.a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f39320h)) {
            str = this.f39320h;
        }
        if (m(j10) && "div".equals(this.f39313a) && this.f39321i != null) {
            list.add(new Pair<>(str, this.f39321i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0490b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f39320h) ? str : this.f39320h;
            Iterator<Map.Entry<String, Integer>> it = this.f39324l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f39323k.containsKey(key) ? this.f39323k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    b(map, (b.C0490b) ea.a.e(map3.get(key)), intValue, intValue2, ((e) ea.a.e(map2.get(str2))).f39335j);
                }
            }
            for (i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, b.C0490b> map) {
        this.f39323k.clear();
        this.f39324l.clear();
        if ("metadata".equals(this.f39313a)) {
            return;
        }
        if (!"".equals(this.f39320h)) {
            str = this.f39320h;
        }
        if (this.f39315c && z10) {
            k(str, map).append((CharSequence) ea.a.e(this.f39314b));
        } else if ("br".equals(this.f39313a) && z10) {
            k(str, map).append('\n');
        } else if (m(j10)) {
            for (Map.Entry<String, b.C0490b> entry : map.entrySet()) {
                this.f39323k.put(entry.getKey(), Integer.valueOf(((CharSequence) ea.a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.f39313a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, b.C0490b> entry2 : map.entrySet()) {
                this.f39324l.put(entry2.getKey(), Integer.valueOf(((CharSequence) ea.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f39325m == null) {
            this.f39325m = new ArrayList();
        }
        this.f39325m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f39325m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f39325m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<r9.b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f39320h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f39320h, treeMap);
        o(j10, map, map2, this.f39320h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) ea.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0490b().f(decodeByteArray).k(eVar.f39327b).l(0).h(eVar.f39328c, 0).i(eVar.f39330e).n(eVar.f39331f).g(eVar.f39332g).r(eVar.f39335j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) ea.a.e(map2.get(entry.getKey()));
            b.C0490b c0490b = (b.C0490b) entry.getValue();
            e((SpannableStringBuilder) ea.a.e(c0490b.e()));
            c0490b.h(eVar2.f39328c, eVar2.f39329d);
            c0490b.i(eVar2.f39330e);
            c0490b.k(eVar2.f39327b);
            c0490b.n(eVar2.f39331f);
            c0490b.q(eVar2.f39334i, eVar2.f39333h);
            c0490b.r(eVar2.f39335j);
            arrayList2.add(c0490b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f39319g;
    }

    public boolean m(long j10) {
        long j11 = this.f39316d;
        return (j11 == -9223372036854775807L && this.f39317e == -9223372036854775807L) || (j11 <= j10 && this.f39317e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f39317e) || (j11 <= j10 && j10 < this.f39317e));
    }
}
