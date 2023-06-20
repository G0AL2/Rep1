package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.player.controller.s;

/* loaded from: classes.dex */
public interface b<ListenerT extends s> {
    void a(long j10);

    void a(Bitmap bitmap);

    void a(ListenerT listenert);

    void b(int i10);

    void c(boolean z10);

    boolean c();

    void d(boolean z10);

    void destroy();

    void f();

    void pauseVideo();
}
