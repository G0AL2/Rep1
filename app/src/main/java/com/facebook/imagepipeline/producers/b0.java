package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalAssetFetchProducer.java */
/* loaded from: classes.dex */
public class b0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final AssetManager f14907c;

    public b0(Executor executor, b4.h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f14907c = assetManager;
    }

    private static String g(b6.b bVar) {
        return bVar.q().getPath().substring(1);
    }

    private int h(b6.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f14907c.openFd(g(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
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

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        return e(this.f14907c.open(g(bVar), 2), h(bVar));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}
