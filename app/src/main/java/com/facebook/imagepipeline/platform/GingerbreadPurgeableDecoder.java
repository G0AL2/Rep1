package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import b4.g;
import b4.i;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import y3.k;
import y3.p;

@y3.d
/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    private static Method f14867d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f14868e = 0;

    /* renamed from: c  reason: collision with root package name */
    private final h4.b f14869c = h4.c.i();

    private static MemoryFile i(c4.a<g> aVar, int i10, byte[] bArr) throws IOException {
        OutputStream outputStream;
        e4.a aVar2;
        i iVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            i iVar2 = new i(aVar.y());
            try {
                aVar2 = new e4.a(iVar2, i10);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                aVar2 = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                y3.a.a(aVar2, outputStream2);
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i10, bArr.length);
                }
                c4.a.w(aVar);
                y3.b.b(iVar2);
                y3.b.b(aVar2);
                y3.b.a(outputStream2, true);
                return memoryFile;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                iVar = iVar2;
                c4.a.w(aVar);
                y3.b.b(iVar);
                y3.b.b(aVar2);
                y3.b.a(outputStream, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap j(c4.a<g> aVar, int i10, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile i11 = i(aVar, i10, bArr);
                try {
                    FileDescriptor l10 = l(i11);
                    h4.b bVar = this.f14869c;
                    if (bVar != null) {
                        Bitmap bitmap = (Bitmap) k.h(bVar.c(l10, null, options), "BitmapFactory returned null");
                        if (i11 != null) {
                            i11.close();
                        }
                        return bitmap;
                    }
                    throw new IllegalStateException("WebpBitmapFactory is null");
                } catch (IOException e10) {
                    e = e10;
                    memoryFile = i11;
                    throw p.a(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = i11;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private synchronized Method k() {
        if (f14867d == null) {
            try {
                f14867d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f14867d;
    }

    private FileDescriptor l(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(k().invoke(memoryFile, new Object[0]));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(c4.a<g> aVar, BitmapFactory.Options options) {
        return j(aVar, aVar.y().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(c4.a<g> aVar, int i10, BitmapFactory.Options options) {
        return j(aVar, i10, DalvikPurgeableDecoder.f(aVar, i10) ? null : DalvikPurgeableDecoder.f14856b, options);
    }
}
