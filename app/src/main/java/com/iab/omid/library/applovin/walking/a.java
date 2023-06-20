package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f23989a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0316a> f23990b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f23991c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f23992d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f23993e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f23994f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f23995g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f23996h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f23997i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0316a {

        /* renamed from: a  reason: collision with root package name */
        private final com.iab.omid.library.applovin.b.c f24001a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f24002b = new ArrayList<>();

        public C0316a(com.iab.omid.library.applovin.b.c cVar, String str) {
            this.f24001a = cVar;
            a(str);
        }

        public com.iab.omid.library.applovin.b.c a() {
            return this.f24001a;
        }

        public void a(String str) {
            this.f24002b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24002b;
        }
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (com.iab.omid.library.applovin.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.applovin.b.c cVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0316a c0316a = this.f23990b.get(view);
        if (c0316a != null) {
            c0316a.a(aVar.getAdSessionId());
        } else {
            this.f23990b.put(view, new C0316a(cVar, aVar.getAdSessionId()));
        }
    }

    private String e(View view) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            if (f(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String e10 = f.e(view);
                if (e10 != null) {
                    return e10;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f23992d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f23996h.remove(view);
            return Boolean.FALSE;
        } else if (this.f23996h.containsKey(view)) {
            return this.f23996h.get(view);
        } else {
            Map<View, Boolean> map = this.f23996h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public String a(View view) {
        if (this.f23989a.size() == 0) {
            return null;
        }
        String str = this.f23989a.get(view);
        if (str != null) {
            this.f23989a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f23995g.get(str);
    }

    public HashSet<String> a() {
        return this.f23993e;
    }

    public View b(String str) {
        return this.f23991c.get(str);
    }

    public C0316a b(View view) {
        C0316a c0316a = this.f23990b.get(view);
        if (c0316a != null) {
            this.f23990b.remove(view);
        }
        return c0316a;
    }

    public HashSet<String> b() {
        return this.f23994f;
    }

    public c c(View view) {
        return this.f23992d.contains(view) ? c.PARENT_VIEW : this.f23997i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.applovin.b.a a10 = com.iab.omid.library.applovin.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : a10.c()) {
                View e10 = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (e10 != null) {
                        String e11 = e(e10);
                        if (e11 == null) {
                            this.f23993e.add(adSessionId);
                            this.f23989a.put(e10, adSessionId);
                            a(aVar);
                        } else if (e11 != "noWindowFocus") {
                            this.f23994f.add(adSessionId);
                            this.f23991c.put(adSessionId, e10);
                            this.f23995g.put(adSessionId, e11);
                        }
                    } else {
                        this.f23994f.add(adSessionId);
                        this.f23995g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f23989a.clear();
        this.f23990b.clear();
        this.f23991c.clear();
        this.f23992d.clear();
        this.f23993e.clear();
        this.f23994f.clear();
        this.f23995g.clear();
        this.f23997i = false;
    }

    public boolean d(View view) {
        if (this.f23996h.containsKey(view)) {
            this.f23996h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public void e() {
        this.f23997i = true;
    }
}
