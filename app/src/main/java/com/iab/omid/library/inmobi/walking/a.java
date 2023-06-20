package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f24221a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0322a> f24222b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f24223c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f24224d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f24225e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f24226f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f24227g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f24228h;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0322a {

        /* renamed from: a  reason: collision with root package name */
        private final com.iab.omid.library.inmobi.b.c f24229a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f24230b = new ArrayList<>();

        public C0322a(com.iab.omid.library.inmobi.b.c cVar, String str) {
            this.f24229a = cVar;
            a(str);
        }

        public com.iab.omid.library.inmobi.b.c a() {
            return this.f24229a;
        }

        public void a(String str) {
            this.f24230b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24230b;
        }
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        for (com.iab.omid.library.inmobi.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.inmobi.b.c cVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0322a c0322a = this.f24222b.get(view);
        if (c0322a != null) {
            c0322a.a(aVar.getAdSessionId());
        } else {
            this.f24222b.put(view, new C0322a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (view.hasWindowFocus()) {
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
            this.f24224d.addAll(hashSet);
            return null;
        }
        return "noWindowFocus";
    }

    public String a(View view) {
        if (this.f24221a.size() == 0) {
            return null;
        }
        String str = this.f24221a.get(view);
        if (str != null) {
            this.f24221a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f24227g.get(str);
    }

    public HashSet<String> a() {
        return this.f24225e;
    }

    public View b(String str) {
        return this.f24223c.get(str);
    }

    public C0322a b(View view) {
        C0322a c0322a = this.f24222b.get(view);
        if (c0322a != null) {
            this.f24222b.remove(view);
        }
        return c0322a;
    }

    public HashSet<String> b() {
        return this.f24226f;
    }

    public c c(View view) {
        return this.f24224d.contains(view) ? c.PARENT_VIEW : this.f24228h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.inmobi.b.a a10 = com.iab.omid.library.inmobi.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : a10.c()) {
                View d10 = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (d10 != null) {
                        String d11 = d(d10);
                        if (d11 == null) {
                            this.f24225e.add(adSessionId);
                            this.f24221a.put(d10, adSessionId);
                            a(aVar);
                        } else {
                            this.f24226f.add(adSessionId);
                            this.f24223c.put(adSessionId, d10);
                            this.f24227g.put(adSessionId, d11);
                        }
                    } else {
                        this.f24226f.add(adSessionId);
                        this.f24227g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f24221a.clear();
        this.f24222b.clear();
        this.f24223c.clear();
        this.f24224d.clear();
        this.f24225e.clear();
        this.f24226f.clear();
        this.f24227g.clear();
        this.f24228h = false;
    }

    public void e() {
        this.f24228h = true;
    }
}
