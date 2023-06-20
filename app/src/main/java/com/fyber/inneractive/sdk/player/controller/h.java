package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f17908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f17909b;

    public h(g gVar, boolean z10) {
        this.f17909b = gVar;
        this.f17908a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f17909b;
        if (gVar.f17893g) {
            return;
        }
        try {
            List<g.f> list = gVar.f17888b;
            if (list != null) {
                for (g.f fVar : list) {
                    fVar.e(this.f17908a);
                }
            }
        } catch (Exception unused) {
            if (IAlog.f20222a <= 3) {
                g gVar2 = this.f17909b;
                gVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", IAlog.a(gVar2));
            }
        }
    }
}
