package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes2.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.c f20433a;

    public j(d.c cVar) {
        this.f20433a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar = d.this;
        dVar.getClass();
        com.fyber.inneractive.sdk.util.n.f20310b.post(new i(dVar, "Image failed to download."));
        d.this.a(com.fyber.inneractive.sdk.mraid.f.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
