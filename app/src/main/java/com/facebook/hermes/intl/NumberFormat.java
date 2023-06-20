package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.d;
import com.facebook.hermes.intl.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@g6.a
/* loaded from: classes.dex */
public class NumberFormat {

    /* renamed from: v  reason: collision with root package name */
    private static String[] f14558v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a  reason: collision with root package name */
    private d.h f14559a;

    /* renamed from: f  reason: collision with root package name */
    private d.i f14564f;

    /* renamed from: m  reason: collision with root package name */
    private d.f f14571m;

    /* renamed from: o  reason: collision with root package name */
    private d f14573o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14574p;

    /* renamed from: s  reason: collision with root package name */
    private d.b f14577s;

    /* renamed from: b  reason: collision with root package name */
    private String f14560b = null;

    /* renamed from: c  reason: collision with root package name */
    private d.c f14561c = d.c.SYMBOL;

    /* renamed from: d  reason: collision with root package name */
    private d.EnumC0196d f14562d = d.EnumC0196d.STANDARD;

    /* renamed from: e  reason: collision with root package name */
    private String f14563e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14565g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f14566h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f14567i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f14568j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f14569k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f14570l = -1;

    /* renamed from: n  reason: collision with root package name */
    private d.g f14572n = d.g.AUTO;

    /* renamed from: q  reason: collision with root package name */
    private String f14575q = null;

    /* renamed from: r  reason: collision with root package name */
    private d.e f14576r = null;

    /* renamed from: t  reason: collision with root package name */
    private a<?> f14578t = null;

    /* renamed from: u  reason: collision with root package name */
    private a<?> f14579u = null;

    @g6.a
    public NumberFormat(List<String> list, Map<String, Object> map) throws i5.d {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14573o = new t();
        } else {
            this.f14573o = new s();
        }
        a(list, map);
        this.f14573o.h(this.f14578t, this.f14574p ? "" : this.f14575q, this.f14559a, this.f14562d, this.f14576r, this.f14577s).d(this.f14560b, this.f14561c).g(this.f14565g).f(this.f14566h).e(this.f14571m, this.f14569k, this.f14570l).i(this.f14571m, this.f14567i, this.f14568j).k(this.f14572n).j(this.f14563e, this.f14564f);
    }

    private void a(List<String> list, Map<String, Object> map) throws i5.d {
        Object p10;
        Object p11;
        int n10;
        Object q10 = i5.c.q();
        m.a aVar = m.a.STRING;
        i5.c.c(q10, "localeMatcher", m.c(map, "localeMatcher", aVar, i5.a.f31539a, "best fit"));
        Object c10 = m.c(map, "numberingSystem", aVar, i5.c.d(), i5.c.d());
        if (!i5.c.n(c10) && !b(i5.c.h(c10))) {
            throw new i5.d("Invalid numbering system !");
        }
        i5.c.c(q10, "nu", c10);
        HashMap<String, Object> a10 = l.a(list, q10, Collections.singletonList("nu"));
        a<?> aVar2 = (a) i5.c.g(a10).get("locale");
        this.f14578t = aVar2;
        this.f14579u = aVar2.d();
        Object a11 = i5.c.a(a10, "nu");
        if (!i5.c.j(a11)) {
            this.f14574p = false;
            this.f14575q = i5.c.h(a11);
        } else {
            this.f14574p = true;
            this.f14575q = this.f14573o.a(this.f14578t);
        }
        h(map);
        if (this.f14559a == d.h.CURRENCY) {
            if (Build.VERSION.SDK_INT >= 24) {
                n10 = t.n(this.f14560b);
            } else {
                n10 = s.n(this.f14560b);
            }
            double d10 = n10;
            p10 = i5.c.p(d10);
            p11 = i5.c.p(d10);
        } else {
            p10 = i5.c.p(0.0d);
            p11 = this.f14559a == d.h.PERCENT ? i5.c.p(0.0d) : i5.c.p(3.0d);
        }
        this.f14576r = (d.e) m.d(d.e.class, i5.c.h(m.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, p10, p11);
        Object c11 = m.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f14576r == d.e.COMPACT) {
            this.f14577s = (d.b) m.d(d.b.class, i5.c.h(c11));
        }
        this.f14565g = i5.c.e(m.c(map, "useGrouping", m.a.BOOLEAN, i5.c.d(), i5.c.o(true)));
        this.f14572n = (d.g) m.d(d.g.class, i5.c.h(m.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return i5.b.o(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f14558v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        return indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && c(str.substring(0, indexOf)) && c(str.substring(indexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                sb2.append((char) (charAt - ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    private void g(Map<String, Object> map, Object obj, Object obj2) throws i5.d {
        Object b10 = m.b(map, "minimumIntegerDigits", i5.c.p(1.0d), i5.c.p(21.0d), i5.c.p(1.0d));
        Object a10 = i5.c.a(map, "minimumFractionDigits");
        Object a11 = i5.c.a(map, "maximumFractionDigits");
        Object a12 = i5.c.a(map, "minimumSignificantDigits");
        Object a13 = i5.c.a(map, "maximumSignificantDigits");
        this.f14566h = (int) Math.floor(i5.c.f(b10));
        if (i5.c.n(a12) && i5.c.n(a13)) {
            if (i5.c.n(a10) && i5.c.n(a11)) {
                d.e eVar = this.f14576r;
                if (eVar == d.e.COMPACT) {
                    this.f14571m = d.f.COMPACT_ROUNDING;
                    return;
                } else if (eVar == d.e.ENGINEERING) {
                    this.f14571m = d.f.FRACTION_DIGITS;
                    this.f14568j = 5;
                    return;
                } else {
                    this.f14571m = d.f.FRACTION_DIGITS;
                    this.f14567i = (int) Math.floor(i5.c.f(obj));
                    this.f14568j = (int) Math.floor(i5.c.f(obj2));
                    return;
                }
            }
            this.f14571m = d.f.FRACTION_DIGITS;
            Object a14 = m.a(a10, i5.c.p(0.0d), i5.c.p(20.0d), obj);
            Object a15 = m.a(a11, a14, i5.c.p(20.0d), i5.c.p(Math.max(i5.c.f(a14), i5.c.f(obj2))));
            this.f14567i = (int) Math.floor(i5.c.f(a14));
            this.f14568j = (int) Math.floor(i5.c.f(a15));
            return;
        }
        this.f14571m = d.f.SIGNIFICANT_DIGITS;
        Object a16 = m.a(a12, i5.c.p(1.0d), i5.c.p(21.0d), i5.c.p(1.0d));
        Object a17 = m.a(a13, a16, i5.c.p(21.0d), i5.c.p(21.0d));
        this.f14569k = (int) Math.floor(i5.c.f(a16));
        this.f14570l = (int) Math.floor(i5.c.f(a17));
    }

    private void h(Map<String, Object> map) throws i5.d {
        m.a aVar = m.a.STRING;
        this.f14559a = (d.h) m.d(d.h.class, i5.c.h(m.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object c10 = m.c(map, "currency", aVar, i5.c.d(), i5.c.d());
        if (i5.c.n(c10)) {
            if (this.f14559a == d.h.CURRENCY) {
                throw new i5.d("Expected currency style !");
            }
        } else if (!d(i5.c.h(c10))) {
            throw new i5.d("Malformed currency code !");
        }
        Object c11 = m.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", Analytics.Param.CODE, "name"}, "symbol");
        Object c12 = m.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object c13 = m.c(map, "unit", aVar, i5.c.d(), i5.c.d());
        if (i5.c.n(c13)) {
            if (this.f14559a == d.h.UNIT) {
                throw new i5.d("Expected unit !");
            }
        } else if (!e(i5.c.h(c13))) {
            throw new i5.d("Malformed unit identifier !");
        }
        Object c14 = m.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        d.h hVar = this.f14559a;
        if (hVar == d.h.CURRENCY) {
            this.f14560b = f(i5.c.h(c10));
            this.f14561c = (d.c) m.d(d.c.class, i5.c.h(c11));
            this.f14562d = (d.EnumC0196d) m.d(d.EnumC0196d.class, i5.c.h(c12));
        } else if (hVar == d.h.UNIT) {
            this.f14563e = i5.c.h(c13);
            this.f14564f = (d.i) m.d(d.i.class, i5.c.h(c14));
        }
    }

    @g6.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws i5.d {
        String h10 = i5.c.h(m.c(map, "localeMatcher", m.a.STRING, i5.a.f31539a, "best fit"));
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24 && h10.equals("best fit")) {
            return Arrays.asList(h.d((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(h.h((String[]) list.toArray(strArr)));
    }

    @g6.a
    public String format(double d10) throws i5.d {
        return this.f14573o.c(d10);
    }

    @g6.a
    public List<Map<String, String>> formatToParts(double d10) throws i5.d {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator b10 = this.f14573o.b(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = b10.first(); first != 65535; first = b10.next()) {
            sb2.append(first);
            if (b10.getIndex() + 1 == b10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = b10.getAttributes().keySet().iterator();
                String l10 = it.hasNext() ? this.f14573o.l(it.next(), d10) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", l10);
                hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @g6.a
    public Map<String, Object> resolvedOptions() throws i5.d {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f14579u.g());
        linkedHashMap.put("numberingSystem", this.f14575q);
        linkedHashMap.put("style", this.f14559a.toString());
        d.h hVar = this.f14559a;
        if (hVar == d.h.CURRENCY) {
            linkedHashMap.put("currency", this.f14560b);
            linkedHashMap.put("currencyDisplay", this.f14561c.toString());
            linkedHashMap.put("currencySign", this.f14562d.toString());
        } else if (hVar == d.h.UNIT) {
            linkedHashMap.put("unit", this.f14563e);
            linkedHashMap.put("unitDisplay", this.f14564f.toString());
        }
        int i10 = this.f14566h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        d.f fVar = this.f14571m;
        if (fVar == d.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f14570l;
            if (i11 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f14569k;
            if (i12 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == d.f.FRACTION_DIGITS) {
            int i13 = this.f14567i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f14568j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f14565g));
        linkedHashMap.put("notation", this.f14576r.toString());
        if (this.f14576r == d.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f14577s.toString());
        }
        linkedHashMap.put("signDisplay", this.f14572n.toString());
        return linkedHashMap;
    }
}
