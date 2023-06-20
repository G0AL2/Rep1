package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.a;
import o3.c;

/* loaded from: classes.dex */
public class SSRenderTextureView extends TextureView implements TextureView.SurfaceTextureListener, a {

    /* renamed from: a  reason: collision with root package name */
    private p3.a f9201a;

    /* renamed from: b  reason: collision with root package name */
    private a.InterfaceC0141a f9202b;

    public SSRenderTextureView(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public void a(p3.a aVar) {
        this.f9201a = aVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            th.printStackTrace();
            if (c.k()) {
                c.i("CSJ_VIDEO_TextureView", "rethrow exception for debug & local_test, (TextureView)", th);
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        c.h("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        p3.a aVar = this.f9201a;
        if (aVar != null) {
            aVar.a(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c.h("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        p3.a aVar = this.f9201a;
        if (aVar != null) {
            return aVar.a(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c.h("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
        p3.a aVar = this.f9201a;
        if (aVar != null) {
            aVar.b(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        p3.a aVar = this.f9201a;
        if (aVar != null) {
            aVar.b(surfaceTexture);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        a.InterfaceC0141a interfaceC0141a = this.f9202b;
        if (interfaceC0141a != null) {
            interfaceC0141a.a(i10);
        }
    }

    public void setWindowVisibilityChangedListener(a.InterfaceC0141a interfaceC0141a) {
        this.f9202b = interfaceC0141a;
    }

    public SSRenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public void a(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
