package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements c1.a<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a */
        private final Context f2872a;

        /* loaded from: classes.dex */
        public class a extends d.h {

            /* renamed from: a */
            final /* synthetic */ d.h f2873a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f2874b;

            a(b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2873a = hVar;
                this.f2874b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                try {
                    this.f2873a.a(th);
                } finally {
                    this.f2874b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                try {
                    this.f2873a.b(lVar);
                } finally {
                    this.f2874b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f2872a = context.getApplicationContext();
        }

        public static /* synthetic */ void b(b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            bVar.d(hVar, threadPoolExecutor);
        }

        @Override // androidx.emoji2.text.d.g
        public void a(final d.h hVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.b(EmojiCompatInitializer.b.this, hVar, b10);
                }
            });
        }

        /* renamed from: c */
        public void d(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = androidx.emoji2.text.c.a(this.f2872a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(this, hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e0.j.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                e0.j.b();
            }
        }
    }

    @Override // c1.a
    public List<Class<? extends c1.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // c1.a
    /* renamed from: c */
    public Boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            d.g(new a(context));
            d(context);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    void d(Context context) {
        final androidx.lifecycle.i lifecycle = ((p) androidx.startup.a.c(context).d(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            {
                EmojiCompatInitializer.this = this;
            }

            @Override // androidx.lifecycle.g
            public /* synthetic */ void a(p pVar) {
                androidx.lifecycle.c.a(this, pVar);
            }

            @Override // androidx.lifecycle.g
            public void c(p pVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }

            @Override // androidx.lifecycle.g
            public /* synthetic */ void d(p pVar) {
                androidx.lifecycle.c.c(this, pVar);
            }

            @Override // androidx.lifecycle.g
            public /* synthetic */ void e(p pVar) {
                androidx.lifecycle.c.e(this, pVar);
            }

            @Override // androidx.lifecycle.g
            public /* synthetic */ void f(p pVar) {
                androidx.lifecycle.c.b(this, pVar);
            }

            @Override // androidx.lifecycle.g
            public /* synthetic */ void h(p pVar) {
                androidx.lifecycle.c.d(this, pVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
