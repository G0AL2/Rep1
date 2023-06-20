package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o3.c;
import p3.b;

/* loaded from: classes.dex */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, a {

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<b> f9197d = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<p3.a> f9198a;

    /* renamed from: b  reason: collision with root package name */
    private b f9199b;

    /* renamed from: c  reason: collision with root package name */
    private a.InterfaceC0141a f9200c;

    public SSRenderSurfaceView(Context context) {
        super(context);
        c.h("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
        b();
    }

    private void b() {
        b bVar = new b(this);
        this.f9199b = bVar;
        f9197d.add(bVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public void a(p3.a aVar) {
        this.f9198a = new WeakReference<>(aVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<b> it = f9197d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null && next.a() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f9199b);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        a.InterfaceC0141a interfaceC0141a = this.f9200c;
        if (interfaceC0141a != null) {
            interfaceC0141a.a(i10);
        }
    }

    public void setWindowVisibilityChangedListener(a.InterfaceC0141a interfaceC0141a) {
        this.f9200c = interfaceC0141a;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        c.h("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference<p3.a> weakReference = this.f9198a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9198a.get().a(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<p3.a> weakReference = this.f9198a;
        if (weakReference != null && weakReference.get() != null) {
            this.f9198a.get().a(surfaceHolder);
        }
        c.h("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c.h("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference<p3.a> weakReference = this.f9198a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9198a.get().b(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.a
    public void a(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
