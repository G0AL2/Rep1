package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class h implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20431a;

    public h(d dVar) {
        this.f20431a = dVar;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f20431a.h()) {
            IAlog.d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            this.f20431a.f();
            return true;
        }
        return false;
    }
}
