package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.d;
import androidx.emoji2.text.i;
import f0.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class i extends d.c {

    /* renamed from: j  reason: collision with root package name */
    private static final a f2934j = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, f.b bVar) throws PackageManager.NameNotFoundException {
            return f0.f.a(context, null, new f.b[]{bVar});
        }

        public f.a b(Context context, f0.d dVar) throws PackageManager.NameNotFoundException {
            return f0.f.b(context, null, dVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2935a;

        /* renamed from: b  reason: collision with root package name */
        private final f0.d f2936b;

        /* renamed from: c  reason: collision with root package name */
        private final a f2937c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f2938d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f2939e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f2940f;

        /* renamed from: g  reason: collision with root package name */
        private ThreadPoolExecutor f2941g;

        /* renamed from: h  reason: collision with root package name */
        d.h f2942h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f2943i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f2944j;

        b(Context context, f0.d dVar, a aVar) {
            h0.g.g(context, "Context cannot be null");
            h0.g.g(dVar, "FontRequest cannot be null");
            this.f2935a = context.getApplicationContext();
            this.f2936b = dVar;
            this.f2937c = aVar;
        }

        private void b() {
            synchronized (this.f2938d) {
                this.f2942h = null;
                ContentObserver contentObserver = this.f2943i;
                if (contentObserver != null) {
                    this.f2937c.c(this.f2935a, contentObserver);
                    this.f2943i = null;
                }
                Handler handler = this.f2939e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2944j);
                }
                this.f2939e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2941g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2940f = null;
                this.f2941g = null;
            }
        }

        private f.b e() {
            try {
                f.a b10 = this.f2937c.b(this.f2935a, this.f2936b);
                if (b10.c() == 0) {
                    f.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            h0.g.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2938d) {
                this.f2942h = hVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.f2938d) {
                if (this.f2942h == null) {
                    return;
                }
                try {
                    f.b e10 = e();
                    int b10 = e10.b();
                    if (b10 == 2) {
                        synchronized (this.f2938d) {
                        }
                    }
                    if (b10 == 0) {
                        e0.j.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a10 = this.f2937c.a(this.f2935a, e10);
                        ByteBuffer f10 = z.l.f(this.f2935a, null, e10.d());
                        if (f10 != null && a10 != null) {
                            l b11 = l.b(a10, f10);
                            e0.j.b();
                            synchronized (this.f2938d) {
                                d.h hVar = this.f2942h;
                                if (hVar != null) {
                                    hVar.b(b11);
                                }
                            }
                            b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                } catch (Throwable th) {
                    synchronized (this.f2938d) {
                        d.h hVar2 = this.f2942h;
                        if (hVar2 != null) {
                            hVar2.a(th);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f2938d) {
                if (this.f2942h == null) {
                    return;
                }
                if (this.f2940f == null) {
                    ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f2941g = b10;
                    this.f2940f = b10;
                }
                this.f2940f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2938d) {
                this.f2940f = executor;
            }
        }
    }

    public i(Context context, f0.d dVar) {
        super(new b(context, dVar, f2934j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
