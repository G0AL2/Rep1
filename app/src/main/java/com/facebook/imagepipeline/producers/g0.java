package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalResourceFetchProducer.java */
/* loaded from: classes.dex */
public class g0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final Resources f14958c;

    public g0(Executor executor, b4.h hVar, Resources resources) {
        super(executor, hVar);
        this.f14958c = resources;
    }

    private int g(b6.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f14958c.openRawResourceFd(h(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int h(b6.b bVar) {
        return Integer.parseInt(bVar.q().getPath().substring(1));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        return e(this.f14958c.openRawResource(h(bVar)), g(bVar));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}
