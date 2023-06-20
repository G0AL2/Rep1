package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import dd.n;
import dd.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ob.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    private final Context f23597a;

    /* renamed from: b */
    private final pb.c f23598b;

    /* renamed from: c */
    private final Executor f23599c;

    /* renamed from: d */
    private final com.google.firebase.remoteconfig.internal.d f23600d;

    /* renamed from: e */
    private final com.google.firebase.remoteconfig.internal.d f23601e;

    /* renamed from: f */
    private final com.google.firebase.remoteconfig.internal.d f23602f;

    /* renamed from: g */
    private final j f23603g;

    /* renamed from: h */
    private final l f23604h;

    /* renamed from: i */
    private final m f23605i;

    /* renamed from: j */
    private final tc.d f23606j;

    public a(Context context, e eVar, tc.d dVar, pb.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.d dVar2, com.google.firebase.remoteconfig.internal.d dVar3, com.google.firebase.remoteconfig.internal.d dVar4, j jVar, l lVar, m mVar) {
        this.f23597a = context;
        this.f23606j = dVar;
        this.f23598b = cVar;
        this.f23599c = executor;
        this.f23600d = dVar2;
        this.f23601e = dVar3;
        this.f23602f = dVar4;
        this.f23603g = jVar;
        this.f23604h = lVar;
        this.f23605i = mVar;
    }

    public /* synthetic */ Void A(b bVar) throws Exception {
        this.f23605i.j(bVar);
        return null;
    }

    public static /* synthetic */ Task B(com.google.firebase.remoteconfig.internal.e eVar) throws Exception {
        return Tasks.forResult(null);
    }

    public boolean C(Task<com.google.firebase.remoteconfig.internal.e> task) {
        if (task.isSuccessful()) {
            this.f23600d.d();
            if (task.getResult() != null) {
                K(task.getResult().c());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    private Task<Void> H(Map<String, String> map) {
        try {
            return this.f23602f.k(com.google.firebase.remoteconfig.internal.e.g().b(map).a()).onSuccessTask(new SuccessContinuation() { // from class: dd.e
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return com.google.firebase.remoteconfig.a.e((com.google.firebase.remoteconfig.internal.e) obj);
                }
            });
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return Tasks.forResult(null);
        }
    }

    static List<Map<String, String>> J(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ Void b(a aVar, b bVar) {
        return aVar.A(bVar);
    }

    public static /* synthetic */ Void d(a aVar) {
        return aVar.z();
    }

    public static /* synthetic */ Task e(com.google.firebase.remoteconfig.internal.e eVar) {
        return B(eVar);
    }

    public static /* synthetic */ Task f(a aVar, Void r12) {
        return aVar.y(r12);
    }

    public static /* synthetic */ Task g(a aVar, Task task, Task task2, Task task3) {
        return aVar.u(task, task2, task3);
    }

    public static /* synthetic */ n h(Task task, Task task2) {
        return v(task, task2);
    }

    public static /* synthetic */ boolean i(a aVar, Task task) {
        return aVar.C(task);
    }

    public static a q() {
        return r(e.n());
    }

    public static a r(e eVar) {
        return ((d) eVar.j(d.class)).e();
    }

    private static boolean t(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return eVar2 == null || !eVar.e().equals(eVar2.e());
    }

    public /* synthetic */ Task u(Task task, Task task2, Task task3) throws Exception {
        if (task.isSuccessful() && task.getResult() != null) {
            com.google.firebase.remoteconfig.internal.e eVar = (com.google.firebase.remoteconfig.internal.e) task.getResult();
            if (task2.isSuccessful() && !t(eVar, (com.google.firebase.remoteconfig.internal.e) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f23601e.k(eVar).continueWith(this.f23599c, new Continuation() { // from class: dd.b
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(com.google.firebase.remoteconfig.a.i(com.google.firebase.remoteconfig.a.this, task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    public static /* synthetic */ n v(Task task, Task task2) throws Exception {
        return (n) task.getResult();
    }

    public static /* synthetic */ Task w(j.a aVar) throws Exception {
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task x(j.a aVar) throws Exception {
        return Tasks.forResult(null);
    }

    public /* synthetic */ Task y(Void r12) throws Exception {
        return j();
    }

    public /* synthetic */ Void z() throws Exception {
        this.f23601e.d();
        this.f23600d.d();
        this.f23602f.d();
        this.f23605i.a();
        return null;
    }

    public Task<Void> D() {
        return Tasks.call(this.f23599c, new Callable() { // from class: dd.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.remoteconfig.a.d(com.google.firebase.remoteconfig.a.this);
            }
        });
    }

    public Task<Void> E(final b bVar) {
        return Tasks.call(this.f23599c, new Callable() { // from class: dd.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.remoteconfig.a.b(com.google.firebase.remoteconfig.a.this, bVar);
            }
        });
    }

    public Task<Void> F(int i10) {
        return H(o.a(this.f23597a, i10));
    }

    public Task<Void> G(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return H(hashMap);
    }

    public void I() {
        this.f23601e.e();
        this.f23602f.e();
        this.f23600d.e();
    }

    void K(JSONArray jSONArray) {
        if (this.f23598b == null) {
            return;
        }
        try {
            this.f23598b.k(J(jSONArray));
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
        } catch (pb.a e11) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
        }
    }

    public Task<Boolean> j() {
        final Task<com.google.firebase.remoteconfig.internal.e> e10 = this.f23600d.e();
        final Task<com.google.firebase.remoteconfig.internal.e> e11 = this.f23601e.e();
        return Tasks.whenAllComplete(e10, e11).continueWithTask(this.f23599c, new Continuation() { // from class: dd.c
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.a.g(com.google.firebase.remoteconfig.a.this, e10, e11, task);
            }
        });
    }

    public Task<n> k() {
        Task<com.google.firebase.remoteconfig.internal.e> e10 = this.f23601e.e();
        Task<com.google.firebase.remoteconfig.internal.e> e11 = this.f23602f.e();
        Task<com.google.firebase.remoteconfig.internal.e> e12 = this.f23600d.e();
        final Task call = Tasks.call(this.f23599c, new Callable() { // from class: dd.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.remoteconfig.a.this.p();
            }
        });
        return Tasks.whenAllComplete(e10, e11, e12, call, this.f23606j.getId(), this.f23606j.a(false)).continueWith(this.f23599c, new Continuation() { // from class: dd.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.a.h(Task.this, task);
            }
        });
    }

    public Task<Void> l() {
        return this.f23603g.h().onSuccessTask(new SuccessContinuation() { // from class: dd.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task w10;
                w10 = com.google.firebase.remoteconfig.a.w((j.a) obj);
                return w10;
            }
        });
    }

    public Task<Void> m(long j10) {
        return this.f23603g.i(j10).onSuccessTask(new SuccessContinuation() { // from class: dd.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task x10;
                x10 = com.google.firebase.remoteconfig.a.x((j.a) obj);
                return x10;
            }
        });
    }

    public Task<Boolean> n() {
        return l().onSuccessTask(this.f23599c, new SuccessContinuation() { // from class: dd.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return com.google.firebase.remoteconfig.a.f(com.google.firebase.remoteconfig.a.this, (Void) obj);
            }
        });
    }

    public Map<String, p> o() {
        return this.f23604h.d();
    }

    public n p() {
        return this.f23605i.d();
    }

    public String s(String str) {
        return this.f23604h.g(str);
    }
}
