package com.facebook.hermes.intl;

import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@g6.a
/* loaded from: classes.dex */
public class Collator {

    /* renamed from: a  reason: collision with root package name */
    private b.d f14530a;

    /* renamed from: b  reason: collision with root package name */
    private b.c f14531b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14532c;

    /* renamed from: d  reason: collision with root package name */
    private String f14533d = "default";

    /* renamed from: e  reason: collision with root package name */
    private boolean f14534e;

    /* renamed from: f  reason: collision with root package name */
    private b.EnumC0194b f14535f;

    /* renamed from: g  reason: collision with root package name */
    private a<?> f14536g;

    /* renamed from: h  reason: collision with root package name */
    private a<?> f14537h;

    /* renamed from: i  reason: collision with root package name */
    private b f14538i;

    @g6.a
    public Collator(List<String> list, Map<String, Object> map) throws i5.d {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14538i = new p();
        } else {
            this.f14538i = new o();
        }
        a(list, map);
        this.f14538i.d(this.f14536g).f(this.f14534e).e(this.f14535f).g(this.f14531b).c(this.f14532c);
    }

    private void a(List<String> list, Map<String, Object> map) throws i5.d {
        m.a aVar = m.a.STRING;
        this.f14530a = (b.d) m.d(b.d.class, i5.c.h(m.c(map, "usage", aVar, i5.a.f31542d, "sort")));
        Object q10 = i5.c.q();
        i5.c.c(q10, "localeMatcher", m.c(map, "localeMatcher", aVar, i5.a.f31539a, "best fit"));
        Object c10 = m.c(map, "numeric", m.a.BOOLEAN, i5.c.d(), i5.c.d());
        if (!i5.c.n(c10)) {
            c10 = i5.c.r(String.valueOf(i5.c.e(c10)));
        }
        i5.c.c(q10, "kn", c10);
        i5.c.c(q10, "kf", m.c(map, "caseFirst", aVar, i5.a.f31541c, i5.c.d()));
        HashMap<String, Object> a10 = l.a(list, q10, Arrays.asList("co", "kf", "kn"));
        a<?> aVar2 = (a) i5.c.g(a10).get("locale");
        this.f14536g = aVar2;
        this.f14537h = aVar2.d();
        Object a11 = i5.c.a(a10, "co");
        if (i5.c.j(a11)) {
            a11 = i5.c.r("default");
        }
        this.f14533d = i5.c.h(a11);
        Object a12 = i5.c.a(a10, "kn");
        if (i5.c.j(a12)) {
            this.f14534e = false;
        } else {
            this.f14534e = Boolean.parseBoolean(i5.c.h(a12));
        }
        Object a13 = i5.c.a(a10, "kf");
        if (i5.c.j(a13)) {
            a13 = i5.c.r("false");
        }
        this.f14535f = (b.EnumC0194b) m.d(b.EnumC0194b.class, i5.c.h(a13));
        if (this.f14530a == b.d.SEARCH) {
            ArrayList<String> b10 = this.f14536g.b("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = b10.iterator();
            while (it.hasNext()) {
                arrayList.add(u.e(it.next()));
            }
            arrayList.add(u.e(AppLovinEventTypes.USER_EXECUTED_SEARCH));
            this.f14536g.f("co", arrayList);
        }
        Object c11 = m.c(map, "sensitivity", m.a.STRING, i5.a.f31540b, i5.c.d());
        if (!i5.c.n(c11)) {
            this.f14531b = (b.c) m.d(b.c.class, i5.c.h(c11));
        } else if (this.f14530a == b.d.SORT) {
            this.f14531b = b.c.VARIANT;
        } else {
            this.f14531b = b.c.LOCALE;
        }
        this.f14532c = i5.c.e(m.c(map, "ignorePunctuation", m.a.BOOLEAN, i5.c.d(), Boolean.FALSE));
    }

    @g6.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws i5.d {
        String h10 = i5.c.h(m.c(map, "localeMatcher", m.a.STRING, i5.a.f31539a, "best fit"));
        if (Build.VERSION.SDK_INT >= 24 && h10.equals("best fit")) {
            return Arrays.asList(h.d((String[]) list.toArray(new String[list.size()])));
        }
        return Arrays.asList(h.h((String[]) list.toArray(new String[list.size()])));
    }

    @g6.a
    public double compare(String str, String str2) {
        return this.f14538i.a(str, str2);
    }

    @g6.a
    public Map<String, Object> resolvedOptions() throws i5.d {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f14537h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f14530a.toString());
        b.c cVar = this.f14531b;
        if (cVar == b.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f14538i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f14532c));
        linkedHashMap.put("collation", this.f14533d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f14534e));
        linkedHashMap.put("caseFirst", this.f14535f.toString());
        return linkedHashMap;
    }
}
