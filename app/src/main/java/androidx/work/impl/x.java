package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public class x extends androidx.work.t {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4700j = androidx.work.l.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f4701a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4702b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.f f4703c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends androidx.work.x> f4704d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f4705e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f4706f;

    /* renamed from: g  reason: collision with root package name */
    private final List<x> f4707g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4708h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.o f4709i;

    public x(e0 e0Var, List<? extends androidx.work.x> list) {
        this(e0Var, null, androidx.work.f.KEEP, list, null);
    }

    private static boolean i(x xVar, Set<String> set) {
        set.addAll(xVar.c());
        Set<String> l10 = l(xVar);
        for (String str : set) {
            if (l10.contains(str)) {
                return true;
            }
        }
        List<x> e10 = xVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (x xVar2 : e10) {
                if (i(xVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set<String> l(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> e10 = xVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (x xVar2 : e10) {
                hashSet.addAll(xVar2.c());
            }
        }
        return hashSet;
    }

    public androidx.work.o a() {
        if (!this.f4708h) {
            p1.c cVar = new p1.c(this);
            this.f4701a.t().c(cVar);
            this.f4709i = cVar.d();
        } else {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4700j;
            e10.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f4705e) + ")");
        }
        return this.f4709i;
    }

    public androidx.work.f b() {
        return this.f4703c;
    }

    public List<String> c() {
        return this.f4705e;
    }

    public String d() {
        return this.f4702b;
    }

    public List<x> e() {
        return this.f4707g;
    }

    public List<? extends androidx.work.x> f() {
        return this.f4704d;
    }

    public e0 g() {
        return this.f4701a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f4708h;
    }

    public void k() {
        this.f4708h = true;
    }

    public x(e0 e0Var, String str, androidx.work.f fVar, List<? extends androidx.work.x> list) {
        this(e0Var, str, fVar, list, null);
    }

    public x(e0 e0Var, String str, androidx.work.f fVar, List<? extends androidx.work.x> list, List<x> list2) {
        this.f4701a = e0Var;
        this.f4702b = str;
        this.f4703c = fVar;
        this.f4704d = list;
        this.f4707g = list2;
        this.f4705e = new ArrayList(list.size());
        this.f4706f = new ArrayList();
        if (list2 != null) {
            for (x xVar : list2) {
                this.f4706f.addAll(xVar.f4706f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String b10 = list.get(i10).b();
            this.f4705e.add(b10);
            this.f4706f.add(b10);
        }
    }
}
