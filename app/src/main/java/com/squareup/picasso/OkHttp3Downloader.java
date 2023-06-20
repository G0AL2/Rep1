package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import ye.b0;
import ye.c;
import ye.d0;
import ye.e;
import ye.z;

/* loaded from: classes3.dex */
public final class OkHttp3Downloader implements Downloader {
    private final c cache;
    final e.a client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public d0 load(b0 b0Var) throws IOException {
        return this.client.a(b0Var).h();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        c cVar;
        if (this.sharedClient || (cVar = this.cache) == null) {
            return;
        }
        try {
            cVar.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    public OkHttp3Downloader(File file, long j10) {
        this(new z.a().d(new c(file, j10)).c());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(z zVar) {
        this.sharedClient = true;
        this.client = zVar;
        this.cache = zVar.f();
    }

    public OkHttp3Downloader(e.a aVar) {
        this.sharedClient = true;
        this.client = aVar;
        this.cache = null;
    }
}
