package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@g6.a
/* loaded from: classes.dex */
public class DateTimeFormat {

    /* renamed from: a  reason: collision with root package name */
    c f14539a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14542d;

    /* renamed from: e  reason: collision with root package name */
    private String f14543e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14544f;

    /* renamed from: g  reason: collision with root package name */
    private String f14545g;

    /* renamed from: h  reason: collision with root package name */
    private c.f f14546h;

    /* renamed from: i  reason: collision with root package name */
    private c.d f14547i;

    /* renamed from: j  reason: collision with root package name */
    private c.k f14548j;

    /* renamed from: k  reason: collision with root package name */
    private c.EnumC0195c f14549k;

    /* renamed from: l  reason: collision with root package name */
    private c.l f14550l;

    /* renamed from: m  reason: collision with root package name */
    private c.h f14551m;

    /* renamed from: n  reason: collision with root package name */
    private c.b f14552n;

    /* renamed from: o  reason: collision with root package name */
    private c.e f14553o;

    /* renamed from: p  reason: collision with root package name */
    private c.g f14554p;

    /* renamed from: q  reason: collision with root package name */
    private c.i f14555q;

    /* renamed from: r  reason: collision with root package name */
    private c.j f14556r;

    /* renamed from: b  reason: collision with root package name */
    private a<?> f14540b = null;

    /* renamed from: c  reason: collision with root package name */
    private a<?> f14541c = null;

    /* renamed from: s  reason: collision with root package name */
    private Object f14557s = null;

    @g6.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws i5.d {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14539a = new r();
        } else {
            this.f14539a = new q();
        }
        c(list, map);
        this.f14539a.g(this.f14540b, this.f14542d ? "" : this.f14543e, this.f14544f ? "" : this.f14545g, this.f14547i, this.f14548j, this.f14549k, this.f14550l, this.f14551m, this.f14552n, this.f14553o, this.f14554p, this.f14555q, this.f14556r, this.f14546h, this.f14557s);
    }

    private Object a() throws i5.d {
        return this.f14539a.d(this.f14540b);
    }

    private Object b(Object obj, String str, String str2) throws i5.d {
        if (i5.c.l(obj)) {
            boolean z10 = true;
            if (str.equals("date") || str.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i10 = 0; i10 < 4; i10++) {
                    if (!i5.c.n(i5.c.a(obj, strArr[i10]))) {
                        z10 = false;
                    }
                }
            }
            if (str.equals("time") || str.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i11 = 0; i11 < 3; i11++) {
                    if (!i5.c.n(i5.c.a(obj, strArr2[i11]))) {
                        z10 = false;
                    }
                }
            }
            if (z10 && (str2.equals("date") || str2.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i12 = 0; i12 < 3; i12++) {
                    i5.c.c(obj, strArr3[i12], "numeric");
                }
            }
            if (z10 && (str2.equals("time") || str2.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i13 = 0; i13 < 3; i13++) {
                    i5.c.c(obj, strArr4[i13], "numeric");
                }
            }
            return obj;
        }
        throw new i5.d("Invalid options object !");
    }

    private void c(List<String> list, Map<String, Object> map) throws i5.d {
        Object e10;
        List asList = Arrays.asList("ca", "nu", "hc");
        Object b10 = b(map, "any", "date");
        Object q10 = i5.c.q();
        m.a aVar = m.a.STRING;
        i5.c.c(q10, "localeMatcher", m.c(b10, "localeMatcher", aVar, i5.a.f31539a, "best fit"));
        Object c10 = m.c(b10, "calendar", aVar, i5.c.d(), i5.c.d());
        if (!i5.c.n(c10) && !d(i5.c.h(c10))) {
            throw new i5.d("Invalid calendar option !");
        }
        i5.c.c(q10, "ca", c10);
        Object c11 = m.c(b10, "numberingSystem", aVar, i5.c.d(), i5.c.d());
        if (!i5.c.n(c11) && !d(i5.c.h(c11))) {
            throw new i5.d("Invalid numbering system !");
        }
        i5.c.c(q10, "nu", c11);
        Object c12 = m.c(b10, "hour12", m.a.BOOLEAN, i5.c.d(), i5.c.d());
        Object c13 = m.c(b10, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, i5.c.d());
        if (!i5.c.n(c12)) {
            c13 = i5.c.b();
        }
        i5.c.c(q10, "hc", c13);
        HashMap<String, Object> a10 = l.a(list, q10, asList);
        a<?> aVar2 = (a) i5.c.g(a10).get("locale");
        this.f14540b = aVar2;
        this.f14541c = aVar2.d();
        Object a11 = i5.c.a(a10, "ca");
        if (!i5.c.j(a11)) {
            this.f14542d = false;
            this.f14543e = i5.c.h(a11);
        } else {
            this.f14542d = true;
            this.f14543e = this.f14539a.f(this.f14540b);
        }
        Object a12 = i5.c.a(a10, "nu");
        if (!i5.c.j(a12)) {
            this.f14544f = false;
            this.f14545g = i5.c.h(a12);
        } else {
            this.f14544f = true;
            this.f14545g = this.f14539a.a(this.f14540b);
        }
        Object a13 = i5.c.a(a10, "hc");
        Object a14 = i5.c.a(b10, "timeZone");
        if (i5.c.n(a14)) {
            e10 = a();
        } else {
            e10 = e(a14.toString());
        }
        this.f14557s = e10;
        this.f14547i = (c.d) m.d(c.d.class, i5.c.h(m.c(b10, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f14548j = (c.k) m.d(c.k.class, m.c(b10, "weekday", aVar, new String[]{"long", "short", "narrow"}, i5.c.d()));
        this.f14549k = (c.EnumC0195c) m.d(c.EnumC0195c.class, m.c(b10, "era", aVar, new String[]{"long", "short", "narrow"}, i5.c.d()));
        this.f14550l = (c.l) m.d(c.l.class, m.c(b10, "year", aVar, new String[]{"numeric", "2-digit"}, i5.c.d()));
        this.f14551m = (c.h) m.d(c.h.class, m.c(b10, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, i5.c.d()));
        this.f14552n = (c.b) m.d(c.b.class, m.c(b10, "day", aVar, new String[]{"numeric", "2-digit"}, i5.c.d()));
        Object c14 = m.c(b10, "hour", aVar, new String[]{"numeric", "2-digit"}, i5.c.d());
        this.f14553o = (c.e) m.d(c.e.class, c14);
        this.f14554p = (c.g) m.d(c.g.class, m.c(b10, "minute", aVar, new String[]{"numeric", "2-digit"}, i5.c.d()));
        this.f14555q = (c.i) m.d(c.i.class, m.c(b10, "second", aVar, new String[]{"numeric", "2-digit"}, i5.c.d()));
        this.f14556r = (c.j) m.d(c.j.class, m.c(b10, "timeZoneName", aVar, new String[]{"long", "short"}, i5.c.d()));
        if (i5.c.n(c14)) {
            this.f14546h = c.f.UNDEFINED;
            return;
        }
        c.f h10 = this.f14539a.h(this.f14540b);
        c.f fVar = i5.c.j(a13) ? h10 : (c.f) m.d(c.f.class, a13);
        if (!i5.c.n(c12)) {
            if (i5.c.e(c12)) {
                fVar = c.f.H11;
                if (h10 != fVar && h10 != c.f.H23) {
                    fVar = c.f.H12;
                }
            } else {
                fVar = (h10 == c.f.H11 || h10 == c.f.H23) ? c.f.H23 : c.f.H24;
            }
        }
        this.f14546h = fVar;
    }

    private boolean d(String str) {
        return i5.b.o(str, 0, str.length() - 1);
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

    public String e(String str) throws i5.d {
        String[] availableIDs;
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new i5.d("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                sb2.append((char) (charAt + ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @g6.a
    public String format(double d10) throws i5.d {
        return this.f14539a.c(d10);
    }

    @g6.a
    public List<Map<String, String>> formatToParts(double d10) throws i5.d {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator b10 = this.f14539a.b(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = b10.first(); first != 65535; first = b10.next()) {
            sb2.append(first);
            if (b10.getIndex() + 1 == b10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = b10.getAttributes().keySet().iterator();
                String e10 = it.hasNext() ? this.f14539a.e(it.next(), sb2.toString()) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", e10);
                hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @g6.a
    public Map<String, Object> resolvedOptions() throws i5.d {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f14541c.g());
        linkedHashMap.put("numberingSystem", this.f14545g);
        linkedHashMap.put("calendar", this.f14543e);
        linkedHashMap.put("timeZone", this.f14557s);
        c.f fVar = this.f14546h;
        if (fVar != c.f.UNDEFINED) {
            linkedHashMap.put("hourCycle", fVar.toString());
            c.f fVar2 = this.f14546h;
            if (fVar2 != c.f.H11 && fVar2 != c.f.H12) {
                linkedHashMap.put("hour12", Boolean.FALSE);
            } else {
                linkedHashMap.put("hour12", Boolean.TRUE);
            }
        }
        c.k kVar = this.f14548j;
        if (kVar != c.k.UNDEFINED) {
            linkedHashMap.put("weekday", kVar.toString());
        }
        c.EnumC0195c enumC0195c = this.f14549k;
        if (enumC0195c != c.EnumC0195c.UNDEFINED) {
            linkedHashMap.put("era", enumC0195c.toString());
        }
        c.l lVar = this.f14550l;
        if (lVar != c.l.UNDEFINED) {
            linkedHashMap.put("year", lVar.toString());
        }
        c.h hVar = this.f14551m;
        if (hVar != c.h.UNDEFINED) {
            linkedHashMap.put("month", hVar.toString());
        }
        c.b bVar = this.f14552n;
        if (bVar != c.b.UNDEFINED) {
            linkedHashMap.put("day", bVar.toString());
        }
        c.e eVar = this.f14553o;
        if (eVar != c.e.UNDEFINED) {
            linkedHashMap.put("hour", eVar.toString());
        }
        c.g gVar = this.f14554p;
        if (gVar != c.g.UNDEFINED) {
            linkedHashMap.put("minute", gVar.toString());
        }
        c.i iVar = this.f14555q;
        if (iVar != c.i.UNDEFINED) {
            linkedHashMap.put("second", iVar.toString());
        }
        c.j jVar = this.f14556r;
        if (jVar != c.j.UNDEFINED) {
            linkedHashMap.put("timeZoneName", jVar.toString());
        }
        return linkedHashMap;
    }
}
