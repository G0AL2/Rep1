package com.iab.omid.library.fyber.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.fyber.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f24107a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0319a> f24108b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f24109c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f24110d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f24111e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f24112f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f24113g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f24114h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f24115i;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0319a {

        /* renamed from: a  reason: collision with root package name */
        private final com.iab.omid.library.fyber.b.c f24116a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f24117b = new ArrayList<>();

        public C0319a(com.iab.omid.library.fyber.b.c cVar, String str) {
            this.f24116a = cVar;
            a(str);
        }

        public com.iab.omid.library.fyber.b.c a() {
            return this.f24116a;
        }

        public void a(String str) {
            this.f24117b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24117b;
        }
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        for (com.iab.omid.library.fyber.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.fyber.b.c cVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0319a c0319a = this.f24108b.get(view);
        if (c0319a != null) {
            c0319a.a(aVar.getAdSessionId());
        } else {
            this.f24108b.put(view, new C0319a(cVar, aVar.getAdSessionId()));
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
            this.f24110d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f24114h.remove(view);
            return Boolean.FALSE;
        } else if (this.f24114h.containsKey(view)) {
            return this.f24114h.get(view);
        } else {
            Map<View, Boolean> map = this.f24114h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public String a(View view) {
        if (this.f24107a.size() == 0) {
            return null;
        }
        String str = this.f24107a.get(view);
        if (str != null) {
            this.f24107a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f24113g.get(str);
    }

    public HashSet<String> a() {
        return this.f24111e;
    }

    public View b(String str) {
        return this.f24109c.get(str);
    }

    public C0319a b(View view) {
        C0319a c0319a = this.f24108b.get(view);
        if (c0319a != null) {
            this.f24108b.remove(view);
        }
        return c0319a;
    }

    public HashSet<String> b() {
        return this.f24112f;
    }

    public c c(View view) {
        return this.f24110d.contains(view) ? c.PARENT_VIEW : this.f24115i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.fyber.b.a a10 = com.iab.omid.library.fyber.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : a10.c()) {
                View e10 = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (e10 != null) {
                        String e11 = e(e10);
                        if (e11 == null) {
                            this.f24111e.add(adSessionId);
                            this.f24107a.put(e10, adSessionId);
                            a(aVar);
                        } else if (e11 != "noWindowFocus") {
                            this.f24112f.add(adSessionId);
                            this.f24109c.put(adSessionId, e10);
                            this.f24113g.put(adSessionId, e11);
                        }
                    } else {
                        this.f24112f.add(adSessionId);
                        this.f24113g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f24107a.clear();
        this.f24108b.clear();
        this.f24109c.clear();
        this.f24110d.clear();
        this.f24111e.clear();
        this.f24112f.clear();
        this.f24113g.clear();
        this.f24115i = false;
    }

    public boolean d(View view) {
        if (this.f24114h.containsKey(view)) {
            this.f24114h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public void e() {
        this.f24115i = true;
    }
}
