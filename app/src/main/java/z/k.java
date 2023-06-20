package z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import f0.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import y.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, e.b> f39879a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public class a implements c<f.b> {
        a(k kVar) {
        }

        @Override // z.k.c
        /* renamed from: c */
        public int b(f.b bVar) {
            return bVar.e();
        }

        @Override // z.k.c
        /* renamed from: d */
        public boolean a(f.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public class b implements c<e.c> {
        b(k kVar) {
        }

        @Override // z.k.c
        /* renamed from: c */
        public int b(e.c cVar) {
            return cVar.e();
        }

        @Override // z.k.c
        /* renamed from: d */
        public boolean a(e.c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(T t10);

        int b(T t10);
    }

    private void a(Typeface typeface, e.b bVar) {
        long j10 = j(typeface);
        if (j10 != 0) {
            this.f39879a.put(Long.valueOf(j10), bVar);
        }
    }

    private e.c f(e.b bVar, int i10) {
        return (e.c) g(bVar.a(), i10, new b(this));
    }

    private static <T> T g(T[] tArr, int i10, c<T> cVar) {
        int i11 = (i10 & 1) == 0 ? DownloadResource.STATUS_BAD_REQUEST : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(cVar.b(t11) - i11) * 2) + (cVar.a(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    public Typeface b(Context context, e.b bVar, Resources resources, int i10) {
        e.c f10 = f(bVar, i10);
        if (f10 == null) {
            return null;
        }
        Typeface d10 = e.d(context, resources, f10.b(), f10.a(), i10);
        a(d10, bVar);
        return d10;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i10).d());
            try {
                Typeface d10 = d(context, inputStream);
                l.a(inputStream);
                return d10;
            } catch (IOException unused) {
                l.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                l.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e10 = l.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (l.d(e10, inputStream)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = l.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (l.c(e10, resources, i10)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f.b h(f.b[] bVarArr, int i10) {
        return (f.b) g(bVarArr, i10, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b i(Typeface typeface) {
        long j10 = j(typeface);
        if (j10 == 0) {
            return null;
        }
        return this.f39879a.get(Long.valueOf(j10));
    }
}
