package fc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import yb.d0;
import yb.q;
import yb.r;
import yb.s;
import yb.v;

/* compiled from: SettingsController.java */
/* loaded from: classes3.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f30303a;

    /* renamed from: b  reason: collision with root package name */
    private final gc.f f30304b;

    /* renamed from: c  reason: collision with root package name */
    private final f f30305c;

    /* renamed from: d  reason: collision with root package name */
    private final q f30306d;

    /* renamed from: e  reason: collision with root package name */
    private final fc.a f30307e;

    /* renamed from: f  reason: collision with root package name */
    private final hc.b f30308f;

    /* renamed from: g  reason: collision with root package name */
    private final r f30309g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<gc.d> f30310h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<gc.a>> f30311i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsController.java */
    /* loaded from: classes3.dex */
    public class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Void r52) throws Exception {
            JSONObject a10 = d.this.f30308f.a(d.this.f30304b, true);
            if (a10 != null) {
                gc.e b10 = d.this.f30305c.b(a10);
                d.this.f30307e.c(b10.d(), a10);
                d.this.q(a10, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.f30304b.f30827f);
                d.this.f30310h.set(b10);
                ((TaskCompletionSource) d.this.f30311i.get()).trySetResult(b10.c());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.trySetResult(b10.c());
                d.this.f30311i.set(taskCompletionSource);
            }
            return Tasks.forResult(null);
        }
    }

    d(Context context, gc.f fVar, q qVar, f fVar2, fc.a aVar, hc.b bVar, r rVar) {
        AtomicReference<gc.d> atomicReference = new AtomicReference<>();
        this.f30310h = atomicReference;
        this.f30311i = new AtomicReference<>(new TaskCompletionSource());
        this.f30303a = context;
        this.f30304b = fVar;
        this.f30306d = qVar;
        this.f30305c = fVar2;
        this.f30307e = aVar;
        this.f30308f = bVar;
        this.f30309g = rVar;
        atomicReference.set(b.e(qVar));
    }

    public static d l(Context context, String str, v vVar, cc.b bVar, String str2, String str3, dc.f fVar, r rVar) {
        String g10 = vVar.g();
        d0 d0Var = new d0();
        return new d(context, new gc.f(str, vVar.h(), vVar.i(), vVar.j(), vVar, yb.g.h(yb.g.n(context), str, str3, str2), str3, str2, s.a(g10).f()), d0Var, new f(d0Var), new fc.a(fVar), new hc.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), rVar);
    }

    private gc.e m(c cVar) {
        gc.e eVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject b10 = this.f30307e.b();
                if (b10 != null) {
                    gc.e b11 = this.f30305c.b(b10);
                    if (b11 != null) {
                        q(b10, "Loaded cached settings: ");
                        long a10 = this.f30306d.a();
                        if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar) && b11.e(a10)) {
                            vb.f.f().i("Cached settings have expired.");
                        }
                        try {
                            vb.f.f().i("Returning cached settings.");
                            eVar = b11;
                        } catch (Exception e10) {
                            e = e10;
                            eVar = b11;
                            vb.f.f().e("Failed to get cached settings", e);
                            return eVar;
                        }
                    } else {
                        vb.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    vb.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return eVar;
    }

    private String n() {
        return yb.g.r(this.f30303a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        vb.f f10 = vb.f.f();
        f10.b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = yb.g.r(this.f30303a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // fc.e
    public gc.d a() {
        return this.f30310h.get();
    }

    @Override // fc.e
    public Task<gc.a> b() {
        return this.f30311i.get().getTask();
    }

    boolean k() {
        return !n().equals(this.f30304b.f30827f);
    }

    public Task<Void> o(c cVar, Executor executor) {
        gc.e m10;
        if (!k() && (m10 = m(cVar)) != null) {
            this.f30310h.set(m10);
            this.f30311i.get().trySetResult(m10.c());
            return Tasks.forResult(null);
        }
        gc.e m11 = m(c.IGNORE_CACHE_EXPIRATION);
        if (m11 != null) {
            this.f30310h.set(m11);
            this.f30311i.get().trySetResult(m11.c());
        }
        return this.f30309g.h(executor).onSuccessTask(executor, new a());
    }

    public Task<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }
}
