package f0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import f0.f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static final androidx.collection.e<String, Typeface> f29908a = new androidx.collection.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f29909b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f29910c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final androidx.collection.g<String, ArrayList<h0.a<C0375e>>> f29911d = new androidx.collection.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class a implements Callable<C0375e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f29912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f29913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f0.d f29914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29915d;

        a(String str, Context context, f0.d dVar, int i10) {
            this.f29912a = str;
            this.f29913b = context;
            this.f29914c = dVar;
            this.f29915d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0375e call() {
            return e.c(this.f29912a, this.f29913b, this.f29914c, this.f29915d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class b implements h0.a<C0375e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0.a f29916a;

        b(f0.a aVar) {
            this.f29916a = aVar;
        }

        @Override // h0.a
        /* renamed from: a */
        public void accept(C0375e c0375e) {
            if (c0375e == null) {
                c0375e = new C0375e(-3);
            }
            this.f29916a.b(c0375e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class c implements Callable<C0375e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f29917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f29918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f0.d f29919c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29920d;

        c(String str, Context context, f0.d dVar, int i10) {
            this.f29917a = str;
            this.f29918b = context;
            this.f29919c = dVar;
            this.f29920d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0375e call() {
            try {
                return e.c(this.f29917a, this.f29918b, this.f29919c, this.f29920d);
            } catch (Throwable unused) {
                return new C0375e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class d implements h0.a<C0375e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f29921a;

        d(String str) {
            this.f29921a = str;
        }

        @Override // h0.a
        /* renamed from: a */
        public void accept(C0375e c0375e) {
            synchronized (e.f29910c) {
                androidx.collection.g<String, ArrayList<h0.a<C0375e>>> gVar = e.f29911d;
                ArrayList<h0.a<C0375e>> arrayList = gVar.get(this.f29921a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f29921a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(c0375e);
                }
            }
        }
    }

    private static String a(f0.d dVar, int i10) {
        return dVar.d() + Constants.FILENAME_SEQUENCE_SEPARATOR + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(f.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (f.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static C0375e c(String str, Context context, f0.d dVar, int i10) {
        androidx.collection.e<String, Typeface> eVar = f29908a;
        Typeface typeface = eVar.get(str);
        if (typeface != null) {
            return new C0375e(typeface);
        }
        try {
            f.a d10 = f0.c.d(context, dVar, null);
            int b10 = b(d10);
            if (b10 != 0) {
                return new C0375e(b10);
            }
            Typeface b11 = z.e.b(context, null, d10.b(), i10);
            if (b11 != null) {
                eVar.put(str, b11);
                return new C0375e(b11);
            }
            return new C0375e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0375e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, f0.d dVar, int i10, Executor executor, f0.a aVar) {
        String a10 = a(dVar, i10);
        Typeface typeface = f29908a.get(a10);
        if (typeface != null) {
            aVar.b(new C0375e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f29910c) {
            androidx.collection.g<String, ArrayList<h0.a<C0375e>>> gVar = f29911d;
            ArrayList<h0.a<C0375e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<h0.a<C0375e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, dVar, i10);
            if (executor == null) {
                executor = f29909b;
            }
            g.b(executor, cVar, new d(a10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, f0.d dVar, f0.a aVar, int i10, int i11) {
        String a10 = a(dVar, i10);
        Typeface typeface = f29908a.get(a10);
        if (typeface != null) {
            aVar.b(new C0375e(typeface));
            return typeface;
        } else if (i11 == -1) {
            C0375e c10 = c(a10, context, dVar, i10);
            aVar.b(c10);
            return c10.f29922a;
        } else {
            try {
                C0375e c0375e = (C0375e) g.c(f29909b, new a(a10, context, dVar, i10), i11);
                aVar.b(c0375e);
                return c0375e.f29922a;
            } catch (InterruptedException unused) {
                aVar.b(new C0375e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: f0.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0375e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f29922a;

        /* renamed from: b  reason: collision with root package name */
        final int f29923b;

        C0375e(int i10) {
            this.f29922a = null;
            this.f29923b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f29923b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C0375e(Typeface typeface) {
            this.f29922a = typeface;
            this.f29923b = 0;
        }
    }
}
