package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f24335a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0325a> f24336b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f24337c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f24338d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f24339e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f24340f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f24341g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f24342h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0325a {

        /* renamed from: a  reason: collision with root package name */
        private final com.iab.omid.library.ironsrc.b.c f24343a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f24344b = new ArrayList<>();

        public C0325a(com.iab.omid.library.ironsrc.b.c cVar, String str) {
            this.f24343a = cVar;
            a(str);
        }

        public com.iab.omid.library.ironsrc.b.c a() {
            return this.f24343a;
        }

        public void a(String str) {
            this.f24344b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24344b;
        }
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        for (com.iab.omid.library.ironsrc.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.ironsrc.b.c cVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0325a c0325a = this.f24336b.get(view);
        if (c0325a != null) {
            c0325a.a(aVar.getAdSessionId());
        } else {
            this.f24336b.put(view, new C0325a(cVar, aVar.getAdSessionId()));
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
            this.f24338d.addAll(hashSet);
            return null;
        }
        return "noWindowFocus";
    }

    public String a(View view) {
        if (this.f24335a.size() == 0) {
            return null;
        }
        String str = this.f24335a.get(view);
        if (str != null) {
            this.f24335a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f24341g.get(str);
    }

    public HashSet<String> a() {
        return this.f24339e;
    }

    public View b(String str) {
        return this.f24337c.get(str);
    }

    public C0325a b(View view) {
        C0325a c0325a = this.f24336b.get(view);
        if (c0325a != null) {
            this.f24336b.remove(view);
        }
        return c0325a;
    }

    public HashSet<String> b() {
        return this.f24340f;
    }

    public c c(View view) {
        return this.f24338d.contains(view) ? c.PARENT_VIEW : this.f24342h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.ironsrc.b.a a10 = com.iab.omid.library.ironsrc.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : a10.c()) {
                View d10 = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (d10 != null) {
                        String d11 = d(d10);
                        if (d11 == null) {
                            this.f24339e.add(adSessionId);
                            this.f24335a.put(d10, adSessionId);
                            a(aVar);
                        } else {
                            this.f24340f.add(adSessionId);
                            this.f24337c.put(adSessionId, d10);
                            this.f24341g.put(adSessionId, d11);
                        }
                    } else {
                        this.f24340f.add(adSessionId);
                        this.f24341g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f24335a.clear();
        this.f24336b.clear();
        this.f24337c.clear();
        this.f24338d.clear();
        this.f24339e.clear();
        this.f24340f.clear();
        this.f24341g.clear();
        this.f24342h = false;
    }

    public void e() {
        this.f24342h = true;
    }
}
