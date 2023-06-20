package com.fyber.inneractive.sdk.player.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f19800a;

    public j(i iVar) {
        this.f19800a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        i iVar = this.f19800a;
        ViewGroup viewGroup = iVar.f19789y;
        if (viewGroup == null || viewGroup.getParent() == null) {
            return;
        }
        ((View) iVar.f19789y.getParent()).setOnTouchListener(null);
    }
}
