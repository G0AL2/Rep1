package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* compiled from: BitmapDetector.java */
/* loaded from: classes3.dex */
public class jg {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25849b = "jg";

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f25850a;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<a> f25851c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25852d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25853e = false;

    /* compiled from: BitmapDetector.java */
    /* loaded from: classes3.dex */
    public interface a {
        void j();

        void k();
    }

    public jg(View view, a aVar) {
        this.f25851c = new WeakReference<>(aVar);
        this.f25850a = new WeakReference<>(view);
    }

    static /* synthetic */ boolean c(jg jgVar) {
        jgVar.f25852d = true;
        return true;
    }

    static /* synthetic */ boolean e(jg jgVar) {
        jgVar.f25853e = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(final View view) throws IllegalStateException {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            final Canvas canvas = new Canvas(createBitmap);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            view.post(new Runnable() { // from class: com.inmobi.media.jg.3
                @Override // java.lang.Runnable
                public final void run() {
                    view.draw(canvas);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
            return createBitmap;
        }
        throw new IllegalStateException();
    }
}
