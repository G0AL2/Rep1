package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import f0.f;
import y.e;
import y.h;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f39860a;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.e<String, Typeface> f39861b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        private h.d f39862a;

        public a(h.d dVar) {
            this.f39862a = dVar;
        }

        @Override // f0.f.c
        public void a(int i10) {
            h.d dVar = this.f39862a;
            if (dVar != null) {
                dVar.d(i10);
            }
        }

        @Override // f0.f.c
        public void b(Typeface typeface) {
            h.d dVar = this.f39862a;
            if (dVar != null) {
                dVar.e(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f39860a = new j();
        } else if (i10 >= 28) {
            f39860a = new i();
        } else if (i10 >= 26) {
            f39860a = new h();
        } else if (i10 >= 24 && g.m()) {
            f39860a = new g();
        } else if (i10 >= 21) {
            f39860a = new f();
        } else {
            f39860a = new k();
        }
        f39861b = new androidx.collection.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        Typeface g10;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g10 = g(context, typeface, i10)) == null) ? Typeface.create(typeface, i10) : g10;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        return f39860a.c(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.a aVar, Resources resources, int i10, int i11, h.d dVar, Handler handler, boolean z10) {
        Typeface b10;
        if (aVar instanceof e.d) {
            e.d dVar2 = (e.d) aVar;
            Typeface h10 = h(dVar2.c());
            if (h10 != null) {
                if (dVar != null) {
                    dVar.b(h10, handler);
                }
                return h10;
            }
            b10 = f0.f.c(context, dVar2.b(), i11, !z10 ? dVar != null : dVar2.a() != 0, z10 ? dVar2.d() : -1, h.d.c(handler), new a(dVar));
        } else {
            b10 = f39860a.b(context, (e.b) aVar, resources, i11);
            if (dVar != null) {
                if (b10 != null) {
                    dVar.b(b10, handler);
                } else {
                    dVar.a(-3, handler);
                }
            }
        }
        if (b10 != null) {
            f39861b.put(e(resources, i10, i11), b10);
        }
        return b10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Typeface e10 = f39860a.e(context, resources, i10, str, i11);
        if (e10 != null) {
            f39861b.put(e(resources, i10, i11), e10);
        }
        return e10;
    }

    private static String e(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + Constants.FILENAME_SEQUENCE_SEPARATOR + i10 + Constants.FILENAME_SEQUENCE_SEPARATOR + i11;
    }

    public static Typeface f(Resources resources, int i10, int i11) {
        return f39861b.get(e(resources, i10, i11));
    }

    private static Typeface g(Context context, Typeface typeface, int i10) {
        k kVar = f39860a;
        e.b i11 = kVar.i(typeface);
        if (i11 == null) {
            return null;
        }
        return kVar.b(context, i11, context.getResources(), i10);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
