package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f17910a;

    public i(g gVar) {
        this.f17910a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            List<g.f> list = this.f17910a.f17888b;
            if (list != null) {
                for (g.f fVar : list) {
                    fVar.e();
                }
            }
        } catch (Exception e10) {
            if (IAlog.f20222a <= 3) {
                g gVar = this.f17910a;
                gVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", IAlog.a(gVar));
                e10.printStackTrace();
            }
        }
    }
}
