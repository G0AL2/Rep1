package com.bytedance.sdk.component.d.c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.d.i;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.component.d.r;
import com.bytedance.sdk.component.d.s;
import com.bytedance.sdk.component.d.t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class c implements com.bytedance.sdk.component.d.h {

    /* renamed from: a  reason: collision with root package name */
    Future<?> f10179a;

    /* renamed from: b  reason: collision with root package name */
    private String f10180b;

    /* renamed from: c  reason: collision with root package name */
    private String f10181c;

    /* renamed from: d  reason: collision with root package name */
    private String f10182d;

    /* renamed from: e  reason: collision with root package name */
    private n f10183e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView.ScaleType f10184f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap.Config f10185g;

    /* renamed from: h  reason: collision with root package name */
    private int f10186h;

    /* renamed from: i  reason: collision with root package name */
    private int f10187i;

    /* renamed from: j  reason: collision with root package name */
    private t f10188j;

    /* renamed from: k  reason: collision with root package name */
    private WeakReference<ImageView> f10189k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f10190l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10191m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10192n;

    /* renamed from: o  reason: collision with root package name */
    private r f10193o;

    /* renamed from: p  reason: collision with root package name */
    private s f10194p;

    /* renamed from: q  reason: collision with root package name */
    private Queue<i> f10195q;

    /* renamed from: r  reason: collision with root package name */
    private final Handler f10196r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10197s;

    /* renamed from: t  reason: collision with root package name */
    private com.bytedance.sdk.component.d.g f10198t;

    /* renamed from: u  reason: collision with root package name */
    private int f10199u;

    /* renamed from: v  reason: collision with root package name */
    private f f10200v;

    /* renamed from: w  reason: collision with root package name */
    private com.bytedance.sdk.component.d.c.a f10201w;

    /* renamed from: x  reason: collision with root package name */
    private com.bytedance.sdk.component.d.b f10202x;

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    private class a implements n {

        /* renamed from: b  reason: collision with root package name */
        private n f10205b;

        public a(n nVar) {
            this.f10205b = nVar;
        }

        @Override // com.bytedance.sdk.component.d.n
        public void a(final j jVar) {
            final ImageView imageView = (ImageView) c.this.f10189k.get();
            if (imageView != null && c.this.f10188j != t.RAW && a(imageView) && (jVar.b() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jVar.b();
                c.this.f10196r.post(new Runnable() { // from class: com.bytedance.sdk.component.d.c.c.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            if (c.this.f10194p == s.MAIN) {
                c.this.f10196r.post(new Runnable() { // from class: com.bytedance.sdk.component.d.c.c.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.f10205b != null) {
                            a.this.f10205b.a(jVar);
                        }
                    }
                });
                return;
            }
            n nVar = this.f10205b;
            if (nVar != null) {
                nVar.a(jVar);
            }
        }

        private boolean a(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(c.this.f10181c)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.d.n
        public void a(final int i10, final String str, final Throwable th) {
            if (c.this.f10194p == s.MAIN) {
                c.this.f10196r.post(new Runnable() { // from class: com.bytedance.sdk.component.d.c.c.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.f10205b != null) {
                            a.this.f10205b.a(i10, str, th);
                        }
                    }
                });
                return;
            }
            n nVar = this.f10205b;
            if (nVar != null) {
                nVar.a(i10, str, th);
            }
        }
    }

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    public static class b implements com.bytedance.sdk.component.d.i {

        /* renamed from: a  reason: collision with root package name */
        private n f10215a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f10216b;

        /* renamed from: c  reason: collision with root package name */
        private String f10217c;

        /* renamed from: d  reason: collision with root package name */
        private String f10218d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView.ScaleType f10219e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap.Config f10220f;

        /* renamed from: g  reason: collision with root package name */
        private int f10221g;

        /* renamed from: h  reason: collision with root package name */
        private int f10222h;

        /* renamed from: i  reason: collision with root package name */
        private t f10223i;

        /* renamed from: j  reason: collision with root package name */
        private s f10224j;

        /* renamed from: k  reason: collision with root package name */
        private r f10225k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f10226l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f10227m;

        /* renamed from: n  reason: collision with root package name */
        private String f10228n;

        /* renamed from: o  reason: collision with root package name */
        private com.bytedance.sdk.component.d.b f10229o;

        /* renamed from: p  reason: collision with root package name */
        private f f10230p;

        public b(f fVar) {
            this.f10230p = fVar;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(String str) {
            this.f10217c = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i b(int i10) {
            this.f10222h = i10;
            return this;
        }

        public com.bytedance.sdk.component.d.i c(String str) {
            this.f10218d = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(ImageView.ScaleType scaleType) {
            this.f10219e = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i b(String str) {
            this.f10228n = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(Bitmap.Config config) {
            this.f10220f = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(int i10) {
            this.f10221g = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(t tVar) {
            this.f10223i = tVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(r rVar) {
            this.f10225k = rVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.i a(boolean z10) {
            this.f10227m = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.h a(n nVar) {
            this.f10215a = nVar;
            return new c(this).s();
        }

        @Override // com.bytedance.sdk.component.d.i
        public com.bytedance.sdk.component.d.h a(ImageView imageView) {
            this.f10216b = imageView;
            return new c(this).s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.component.d.h s() {
        f fVar;
        try {
            fVar = this.f10200v;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
        }
        if (fVar == null) {
            n nVar = this.f10183e;
            if (nVar != null) {
                nVar.a(1005, "not init !", null);
            }
            return this;
        }
        ExecutorService e11 = fVar.e();
        if (e11 != null) {
            this.f10179a = e11.submit(new Runnable() { // from class: com.bytedance.sdk.component.d.c.c.1
                @Override // java.lang.Runnable
                public void run() {
                    i iVar;
                    while (!c.this.f10190l && (iVar = (i) c.this.f10195q.poll()) != null) {
                        try {
                            if (c.this.f10193o != null) {
                                c.this.f10193o.a(iVar.a(), c.this);
                            }
                            iVar.a(c.this);
                            if (c.this.f10193o != null) {
                                c.this.f10193o.b(iVar.a(), c.this);
                            }
                        } catch (Throwable th) {
                            c.this.a(2000, th.getMessage(), th);
                            if (c.this.f10193o != null) {
                                c.this.f10193o.b("exception", c.this);
                                return;
                            }
                            return;
                        }
                    }
                    if (c.this.f10190l) {
                        c.this.a(1003, "canceled", null);
                    }
                }
            });
        }
        return this;
    }

    public boolean j() {
        return this.f10191m;
    }

    public boolean k() {
        return this.f10192n;
    }

    public boolean l() {
        return this.f10197s;
    }

    public com.bytedance.sdk.component.d.g m() {
        return this.f10198t;
    }

    public int n() {
        return this.f10199u;
    }

    public com.bytedance.sdk.component.d.c.a o() {
        return this.f10201w;
    }

    public f p() {
        return this.f10200v;
    }

    public com.bytedance.sdk.component.d.b q() {
        return this.f10202x;
    }

    public String r() {
        return e() + i();
    }

    private c(b bVar) {
        this.f10195q = new LinkedBlockingQueue();
        this.f10196r = new Handler(Looper.getMainLooper());
        this.f10197s = true;
        this.f10180b = bVar.f10218d;
        this.f10183e = new a(bVar.f10215a);
        this.f10189k = new WeakReference<>(bVar.f10216b);
        this.f10184f = bVar.f10219e;
        this.f10185g = bVar.f10220f;
        this.f10186h = bVar.f10221g;
        this.f10187i = bVar.f10222h;
        this.f10188j = bVar.f10223i == null ? t.AUTO : bVar.f10223i;
        this.f10194p = bVar.f10224j == null ? s.MAIN : bVar.f10224j;
        this.f10193o = bVar.f10225k;
        this.f10202x = a(bVar);
        if (!TextUtils.isEmpty(bVar.f10217c)) {
            b(bVar.f10217c);
            a(bVar.f10217c);
        }
        this.f10191m = bVar.f10226l;
        this.f10192n = bVar.f10227m;
        this.f10200v = bVar.f10230p;
        this.f10195q.add(new com.bytedance.sdk.component.d.d.c());
    }

    public void b(String str) {
        WeakReference<ImageView> weakReference = this.f10189k;
        if (weakReference != null && weakReference.get() != null) {
            this.f10189k.get().setTag(1094453505, str);
        }
        this.f10181c = str;
    }

    @Override // com.bytedance.sdk.component.d.h
    public int c() {
        return this.f10187i;
    }

    @Override // com.bytedance.sdk.component.d.h
    public ImageView.ScaleType d() {
        return this.f10184f;
    }

    @Override // com.bytedance.sdk.component.d.h
    public String e() {
        return this.f10181c;
    }

    public n f() {
        return this.f10183e;
    }

    public String g() {
        return this.f10182d;
    }

    public Bitmap.Config h() {
        return this.f10185g;
    }

    public t i() {
        return this.f10188j;
    }

    private com.bytedance.sdk.component.d.b a(b bVar) {
        if (bVar.f10229o != null) {
            return bVar.f10229o;
        }
        if (!TextUtils.isEmpty(bVar.f10228n)) {
            return com.bytedance.sdk.component.d.c.a.a.a(new File(bVar.f10228n));
        }
        return com.bytedance.sdk.component.d.c.a.a.f();
    }

    @Override // com.bytedance.sdk.component.d.h
    public int b() {
        return this.f10186h;
    }

    @Override // com.bytedance.sdk.component.d.h
    public String a() {
        return this.f10180b;
    }

    public void a(String str) {
        this.f10182d = str;
    }

    public void a(boolean z10) {
        this.f10197s = z10;
    }

    public void a(com.bytedance.sdk.component.d.g gVar) {
        this.f10198t = gVar;
    }

    public void a(int i10) {
        this.f10199u = i10;
    }

    public void a(com.bytedance.sdk.component.d.c.a aVar) {
        this.f10201w = aVar;
    }

    public boolean a(i iVar) {
        if (this.f10190l) {
            return false;
        }
        return this.f10195q.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, Throwable th) {
        new com.bytedance.sdk.component.d.d.h(i10, str, th).a(this);
        this.f10195q.clear();
    }
}
