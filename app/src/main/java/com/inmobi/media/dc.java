package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* compiled from: MraidResizeProcessor.java */
/* loaded from: classes3.dex */
public final class dc {

    /* renamed from: a  reason: collision with root package name */
    public q f25088a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f25089b;

    /* renamed from: c  reason: collision with root package name */
    public int f25090c;

    public dc(q qVar) {
        this.f25088a = qVar;
    }

    private void b() {
        if (this.f25089b != null) {
            FrameLayout frameLayout = new FrameLayout(this.f25088a.getContainerContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f25088a.getWidth(), this.f25088a.getHeight());
            frameLayout.setId(i.f25718a);
            this.f25089b.addView(frameLayout, this.f25090c, layoutParams);
            this.f25089b.removeView(this.f25088a);
        }
    }

    public final void a() {
        if (this.f25089b == null) {
            ViewGroup viewGroup = (ViewGroup) this.f25088a.getParent();
            this.f25089b = viewGroup;
            this.f25090c = viewGroup.indexOfChild(this.f25088a);
        }
        de resizeProperties = this.f25088a.getResizeProperties();
        b();
        a(resizeProperties);
    }

    private void a(de deVar) {
        float f10 = ic.a().f25747c;
        int i10 = (int) ((deVar.width * f10) + 0.5f);
        int i11 = (int) ((deVar.height * f10) + 0.5f);
        ViewGroup viewGroup = this.f25089b;
        View rootView = viewGroup == null ? null : viewGroup.getRootView();
        if (rootView != null) {
            FrameLayout frameLayout = (FrameLayout) rootView.findViewById(16908290);
            FrameLayout frameLayout2 = new FrameLayout(this.f25088a.getContainerContext());
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RelativeLayout relativeLayout = new RelativeLayout(this.f25088a.getContainerContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i11);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i10, i11);
            frameLayout2.setId(i.f25719b);
            ViewGroup viewGroup2 = this.f25088a.getParent() instanceof ViewGroup ? (ViewGroup) this.f25088a.getParent() : null;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            relativeLayout.addView(this.f25088a, layoutParams3);
            a(relativeLayout, deVar.customClosePosition);
            frameLayout2.addView(relativeLayout, layoutParams2);
            frameLayout.addView(frameLayout2, layoutParams);
            a(frameLayout, frameLayout2, deVar, this.f25089b);
            frameLayout2.setBackgroundColor(0);
            return;
        }
        hu.a((byte) 1, dc.class.getSimpleName(), "Couldn't process resize request as root view was found null.");
    }

    private void a(ViewGroup viewGroup, String str) {
        float f10 = ic.a().f25747c;
        cp cpVar = new cp(this.f25088a.getContainerContext(), f10, (byte) 1);
        cpVar.setId(i.f25721d);
        cpVar.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.dc.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dc.this.f25088a.b();
            }
        });
        viewGroup.addView(cpVar, a(str, f10));
    }

    private static RelativeLayout.LayoutParams a(String str, float f10) {
        String a10 = a(str);
        int i10 = (int) (f10 * 50.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        if (de.DEFAULT_POSITION.equals(a10) || "bottom-right".equals(a10)) {
            layoutParams.addRule(11);
        }
        if ("bottom-right".equals(a10) || "bottom-left".equals(a10) || "bottom-center".equals(a10)) {
            layoutParams.addRule(12);
            layoutParams.addRule(4);
        }
        if ("bottom-center".equals(a10) || "top-center".equals(a10) || "center".equals(a10)) {
            layoutParams.addRule(13);
        }
        if ("top-center".equals(a10)) {
            layoutParams.addRule(10);
        }
        return layoutParams;
    }

    private static String a(String str) {
        return (str == null || str.length() == 0) ? de.DEFAULT_POSITION : ("top-left".equals(str) || de.DEFAULT_POSITION.equals(str) || "bottom-left".equals(str) || "bottom-right".equals(str) || "top-center".equals(str) || "bottom-center".equals(str) || "center".equals(str)) ? str : de.DEFAULT_POSITION;
    }

    private static void a(FrameLayout frameLayout, FrameLayout frameLayout2, de deVar, ViewGroup viewGroup) {
        float f10 = ic.a().f25747c;
        int i10 = (int) ((deVar.width * f10) + 0.5f);
        int i11 = (int) ((deVar.height * f10) + 0.5f);
        int i12 = (int) ((deVar.offsetY * f10) + 0.5f);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(r5);
        frameLayout.getLocationOnScreen(iArr);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        iArr2[0] = iArr2[0] + ((int) ((deVar.offsetX * f10) + 0.5f));
        iArr2[1] = iArr2[1] + i12;
        if (!deVar.allowOffscreen.booleanValue()) {
            if (i10 > frameLayout.getWidth() - iArr2[0]) {
                iArr2[0] = frameLayout.getWidth() - i10;
            }
            if (i11 > frameLayout.getHeight() - iArr2[1]) {
                iArr2[1] = frameLayout.getHeight() - i11;
            }
            if (iArr2[0] < 0) {
                iArr2[0] = 0;
            }
            if (iArr2[1] < 0) {
                iArr2[1] = 0;
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = iArr2[0];
        layoutParams.topMargin = iArr2[1];
        layoutParams.gravity = 8388611;
        frameLayout2.setLayoutParams(layoutParams);
    }
}
