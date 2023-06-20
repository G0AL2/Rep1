package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class f {

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f29924a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f29925b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f29924a = i10;
            this.f29925b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f29925b;
        }

        public int c() {
            return this.f29924a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f29926a;

        /* renamed from: b  reason: collision with root package name */
        private final int f29927b;

        /* renamed from: c  reason: collision with root package name */
        private final int f29928c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f29929d;

        /* renamed from: e  reason: collision with root package name */
        private final int f29930e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f29926a = (Uri) h0.g.f(uri);
            this.f29927b = i10;
            this.f29928c = i11;
            this.f29929d = z10;
            this.f29930e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f29930e;
        }

        public int c() {
            return this.f29927b;
        }

        public Uri d() {
            return this.f29926a;
        }

        public int e() {
            return this.f29928c;
        }

        public boolean f() {
            return this.f29929d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return z.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, d dVar) throws PackageManager.NameNotFoundException {
        return f0.c.d(context, dVar, cancellationSignal);
    }

    public static Typeface c(Context context, d dVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        f0.a aVar = new f0.a(cVar, handler);
        if (z10) {
            return e.e(context, dVar, aVar, i10, i11);
        }
        return e.d(context, dVar, i10, null, aVar);
    }
}
