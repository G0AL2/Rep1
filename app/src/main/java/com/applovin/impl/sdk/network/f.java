package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final m f8704a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8705b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8706c;

    /* renamed from: d  reason: collision with root package name */
    private final g f8707d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f8708e;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<h> f8710g;

    /* renamed from: f  reason: collision with root package name */
    private final Object f8709f = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<h> f8711h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private long f8712i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final Set<h> f8713j = new HashSet();

    public f(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8704a = mVar;
        this.f8705b = mVar.A();
        int intValue = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cL)).intValue();
        this.f8706c = intValue;
        if (mVar.aa() != null) {
            this.f8708e = mVar.L().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
            this.f8710g = d();
            this.f8707d = null;
            return;
        }
        g gVar = new g(this, mVar);
        this.f8707d = gVar;
        this.f8710g = gVar.a(intValue);
        gVar.a();
        this.f8708e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final h hVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (v.a()) {
            v vVar = this.f8705b;
            vVar.b("PersistentPostbackManager", "Preparing to submit postback..." + hVar);
        }
        if (this.f8704a.c()) {
            if (v.a()) {
                this.f8705b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        synchronized (this.f8709f) {
            if (this.f8713j.contains(hVar)) {
                if (v.a()) {
                    v vVar2 = this.f8705b;
                    vVar2.b("PersistentPostbackManager", "Skip pending postback: " + hVar.b());
                }
                return;
            }
            hVar.l();
            if (this.f8704a.aa() != null) {
                f();
            } else {
                e();
            }
            int intValue = ((Integer) this.f8704a.a(com.applovin.impl.sdk.c.b.cJ)).intValue();
            if (hVar.k() <= intValue) {
                synchronized (this.f8709f) {
                    this.f8713j.add(hVar);
                }
                this.f8704a.X().dispatchPostbackRequest(i.b(this.f8704a).a(hVar.b()).c(hVar.c()).a(hVar.d()).b(hVar.a()).b(hVar.e()).a(hVar.f() != null ? new JSONObject(hVar.f()) : null).d(hVar.h()).c(hVar.g()).g(hVar.i()).g(hVar.j()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i10) {
                        if (v.a()) {
                            v vVar3 = f.this.f8705b;
                            vVar3.c("PersistentPostbackManager", "Failed to submit postback with errorCode " + i10 + ". Will retry later...  Postback: " + hVar);
                        }
                        f.this.e(hVar);
                        j.a(appLovinPostbackListener, str, i10);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        f.this.d(hVar);
                        if (v.a()) {
                            v vVar3 = f.this.f8705b;
                            vVar3.b("PersistentPostbackManager", "Successfully submitted postback: " + hVar);
                        }
                        f.this.g();
                        j.a(appLovinPostbackListener, str);
                    }
                });
                return;
            }
            if (v.a()) {
                v vVar3 = this.f8705b;
                vVar3.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + hVar);
            }
            d(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h hVar) {
        synchronized (this.f8709f) {
            if (this.f8704a.aa() != null) {
                this.f8710g.add(hVar);
                f();
            } else {
                while (this.f8710g.size() > this.f8706c) {
                    this.f8710g.remove(0);
                }
                this.f8710g.add(hVar);
                e();
            }
            if (v.a()) {
                v vVar = this.f8705b;
                vVar.b("PersistentPostbackManager", "Enqueued postback: " + hVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h hVar) {
        a(hVar, (AppLovinPostbackListener) null);
    }

    private ArrayList<h> d() {
        Set<String> set = (Set) this.f8704a.b(com.applovin.impl.sdk.c.d.f8246p, new LinkedHashSet(0), this.f8708e);
        ArrayList<h> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f8704a.a(com.applovin.impl.sdk.c.b.cJ)).intValue();
        v vVar = this.f8705b;
        vVar.b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                h hVar = new h(new JSONObject(str), this.f8704a);
                if (hVar.k() < intValue) {
                    arrayList.add(hVar);
                } else if (v.a(this.f8704a)) {
                    v vVar2 = this.f8705b;
                    vVar2.b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                }
            } catch (Throwable th) {
                if (v.a(this.f8704a)) {
                    v vVar3 = this.f8705b;
                    vVar3.b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
                }
            }
        }
        if (v.a(this.f8704a)) {
            v vVar4 = this.f8705b;
            vVar4.b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(h hVar) {
        synchronized (this.f8709f) {
            this.f8713j.remove(hVar);
            this.f8710g.remove(hVar);
            if (this.f8704a.aa() != null) {
                f();
            } else {
                e();
            }
        }
        if (v.a()) {
            v vVar = this.f8705b;
            vVar.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + hVar);
        }
    }

    private void e() {
        this.f8712i = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(h hVar) {
        synchronized (this.f8709f) {
            this.f8713j.remove(hVar);
            this.f8711h.add(hVar);
        }
    }

    private void f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f8710g.size());
        Iterator<h> it = this.f8710g.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().n().toString());
            } catch (Throwable th) {
                this.f8705b.b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.f8704a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.f8246p, (com.applovin.impl.sdk.c.d<HashSet>) linkedHashSet, this.f8708e);
        this.f8705b.b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        synchronized (this.f8709f) {
            Iterator<h> it = this.f8711h.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f8711h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f8712i;
    }

    public void a(h hVar) {
        a(hVar, true);
    }

    public void a(h hVar, boolean z10) {
        a(hVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final h hVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(hVar.b())) {
            if (z10) {
                hVar.m();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (f.this.f8709f) {
                        f.this.b(hVar);
                        f.this.a(hVar, appLovinPostbackListener);
                    }
                }
            };
            if (!Utils.isMainThread()) {
                runnable.run();
                return;
            }
            this.f8704a.S().a(new z(this.f8704a, runnable), o.a.POSTBACKS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<h> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8709f) {
            arrayList.ensureCapacity(this.f8710g.size());
            arrayList.addAll(this.f8710g);
        }
        return arrayList;
    }

    public void c() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.f8709f) {
                    if (f.this.f8710g != null) {
                        for (h hVar : new ArrayList(f.this.f8710g)) {
                            f.this.c(hVar);
                        }
                    }
                }
            }
        };
        if (!((Boolean) this.f8704a.a(com.applovin.impl.sdk.c.b.cK)).booleanValue()) {
            runnable.run();
            return;
        }
        this.f8704a.S().a(new z(this.f8704a, runnable), o.a.POSTBACKS);
    }
}
