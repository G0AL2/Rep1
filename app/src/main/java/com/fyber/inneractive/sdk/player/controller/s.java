package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes.dex */
public interface s {
    d0.a a(p0 p0Var, com.fyber.inneractive.sdk.util.e eVar);

    d0.a a(String str, p0 p0Var);

    void a(View view, String str);

    void a(String str, String str2);

    void a(boolean z10);

    void a(boolean z10, Orientation orientation);

    void e();

    void g();

    void h();

    void j();

    void k();

    void l();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i10, int i11);

    void r();
}
