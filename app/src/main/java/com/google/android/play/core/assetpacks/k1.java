package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: g  reason: collision with root package name */
    private static final cb.e f22891g = new cb.e("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22892a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.d0<d3> f22893b;

    /* renamed from: c  reason: collision with root package name */
    private final w0 f22894c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.d0<Executor> f22895d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, h1> f22896e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f22897f = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(a0 a0Var, cb.d0<d3> d0Var, w0 w0Var, cb.d0<Executor> d0Var2) {
        this.f22892a = a0Var;
        this.f22893b = d0Var;
        this.f22894c = w0Var;
        this.f22895d = d0Var2;
    }

    private final <T> T a(j1<T> j1Var) {
        try {
            b();
            return j1Var.a();
        } finally {
            f();
        }
    }

    private final Map<String, h1> o(List<String> list) {
        return (Map) a(new j1(this, list) { // from class: com.google.android.play.core.assetpacks.c1

            /* renamed from: a  reason: collision with root package name */
            private final k1 f22782a;

            /* renamed from: b  reason: collision with root package name */
            private final List f22783b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22782a = this;
                this.f22783b = list;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                return this.f22782a.l(this.f22783b);
            }
        });
    }

    private final h1 q(int i10) {
        Map<Integer, h1> map = this.f22896e;
        Integer valueOf = Integer.valueOf(i10);
        h1 h1Var = map.get(valueOf);
        if (h1Var != null) {
            return h1Var;
        }
        throw new s0(String.format("Could not find session %d while trying to get it", valueOf), i10);
    }

    private static String r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new s0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static <T> List<T> s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f22897f.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i10) {
        a(new j1(this, i10) { // from class: com.google.android.play.core.assetpacks.e1

            /* renamed from: a  reason: collision with root package name */
            private final k1 f22809a;

            /* renamed from: b  reason: collision with root package name */
            private final int f22810b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22809a = this;
                this.f22810b = i10;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                this.f22809a.m(this.f22810b);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, int i10, long j10) {
        a(new j1(this, str, i10, j10) { // from class: com.google.android.play.core.assetpacks.b1

            /* renamed from: a  reason: collision with root package name */
            private final k1 f22774a;

            /* renamed from: b  reason: collision with root package name */
            private final String f22775b;

            /* renamed from: c  reason: collision with root package name */
            private final int f22776c;

            /* renamed from: d  reason: collision with root package name */
            private final long f22777d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22774a = this;
                this.f22775b = str;
                this.f22776c = i10;
                this.f22777d = j10;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                this.f22774a.h(this.f22775b, this.f22776c, this.f22777d);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(Bundle bundle) {
        return ((Boolean) a(new j1(this, bundle) { // from class: com.google.android.play.core.assetpacks.z0

            /* renamed from: a  reason: collision with root package name */
            private final k1 f23110a;

            /* renamed from: b  reason: collision with root package name */
            private final Bundle f23111b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f23110a = this;
                this.f23111b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                return this.f23110a.n(this.f23111b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.f22897f.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i10) {
        q(i10).f22856c.f22839c = 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, int i10, long j10) {
        h1 h1Var = o(Arrays.asList(str)).get(str);
        if (h1Var == null || u1.f(h1Var.f22856c.f22839c)) {
            f22891g.e(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f22892a.A(str, i10, j10);
        h1Var.f22856c.f22839c = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(Bundle bundle) {
        return ((Boolean) a(new j1(this, bundle) { // from class: com.google.android.play.core.assetpacks.a1

            /* renamed from: a  reason: collision with root package name */
            private final k1 f22767a;

            /* renamed from: b  reason: collision with root package name */
            private final Bundle f22768b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22767a = this;
                this.f22768b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                return this.f22767a.j(this.f22768b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean j(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, h1> map = this.f22896e;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            h1 h1Var = this.f22896e.get(valueOf);
            if (h1Var.f22856c.f22839c == 6) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(!u1.d(h1Var.f22856c.f22839c, bundle.getInt(cb.h0.a("status", r(bundle)))));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, h1> k() {
        return this.f22896e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map l(List list) {
        HashMap hashMap = new HashMap();
        for (h1 h1Var : this.f22896e.values()) {
            String str = h1Var.f22856c.f22837a;
            if (list.contains(str)) {
                h1 h1Var2 = (h1) hashMap.get(str);
                if ((h1Var2 == null ? -1 : h1Var2.f22854a) < h1Var.f22854a) {
                    hashMap.put(str, h1Var);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(int i10) {
        h1 q10 = q(i10);
        if (!u1.f(q10.f22856c.f22839c)) {
            throw new s0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
        }
        a0 a0Var = this.f22892a;
        g1 g1Var = q10.f22856c;
        a0Var.A(g1Var.f22837a, q10.f22855b, g1Var.f22838b);
        g1 g1Var2 = q10.f22856c;
        int i11 = g1Var2.f22839c;
        if (i11 == 5 || i11 == 6) {
            this.f22892a.t(g1Var2.f22837a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean n(Bundle bundle) {
        i1 i1Var;
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, h1> map = this.f22896e;
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = false;
        if (map.containsKey(valueOf)) {
            h1 q10 = q(i10);
            int i11 = bundle.getInt(cb.h0.a("status", q10.f22856c.f22837a));
            if (u1.d(q10.f22856c.f22839c, i11)) {
                f22891g.c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q10.f22856c.f22839c));
                g1 g1Var = q10.f22856c;
                String str = g1Var.f22837a;
                int i12 = g1Var.f22839c;
                if (i12 == 4) {
                    this.f22893b.a().a(i10, str);
                } else if (i12 == 5) {
                    this.f22893b.a().a(i10);
                } else if (i12 == 6) {
                    this.f22893b.a().a(Arrays.asList(str));
                }
            } else {
                q10.f22856c.f22839c = i11;
                if (u1.f(i11)) {
                    c(i10);
                    this.f22894c.b(q10.f22856c.f22837a);
                } else {
                    List<i1> list = q10.f22856c.f22841e;
                    int size = list.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        i1 i1Var2 = list.get(i13);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(cb.h0.b("chunk_intents", q10.f22856c.f22837a, i1Var2.f22868a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    i1Var2.f22871d.get(i14).f22827a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r10 = r(bundle);
            long j10 = bundle.getLong(cb.h0.a("pack_version", r10));
            int i15 = bundle.getInt(cb.h0.a("status", r10));
            long j11 = bundle.getLong(cb.h0.a("total_bytes_to_download", r10));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(cb.h0.a("slice_ids", r10));
            ArrayList arrayList = new ArrayList();
            Iterator it = s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(cb.h0.b("chunk_intents", r10, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : s(parcelableArrayList2)) {
                    Iterator it2 = it;
                    if (intent != null) {
                        z10 = true;
                    }
                    arrayList2.add(new f1(z10));
                    it = it2;
                    z10 = false;
                }
                Iterator it3 = it;
                String string = bundle.getString(cb.h0.b("uncompressed_hash_sha256", r10, str2));
                long j12 = bundle.getLong(cb.h0.b("uncompressed_size", r10, str2));
                int i16 = bundle.getInt(cb.h0.b("patch_format", r10, str2), 0);
                if (i16 != 0) {
                    i1Var = new i1(str2, string, j12, arrayList2, 0, i16);
                    z10 = false;
                } else {
                    z10 = false;
                    i1Var = new i1(str2, string, j12, arrayList2, bundle.getInt(cb.h0.b("compression_format", r10, str2), 0), 0);
                }
                arrayList.add(i1Var);
                it = it3;
            }
            this.f22896e.put(Integer.valueOf(i10), new h1(i10, bundle.getInt("app_version_code"), new g1(r10, j10, i15, j11, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i10) {
        a(new j1(this, i10) { // from class: com.google.android.play.core.assetpacks.d1

            /* renamed from: a  reason: collision with root package name */
            private final k1 f22796a;

            /* renamed from: b  reason: collision with root package name */
            private final int f22797b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22796a = this;
                this.f22797b = i10;
            }

            @Override // com.google.android.play.core.assetpacks.j1
            public final Object a() {
                this.f22796a.g(this.f22797b);
                return null;
            }
        });
    }
}
