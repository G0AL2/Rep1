package com.inmobi.media;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.inmobi.media.ev;
import java.io.File;
import java.io.IOException;

/* compiled from: AnimatedDrawable.java */
/* loaded from: classes3.dex */
public final class et implements ev {

    /* renamed from: a  reason: collision with root package name */
    AnimatedImageDrawable f25288a;

    /* renamed from: b  reason: collision with root package name */
    private ev.a f25289b;

    @SuppressLint({"NewApi"})
    public et(String str) throws IOException {
        this.f25288a = (AnimatedImageDrawable) ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(str)));
    }

    @Override // com.inmobi.media.ev
    @SuppressLint({"NewApi"})
    public final void a() {
        this.f25288a.registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: com.inmobi.media.et.1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                et.this.f25288a.start();
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
            }
        });
        this.f25288a.start();
    }

    @Override // com.inmobi.media.ev
    public final void a(boolean z10) {
    }

    @Override // com.inmobi.media.ev
    public final int b() {
        return this.f25288a.getIntrinsicWidth();
    }

    @Override // com.inmobi.media.ev
    public final int c() {
        return this.f25288a.getIntrinsicHeight();
    }

    @Override // com.inmobi.media.ev
    public final boolean d() {
        return this.f25288a.isRunning();
    }

    @Override // com.inmobi.media.ev
    public final void e() {
    }

    @Override // com.inmobi.media.ev
    public final void a(Canvas canvas, float f10, float f11) {
        canvas.translate(f10, f11);
        this.f25288a.draw(canvas);
    }

    @Override // com.inmobi.media.ev
    public final void a(ev.a aVar) {
        this.f25289b = aVar;
    }
}
