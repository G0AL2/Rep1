package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.ev;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: GifMovieObject.java */
/* loaded from: classes3.dex */
public final class ew implements ev {

    /* renamed from: b  reason: collision with root package name */
    private Movie f25305b;

    /* renamed from: c  reason: collision with root package name */
    private long f25306c;

    /* renamed from: e  reason: collision with root package name */
    private ev.a f25308e;

    /* renamed from: a  reason: collision with root package name */
    int f25304a = 0;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f25307d = false;

    public ew(String str) throws IOException {
        File file = new File(str);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            hv.a((Closeable) fileInputStream);
            Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
            this.f25305b = decodeByteArray;
            if (decodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th) {
            hv.a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Override // com.inmobi.media.ev
    public final void a() {
    }

    @Override // com.inmobi.media.ev
    public final void a(boolean z10) {
        this.f25307d = z10;
        if (!this.f25307d) {
            this.f25306c = SystemClock.uptimeMillis() - this.f25304a;
        }
        ev.a aVar = this.f25308e;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.inmobi.media.ev
    public final int b() {
        return this.f25305b.width();
    }

    @Override // com.inmobi.media.ev
    public final int c() {
        return this.f25305b.height();
    }

    @Override // com.inmobi.media.ev
    public final boolean d() {
        return !this.f25307d;
    }

    @Override // com.inmobi.media.ev
    public final void e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f25306c == 0) {
            this.f25306c = uptimeMillis;
        }
        int duration = this.f25305b.duration();
        if (duration == 0) {
            duration = 1000;
        }
        int i10 = (int) ((uptimeMillis - this.f25306c) % duration);
        this.f25304a = i10;
        this.f25305b.setTime(i10);
    }

    @Override // com.inmobi.media.ev
    public final void a(Canvas canvas, float f10, float f11) {
        this.f25305b.draw(canvas, f10, f11);
        if (this.f25304a + 20 >= this.f25305b.duration()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ew.1
                @Override // java.lang.Runnable
                public final void run() {
                    ew ewVar = ew.this;
                    ewVar.f25304a = 0;
                    ewVar.a(false);
                }
            });
        }
    }

    @Override // com.inmobi.media.ev
    public final void a(ev.a aVar) {
        this.f25308e = aVar;
    }
}
