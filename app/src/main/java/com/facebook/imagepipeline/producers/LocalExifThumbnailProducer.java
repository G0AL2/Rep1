package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class LocalExifThumbnailProducer implements d1<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14877a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.h f14878b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f14879c;

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.soloader.e
    /* loaded from: classes.dex */
    public class Api24Utils {
        private Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer) {
        }

        ExifInterface a(FileDescriptor fileDescriptor) throws IOException {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, a aVar) {
            this(localExifThumbnailProducer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w0<w5.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b6.b f14880f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, b6.b bVar) {
            super(lVar, r0Var, p0Var, str);
            this.f14880f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: j */
        public void b(w5.e eVar) {
            w5.e.d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0
        /* renamed from: k */
        public Map<String, String> i(w5.e eVar) {
            return y3.g.of("createdThumbnail", Boolean.toString(eVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: l */
        public w5.e c() throws Exception {
            ExifInterface g10 = LocalExifThumbnailProducer.this.g(this.f14880f.q());
            if (g10 == null || !g10.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f14878b.d((byte[]) y3.k.g(g10.getThumbnail())), g10);
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f14882a;

        b(LocalExifThumbnailProducer localExifThumbnailProducer, w0 w0Var) {
            this.f14882a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f14882a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, b4.h hVar, ContentResolver contentResolver) {
        this.f14877a = executor;
        this.f14878b = hVar;
        this.f14879c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w5.e e(b4.g gVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> a10 = com.facebook.imageutils.a.a(new b4.i(gVar));
        int h10 = h(exifInterface);
        int intValue = a10 != null ? ((Integer) a10.first).intValue() : -1;
        int intValue2 = a10 != null ? ((Integer) a10.second).intValue() : -1;
        c4.a L = c4.a.L(gVar);
        try {
            w5.e eVar = new w5.e(L);
            c4.a.w(L);
            eVar.Q0(com.facebook.imageformat.b.f14800a);
            eVar.T0(h10);
            eVar.X0(intValue);
            eVar.N0(intValue2);
            return eVar;
        } catch (Throwable th) {
            c4.a.w(L);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return com.facebook.imageutils.c.a(Integer.parseInt((String) y3.k.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean a(q5.e eVar) {
        return e1.b(AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH, eVar);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        r0 h10 = p0Var.h();
        b6.b k10 = p0Var.k();
        p0Var.e(ImagesContract.LOCAL, "exif");
        a aVar = new a(lVar, h10, p0Var, "LocalExifThumbnailProducer", k10);
        p0Var.c(new b(this, aVar));
        this.f14877a.execute(aVar);
    }

    boolean f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String b10 = g4.f.b(this.f14879c, uri);
        if (b10 == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            z3.a.f(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(b10)) {
            return new ExifInterface(b10);
        }
        AssetFileDescriptor a10 = g4.f.a(this.f14879c, uri);
        if (a10 != null && Build.VERSION.SDK_INT >= 24) {
            ExifInterface a11 = new Api24Utils(this, null).a(a10.getFileDescriptor());
            a10.close();
            return a11;
        }
        return null;
    }
}
