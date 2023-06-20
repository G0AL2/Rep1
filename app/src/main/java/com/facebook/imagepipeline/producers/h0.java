package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.android.gms.common.internal.ImagesContract;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: LocalVideoThumbnailProducer.java */
/* loaded from: classes.dex */
public class h0 implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14965a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f14966b;

    /* compiled from: LocalVideoThumbnailProducer.java */
    /* loaded from: classes.dex */
    class a extends w0<c4.a<w5.c>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0 f14967f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p0 f14968g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b6.b f14969h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, r0 r0Var2, p0 p0Var2, b6.b bVar) {
            super(lVar, r0Var, p0Var, str);
            this.f14967f = r0Var2;
            this.f14968g = p0Var2;
            this.f14969h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        public void e(Exception exc) {
            super.e(exc);
            this.f14967f.b(this.f14968g, "VideoThumbnailProducer", false);
            this.f14968g.g(ImagesContract.LOCAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: j */
        public void b(c4.a<w5.c> aVar) {
            c4.a.w(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0
        /* renamed from: k */
        public Map<String, String> i(c4.a<w5.c> aVar) {
            return y3.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: l */
        public c4.a<w5.c> c() throws Exception {
            String str;
            try {
                str = h0.this.i(this.f14969h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, h0.g(this.f14969h)) : h0.h(h0.this.f14966b, this.f14969h.q());
            if (createVideoThumbnail == null) {
                return null;
            }
            w5.d dVar = new w5.d(createVideoThumbnail, o5.h.b(), w5.i.f38227d, 0);
            this.f14968g.b("image_format", "thumbnail");
            dVar.h(this.f14968g.getExtras());
            return c4.a.L(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        /* renamed from: m */
        public void f(c4.a<w5.c> aVar) {
            super.f(aVar);
            this.f14967f.b(this.f14968g, "VideoThumbnailProducer", aVar != null);
            this.f14968g.g(ImagesContract.LOCAL);
        }
    }

    /* compiled from: LocalVideoThumbnailProducer.java */
    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f14971a;

        b(h0 h0Var, w0 w0Var) {
            this.f14971a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f14971a.a();
        }
    }

    public h0(Executor executor, ContentResolver contentResolver) {
        this.f14965a = executor;
        this.f14966b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(b6.b bVar) {
        return (bVar.i() > 96 || bVar.h() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1L);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(b6.b bVar) {
        Uri uri;
        String str;
        String[] strArr;
        Uri q10 = bVar.q();
        if (g4.f.j(q10)) {
            return bVar.p().getPath();
        }
        if (g4.f.i(q10)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(q10.getAuthority())) {
                uri = q10;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(q10);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f14966b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        r0 h10 = p0Var.h();
        b6.b k10 = p0Var.k();
        p0Var.e(ImagesContract.LOCAL, DownloadResource.TYPE_VIDEO);
        a aVar = new a(lVar, h10, p0Var, "VideoThumbnailProducer", h10, p0Var, k10);
        p0Var.c(new b(this, aVar));
        this.f14965a.execute(aVar);
    }
}
