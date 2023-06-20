package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.g f17946a;

    /* renamed from: b  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f17947b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17949d = false;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f17948c = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.getClass();
            IAlog.a("player progress monitor: run started", new Object[0]);
            int c10 = eVar.f17946a.c();
            if (!eVar.f17949d) {
                int i10 = c10 + 0;
                IAlog.a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(i10));
                if (i10 >= 2000) {
                    IAlog.a("run: setting played 2 seconds flag", new Object[0]);
                    eVar.f17949d = true;
                }
            }
            eVar.f17946a.a(c10);
        }
    }

    public e(com.fyber.inneractive.sdk.player.controller.g gVar) {
        this.f17946a = gVar;
    }
}
