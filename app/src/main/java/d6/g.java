package d6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;

/* compiled from: SimpleImageTranscoder.java */
/* loaded from: classes.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29092a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29093b;

    public g(boolean z10, int i10) {
        this.f29092a = z10;
        this.f29093b = i10;
    }

    private static Bitmap.CompressFormat e(com.facebook.imageformat.c cVar) {
        if (cVar == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == com.facebook.imageformat.b.f14800a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == com.facebook.imageformat.b.f14801b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (Build.VERSION.SDK_INT >= 14 && com.facebook.imageformat.b.a(cVar)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    private int f(w5.e eVar, q5.f fVar, q5.e eVar2) {
        if (this.f29092a) {
            return a.b(fVar, eVar2, eVar, this.f29093b);
        }
        return 1;
    }

    @Override // d6.c
    public String a() {
        return "SimpleImageTranscoder";
    }

    @Override // d6.c
    public b b(w5.e eVar, OutputStream outputStream, q5.f fVar, q5.e eVar2, com.facebook.imageformat.c cVar, Integer num) {
        g gVar;
        q5.f fVar2;
        Bitmap bitmap;
        Throwable th;
        OutOfMemoryError e10;
        Integer num2 = num == null ? 85 : num;
        if (fVar == null) {
            fVar2 = q5.f.a();
            gVar = this;
        } else {
            gVar = this;
            fVar2 = fVar;
        }
        int f10 = gVar.f(eVar, fVar2, eVar2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = f10;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(eVar.C(), null, options);
            if (decodeStream == null) {
                z3.a.j("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix g10 = e.g(eVar, fVar2);
            if (g10 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g10, false);
                } catch (OutOfMemoryError e11) {
                    e10 = e11;
                    bitmap = decodeStream;
                    z3.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e10);
                    b bVar = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(e(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(f10 > 1 ? 0 : 1);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (Throwable th3) {
                    th = th3;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } catch (OutOfMemoryError e12) {
                e10 = e12;
                z3.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e10);
                b bVar3 = new b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar3;
            }
        } catch (OutOfMemoryError e13) {
            z3.a.k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new b(2);
        }
    }

    @Override // d6.c
    public boolean c(w5.e eVar, q5.f fVar, q5.e eVar2) {
        if (fVar == null) {
            fVar = q5.f.a();
        }
        return this.f29092a && a.b(fVar, eVar2, eVar, this.f29093b) > 1;
    }

    @Override // d6.c
    public boolean d(com.facebook.imageformat.c cVar) {
        return cVar == com.facebook.imageformat.b.f14810k || cVar == com.facebook.imageformat.b.f14800a;
    }
}
