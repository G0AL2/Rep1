package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* loaded from: classes2.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20432a;

    public i(d dVar, String str) {
        this.f20432a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.l.f20301a, this.f20432a, 0).show();
    }
}
