package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes2.dex */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20429a;

    public f(d dVar) {
        this.f20429a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar = this.f20429a;
        if (dVar.G == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(dVar));
                this.f20429a.G = new d.i();
                if (this.f20429a.g() != null) {
                    d dVar2 = this.f20429a;
                    d<T>.i iVar = dVar2.G;
                    Context g10 = dVar2.g();
                    d dVar3 = d.this;
                    dVar3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(dVar3));
                    iVar.f20423a = g10;
                    g10.registerReceiver(iVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e10) {
                d dVar4 = this.f20429a;
                dVar4.getClass();
                IAlog.e("%sfailed registering orientation broadcast recevier", IAlog.a(dVar4));
                if (IAlog.f20222a >= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
