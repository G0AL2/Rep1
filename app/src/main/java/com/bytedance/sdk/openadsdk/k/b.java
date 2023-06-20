package com.bytedance.sdk.openadsdk.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.j;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.s;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: TrackAdUrlImpl.java */
/* loaded from: classes.dex */
public class b implements com.bytedance.sdk.openadsdk.k.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13435a;

    /* renamed from: b  reason: collision with root package name */
    private final g f13436b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f13437c = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TrackAdUrlImpl.java */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        private final f f13442b;

        boolean a(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        private a(f fVar) {
            this.f13442b = fVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            com.bytedance.sdk.component.e.b bVar;
            f fVar;
            if (com.bytedance.sdk.openadsdk.core.i.e.a() && a(this.f13442b.b())) {
                if (this.f13442b.c() == 0) {
                    b.this.f13436b.c(this.f13442b);
                    return null;
                }
                while (true) {
                    if (this.f13442b.c() <= 0 || isCancelled()) {
                        break;
                    }
                    try {
                        if (this.f13442b.c() == 5) {
                            b.this.f13436b.a(this.f13442b);
                        }
                    } catch (Throwable unused) {
                    }
                    if (!o.a(b.this.c())) {
                        break;
                    }
                    String b10 = this.f13442b.b();
                    com.bytedance.sdk.component.e.b.b c10 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
                    c10.a(s.b(b10));
                    try {
                        c10.b("User-Agent", u.b());
                    } catch (Exception unused2) {
                    }
                    try {
                        bVar = c10.a();
                    } catch (Throwable unused3) {
                        bVar = null;
                    }
                    if (bVar != null && bVar.f()) {
                        b.this.f13436b.c(this.f13442b);
                        if (l.c()) {
                            l.c("trackurl", "track success : " + this.f13442b.b());
                        }
                    } else {
                        if (l.c()) {
                            l.c("trackurl", "track fail : " + this.f13442b.b());
                        }
                        this.f13442b.a(fVar.c() - 1);
                        if (this.f13442b.c() == 0) {
                            b.this.f13436b.c(this.f13442b);
                            if (l.c()) {
                                l.c("trackurl", "track fail and delete : " + this.f13442b.b());
                            }
                        } else {
                            b.this.f13436b.b(this.f13442b);
                        }
                    }
                }
                return null;
            }
            return null;
        }
    }

    public b(Context context, g gVar) {
        this.f13435a = context;
        this.f13436b = gVar;
    }

    public static com.bytedance.sdk.openadsdk.k.a d() {
        return d.c();
    }

    public Context c() {
        Context context = this.f13435a;
        return context == null ? m.a() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void b() {
        try {
            this.f13437c.shutdownNow();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<f> list) {
        if (j.b(list)) {
            for (f fVar : list) {
                new a(fVar).executeOnExecutor(this.f13437c, new Void[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void a(final List<String> list) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("trackUrls") { // from class: com.bytedance.sdk.openadsdk.k.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (j.b(list)) {
                        for (String str : list) {
                            new a(new f(com.bytedance.sdk.openadsdk.utils.l.a() + "_" + System.currentTimeMillis(), str, 5)).executeOnExecutor(b.this.f13437c, new Void[0]);
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.k.a
    public void a() {
        com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("trackFailedUrls") { // from class: com.bytedance.sdk.openadsdk.k.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.b(b.this.f13436b.a());
            }
        });
    }
}
