package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.m;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: j  reason: collision with root package name */
    public static final long f23662j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f23663k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final tc.d f23664a;

    /* renamed from: b  reason: collision with root package name */
    private final sc.b<rb.a> f23665b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f23666c;

    /* renamed from: d  reason: collision with root package name */
    private final Clock f23667d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f23668e;

    /* renamed from: f  reason: collision with root package name */
    private final d f23669f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f23670g;

    /* renamed from: h  reason: collision with root package name */
    private final m f23671h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f23672i;

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f23673a;

        /* renamed from: b  reason: collision with root package name */
        private final e f23674b;

        /* renamed from: c  reason: collision with root package name */
        private final String f23675c;

        private a(Date date, int i10, e eVar, String str) {
            this.f23673a = i10;
            this.f23674b = eVar;
            this.f23675c = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(e eVar, String str) {
            return new a(eVar.e(), 0, eVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public e d() {
            return this.f23674b;
        }

        String e() {
            return this.f23675c;
        }

        int f() {
            return this.f23673a;
        }
    }

    public j(tc.d dVar, sc.b<rb.a> bVar, Executor executor, Clock clock, Random random, d dVar2, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.f23664a = dVar;
        this.f23665b = bVar;
        this.f23666c = executor;
        this.f23667d = clock;
        this.f23668e = random;
        this.f23669f = dVar2;
        this.f23670g = configFetchHttpClient;
        this.f23671h = mVar;
        this.f23672i = map;
    }

    private boolean e(long j10, Date date) {
        Date f10 = this.f23671h.f();
        if (f10.equals(m.f23683d)) {
            return false;
        }
        return date.before(new Date(f10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private dd.o f(dd.o oVar) throws dd.k {
        String str;
        int a10 = oVar.a();
        if (a10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a10 == 429) {
            throw new dd.k("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (a10 != 500) {
                switch (a10) {
                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                    case 503:
                    case ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST /* 504 */:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        int a11 = oVar.a();
        return new dd.o(a11, "Fetch failed: " + str, oVar);
    }

    private String g(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a j(String str, String str2, Date date) throws dd.l {
        try {
            a fetch = this.f23670g.fetch(this.f23670g.c(), str, str2, o(), this.f23671h.e(), this.f23672i, date);
            if (fetch.e() != null) {
                this.f23671h.k(fetch.e());
            }
            this.f23671h.h();
            return fetch;
        } catch (dd.o e10) {
            m.a v10 = v(e10.a(), date);
            if (u(v10, e10.a())) {
                throw new dd.m(v10.a().getTime());
            }
            throw f(e10);
        }
    }

    private Task<a> k(String str, String str2, Date date) {
        try {
            final a j10 = j(str, str2, date);
            if (j10.f() != 0) {
                return Tasks.forResult(j10);
            }
            return this.f23669f.k(j10.d()).onSuccessTask(this.f23666c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    e eVar = (e) obj;
                    forResult = Tasks.forResult(j.a.this);
                    return forResult;
                }
            });
        } catch (dd.l e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public Task<a> q(Task<e> task, long j10) {
        Task continueWithTask;
        final Date date = new Date(this.f23667d.currentTimeMillis());
        if (task.isSuccessful() && e(j10, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date m10 = m(date);
        if (m10 != null) {
            continueWithTask = Tasks.forException(new dd.m(g(m10.getTime() - date.getTime()), m10.getTime()));
        } else {
            final Task<String> id2 = this.f23664a.getId();
            final Task<com.google.firebase.installations.g> a10 = this.f23664a.a(false);
            continueWithTask = Tasks.whenAllComplete(id2, a10).continueWithTask(this.f23666c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task s10;
                    s10 = j.this.s(id2, a10, date, task2);
                    return s10;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f23666c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task t10;
                t10 = j.this.t(date, task2);
                return t10;
            }
        });
    }

    private Date m(Date date) {
        Date a10 = this.f23671h.b().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private long n(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f23663k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + this.f23668e.nextInt((int) millis);
    }

    private Map<String, String> o() {
        HashMap hashMap = new HashMap();
        rb.a aVar = this.f23665b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.d(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean p(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task s(Task task, Task task2, Date date, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new dd.k("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new dd.k("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return k((String) task.getResult(), ((com.google.firebase.installations.g) task2.getResult()).b(), date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(Date date, Task task) throws Exception {
        x(task, date);
        return task;
    }

    private boolean u(m.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    private m.a v(int i10, Date date) {
        if (p(i10)) {
            w(date);
        }
        return this.f23671h.b();
    }

    private void w(Date date) {
        int b10 = this.f23671h.b().b() + 1;
        this.f23671h.i(b10, new Date(date.getTime() + n(b10)));
    }

    private void x(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f23671h.m(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof dd.m) {
            this.f23671h.n();
        } else {
            this.f23671h.l();
        }
    }

    public Task<a> h() {
        return i(this.f23671h.g());
    }

    public Task<a> i(final long j10) {
        return this.f23669f.e().continueWithTask(this.f23666c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task q10;
                q10 = j.this.q(j10, task);
                return q10;
            }
        });
    }
}
